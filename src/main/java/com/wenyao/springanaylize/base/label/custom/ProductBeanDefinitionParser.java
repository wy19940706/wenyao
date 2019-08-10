package com.wenyao.springanaylize.base.label.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import cn.hutool.core.util.ObjectUtil;

public class ProductBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Product.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String productId = element.getAttribute("productId");
        String productName = element.getAttribute("productName");
        if (ObjectUtil.isNotNull(productId)) {
            builder.addPropertyValue("productId", Long.valueOf(productId));
        }
        if (StringUtils.hasText(productName)) {
            builder.addPropertyValue("productName", productName);
        }
    }
}
