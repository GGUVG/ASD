package com.demo.asd.service.bizs.house.forSale;

import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.excel.EasyExcelUtils;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientRequest;
import com.demo.asd.model.house.forSale.HouseSaleWithOwnerClientResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.demo.asd.model.house.report.HouseSourceApproveRequest;
import com.demo.asd.pagination.*;
import com.demo.asd.service.services.house.forSale.HouseSaleService;
import com.demo.asd.support.model.po.house.forSale.*;
import com.demo.asd.support.model.po.house.report.HouseSourceApproveBean;
import com.demo.asd.support.model.po.staff.StaffCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 调用asd-service模块/houseSaleService
 * 有关售房业务逻辑处理
 * Created by chency on 2020-05-14.
 */
@Component
public class HouseSaleBiz extends BaseBiz<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria, HouseSaleWithOwnerClientRequest, HouseSaleWithOwnerClientResponse> {
    @Autowired
    public HouseSaleService houseSaleService;

    public PagingResponse<HouseSaleWithOwnerClientResponse> findPageHouseForSale(PagingRequest<HouseSaleWithOwnerClientRequest> pag, HttpServletRequest hReq) throws IllegalAccessException, InstantiationException, UnsupportedEncodingException {
        HouseSaleWithOwnerClientCriteria criteria=BeanUtils.copy(pag.getCriteria(), this.criteriaClass);
        Cookie[] cookies=hReq.getCookies();
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))//if(checkStr==cookie.getName())判断会失败,String类型别用==
            {
            String str1=URLDecoder.decode(cookie.getValue(), "UTF-8");
            JSONObject jsonObject = JSONObject.parseObject(str1);
            StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
            criteria.setClientStaffId(staffCriteria.getStaffId());
            }
        }
        Pagination pagination =BeanUtils.copy(pag.getPagination(), Pagination.class);
        criteria.setTypeCode("HOUSE_TYPE");
        List<HouseSaleWithOwnerClientBean> beans=houseSaleService.findPageHouseForSale(criteria,pagination);
        long count=houseSaleService.CountfindPageHouseForSale(criteria);
        PagingResponse<HouseSaleWithOwnerClientResponse> response = PageConverter.convert(pagination, HouseSaleWithOwnerClientResponse.class, count, beans);
        return response;
    }

    public String exportFindPageHouseForSale(HttpServletResponse hRep,HttpServletRequest hReq, HouseSaleWithOwnerClientRequest condition) throws UnsupportedEncodingException
    {
        Cookie[] cookies=hReq.getCookies();
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))
            {
                String str1=URLDecoder.decode(cookie.getValue(), "UTF-8");
                JSONObject jsonObject = JSONObject.parseObject(str1);
                StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
                condition.setClientStaffId(staffCriteria.getStaffId());
            }
        }
        condition.setTypeCode("HOUSE_TYPE");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        List<HouseSaleWithOwnerClientBean> beans=houseSaleService.findHouseForSale(condition);
        List<HouseSaleWithOwnerClientExcelBean> reportBeans=BeanUtils.copyList(beans, HouseSaleWithOwnerClientExcelBean.class);
        for(int i=0;i<beans.size();i++)
        {
            HouseSaleWithOwnerClientBean hB=beans.get(i);
            LocalDateTime time1= hB.getDealTime();
            if(time1 !=null)
            {
                HouseSaleWithOwnerClientExcelBean hRB =reportBeans.get(i);
                hRB.setDealTime(df.format(time1));
            }
        }
        Map<String, List<? extends BaseRowModel>> map = new HashMap<>();
        map.put("HouseSaleWithClient", reportBeans);
        String fileName = new String(("买卖房源消息" + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).getBytes(), "UTF-8");
        EasyExcelUtils.createExcelStreamMutilByEaysExcel(hRep,fileName, map, ExcelTypeEnum.XLSX);
        return fileName;
    }

    @Transactional
    public Integer reportNewSource(HouseSourceApproveRequest request, HttpServletRequest hReq) throws IOException {
        HouseSourceApproveBean bean=BeanUtils.copy(request,HouseSourceApproveBean.class);
        Cookie[] cookies=hReq.getCookies();
        for(Cookie cookie:cookies)
        {
            String checkStr="backStaffCookie";
            if(checkStr.equals(cookie.getName()))
            {
                String str1=URLDecoder.decode(cookie.getValue(), "UTF-8");
                JSONObject jsonObject = JSONObject.parseObject(str1);
                StaffCriteria staffCriteria=JSONObject.parseObject(jsonObject.toJSONString(),new TypeReference<StaffCriteria>() {});
                bean.setStaffId(staffCriteria.getStaffId());
                bean.setHangTypeTxt("出售");
            }
        }

        return(houseSaleService.reportNewSource(bean));
    }

    /**
     * 上传文件
     * @param multipartFile
     * @return
     * @throws IOException
     */
    public String uploadHouseSaleFile(MultipartFile multipartFile,String houseLocationProvince,
    String houseLocationCity,String houseLocationDistrict,String houseLocationStreet,Long staffId,String staffUsername) throws IOException
    {
        int lastIndexOf = houseLocationProvince.lastIndexOf("/");
        String addPathProvince = houseLocationProvince.substring(lastIndexOf + 1, houseLocationProvince.length());
        String addPathCity = houseLocationCity.substring(lastIndexOf + 1, houseLocationCity.length());
        String addPathDistrict = houseLocationDistrict.substring(lastIndexOf + 1, houseLocationDistrict.length());
        String addPathStreet = houseLocationStreet.substring(lastIndexOf + 1, houseLocationStreet.length());
        String path = "E:/Work/SoftWare/IntelliJ IDEA 2019.2.3/WorkSpace/ASD/ASD-upload/house/forSale/"+ addPathProvince + "/" + addPathCity + "/" + addPathDistrict + "/" + addPathStreet;
        String filename = multipartFile.getOriginalFilename();
        String fileExtension = StringUtils.substringAfter(multipartFile.getOriginalFilename() , ".");//文件原始扩展名
        int unixSep = filename.lastIndexOf('/');
        int winSep = filename.lastIndexOf('\\');
        int pos = (winSep > unixSep ? winSep : unixSep);
        if (pos != -1)
        {filename = filename.substring(pos + 1);}
        filename=filename.replace(filename, staffId+staffUsername+"."+fileExtension);
        File filepath = new File(path, filename);
        if (!filepath.getParentFile().exists())
        {filepath.getParentFile().mkdirs();}
        multipartFile.transferTo(new File(path + File.separator + filename));
        return "success";
    }

    /**
     * 删除上传文件目录的指定文件
     * 暂时废弃,交由前端fileList[]解决
     * @param filePath
     * @return
     * @throws IOException
     */
    public String delHouseSaleFile(String filePath) throws IOException
    {
        String resultInfo = null;
        int lastIndexOf = filePath.lastIndexOf("/");
        String file_path = filePath.substring(lastIndexOf + 1, filePath.length());
        file_path = "E:/Work/SoftWare/IntelliJ IDEA 2019.2.3/WorkSpace/ASD/ASD-upload/house/forSale/" + file_path;
        File file = new File(file_path);
        if (file.exists()) {//文件是否存在
            if (file.delete()) {//存在就删了，返回1
                resultInfo =  "1";
            } else {
                resultInfo =  "0";
            }
        } else {
            resultInfo = "文件不存在！";
        }
        return resultInfo;
    }

    @Override
    public BaseService<Long, HouseSaleWithOwnerClientBean, HouseSaleWithOwnerClientCriteria> getService() {
        return houseSaleService;
    }
}
