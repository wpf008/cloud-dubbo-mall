package com.cloud.mall.model;

import lombok.Data;

import java.io.Serializable;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 下午4:59
 * Description: No Description
 */
@Data
public class User implements Serializable {

    private String id;

    private String name;

    private String age;
}
