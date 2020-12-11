package cn.hsy.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "admin".equals(username) &&"123456".equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/admin.html";
        }
        else{
            map.put("msg","用户名或密码错误!");
            return "login";}
    }

    @GetMapping("/exit")
    public String exitLogin(HttpSession session){
        session.removeAttribute("loginUser");
        return "redirect:/login.html";
    }
}
