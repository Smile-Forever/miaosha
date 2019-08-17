package zxbv.online.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zxbv.online.miaosha.domain.User;
import zxbv.online.miaosha.result.CodeMsg;
import zxbv.online.miaosha.result.Result;
import zxbv.online.miaosha.service.UserService;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/17 15:24
 * @Version 1.0
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","Mike");
        return "hello";
    }

    @RequestMapping("/hello")
    public @ResponseBody Result<User> getById(){
        User user = userService.getById(1);
        return Result.success(user);
    }

    @RequestMapping("/db/tx")
    public @ResponseBody Result<Boolean> dbTx(){
        userService.tx();
        return Result.success(true);
    }
}
