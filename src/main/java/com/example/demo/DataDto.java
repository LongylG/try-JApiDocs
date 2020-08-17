package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 数据响应体
 * @author liyulong
 * @date 2020-08-17 7:46 下午
 */
@Data
@AllArgsConstructor
public class DataDto {

    /**
     * 姓名
     */
    private String name;

    /**
     * 提示
     */
    private String tips;
}
