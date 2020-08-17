package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liyulong
 * @date 2020-08-17 7:44 下午
 */
@Data
@AllArgsConstructor
public class Result<T> {

    private int code;

    private String msg;

    private T data;
}
