package com.wenyao.springanaylize.demo;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import com.wenyao.springanaylize.service.CycleA;

public class DefaultResourceLoaderDemo {
    /**
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        defaultResourceLoader.addProtocolResolver((location, loader) -> new ClassPathResource(location));
        Resource classPathResource = defaultResourceLoader.getResource("application.properties");
        InputStream inputStream = classPathResource.getInputStream();
        System.out.println(StreamUtils.copyToString(inputStream, Charset.forName("UTF-8")));
        new AnnotationConfigApplicationContext(CycleA.class);
    }
}
