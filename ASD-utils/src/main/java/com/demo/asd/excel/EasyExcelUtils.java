package com.demo.asd.excel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.demo.asd.beanUtils.BeanUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class EasyExcelUtils {

        private static Logger log = LoggerFactory.getLogger(EasyExcelUtils.class);

        public static void createExcelStreamMutilByEaysExcel(HttpServletResponse response, String fileName, Map<String, List<? extends BaseRowModel>> SheetNameAndDateList, ExcelTypeEnum type) throws UnsupportedEncodingException {
            if (checkParam(SheetNameAndDateList, type)) return;
            ServletOutputStream out = null;
            try {
                response.setContentType("application/octet-stream;charset=utf-8");
                response.setCharacterEncoding("utf-8");
                response.addHeader("Content-disposition","Content-disposition");
                String name = java.net.URLEncoder.encode(fileName+type.getValue(), "UTF-8");
                response.addHeader("filename",    name);
                out = response.getOutputStream();
                ExcelWriter writer = new ExcelWriter(out, type, true);
                setSheet(SheetNameAndDateList, writer);
                writer.finish();
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                IOUtils.closeQuietly(out);
            }
        }


        private static boolean checkParam(Map<String, List<? extends BaseRowModel>> SheetNameAndDateList, ExcelTypeEnum type) {
            if (CollectionUtils.isEmpty(SheetNameAndDateList)) {
                return true;
            } else if (type == null) {
                return true;
            }
            return false;
        }

        private static void setSheet(Map<String, List<? extends BaseRowModel>> SheetNameAndDateList, ExcelWriter writer) {
            int sheetNum = 1;
            for (Map.Entry<String, List<? extends BaseRowModel>> stringListEntry : SheetNameAndDateList.entrySet()) {
                Sheet sheet = new Sheet(sheetNum, 0, stringListEntry.getValue().get(0).getClass());
                sheet.setSheetName(stringListEntry.getKey());
                writer.write(stringListEntry.getValue(), sheet);
                sheetNum++;
            }
        }

        /**
         *
         * @param stream
         * @param Clazz 对应Excel文件bean
         * @param cla    输出 Bean
         * @return
         * @throws Exception
         */
        public static  <T> List<T>  readExcel(InputStream stream, Class<? extends BoRowModel> Clazz, Class<T> cla) throws Exception {
            try {
                Sheet sheet = new Sheet(1, 1, Clazz);
                //读sheet表中的内容
                List<Object> objects = EasyExcelFactory.read(stream, sheet);
                T t = BeanUtils.instantiate(cla);
                List<T> items = new ArrayList<>();
                for (Object item : objects) {
                    items.add((T) item);
                }
                return items;
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            } finally {
                IOUtils.closeQuietly(stream);
            }
        }
}
