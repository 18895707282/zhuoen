package com.zhuoran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户名
     */
    private String name;
    /**
     * 年龄
     */
    private String age;
    /**
     * 手机号
     */
    private String phone;
}
