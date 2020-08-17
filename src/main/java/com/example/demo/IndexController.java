package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * index 控制器
 * @author liyulong
 * @date 2020-08-11 4:13 下午
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    private static final String WC_MSG = "welcome to index page";
    /**
     * 首页欢迎
     * @return 欢迎提示语
     */
    @GetMapping("/wc")
    public String welcome(){
        return WC_MSG;
    }

    /**
     * 带参欢迎语
     * @param msg 追加消息串
     * @return
     */
    @GetMapping("/wc/{msg}")
    public String welcome(@PathVariable String msg){
        return WC_MSG + ",msg";
    }


}
