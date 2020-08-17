package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 消息请求体
 * @author liyulong
 * @date 2020-08-17 7:43 下午
 */
@Data
@AllArgsConstructor
public class MsgDto {
    /**
     * 消息
     */
    private String msg;

    /**
     * 标题
     */
    private String title;
}
