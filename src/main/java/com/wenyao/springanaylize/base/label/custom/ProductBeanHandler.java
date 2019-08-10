package com.wenyao.springanaylize.base.label.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ProductBeanHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("product", new ProductBeanDefinitionParser());
    }
}
