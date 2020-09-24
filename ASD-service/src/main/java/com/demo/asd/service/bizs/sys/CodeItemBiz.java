package com.demo.asd.service.bizs.sys;

import com.demo.asd.base.hierarchies.BaseBiz;
import com.demo.asd.base.hierarchies.BaseService;
import com.demo.asd.beanUtils.BeanUtils;
import com.demo.asd.model.sys.CodeItemRequest;
import com.demo.asd.model.sys.CodeItemResponse;
import com.demo.asd.service.services.sys.CodeItemService;
import com.demo.asd.support.model.po.sys.CodeItemBean;
import com.demo.asd.support.model.po.sys.CodeItemCriteria;
import com.demo.asd.support.model.po.sys.CodeItemPkBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CodeItemBiz extends BaseBiz<CodeItemPkBean, CodeItemBean, CodeItemCriteria, CodeItemRequest, CodeItemResponse>
{
    @Autowired
    public CodeItemService codeItemService;

    public List<CodeItemBean> getCodeItemList(CodeItemRequest request)
    {
        CodeItemCriteria criteria= BeanUtils.copy(request, CodeItemCriteria.class);
        return codeItemService.getCodeItemList(criteria);
    }

    @Override
    public BaseService getService() {
        return null;
    }
}
