package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

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

    /**
     *  model参数
     * @param dto
     * @return
     */
    @PostMapping("/wc")
    public Result<DataDto> welcome(@RequestBody MsgDto dto){
        System.out.println(dto.getMsg());
        System.out.println(dto.getTitle());

        return new Result<>(200,"",new DataDto("zs","you are welcome"));

    }


}
