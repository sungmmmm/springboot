package hello.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") //hello 라고 치면 호출
    public String hello(Model model){
    model.addAttribute("data", "Spring!!");
    //hello.html의 ${data} 부분에서 출력
    return  "hello";
    }

}
