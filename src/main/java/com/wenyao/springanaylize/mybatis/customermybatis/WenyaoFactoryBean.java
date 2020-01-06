package com.wenyao.springanaylize.mybatis.customermybatis;

import org.springframework.beans.factory.FactoryBean;

public class WenyaoFactoryBean implements FactoryBean {

    Class mapperInterface;

    @Override
    public Object getObject() throws Exception {
        return WenyaoSession.queryMapper(mapperInterface);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    public void setMapperInterface(Class mapperInterface) {
        this.mapperInterface = mapperInterface;
    }
}
