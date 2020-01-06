package com.wenyao.springanaylize.service;

import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

public class HeapTest {

    @Data
    @AllArgsConstructor
    private static final class User implements Serializable {
        private Long id;
        private String name;
    }

    public static void main(String[] args) {
        User user = new User(1L, "wenyao");
        User user1 = ObjectUtil.clone(user);
        user1.setId(2L);
        user1.setName("hahaha");
        System.out.println(user);
        System.out.println(user1);
    }
}
