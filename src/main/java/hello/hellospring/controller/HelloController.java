package hello.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello") //hello 라고 치면 호출
    public String hello(Model model){
    model.addAttribute("data", "Spring!!");
    //hello.html의 ${data} 부분에서 출력
    return  "hello";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {//외부에서 파라미터를 받아온다 model에 담으면 그걸 view에서 랜더링 할때 사용
        model.addAttribute("name", name);
        // 파라미터에서 넘어온 name을 넘겨준다 앞에 있는 "name"은 키 뒤에있는 name임
        return " hello-template";
        //->templates의 hello-template.html으로 연결
    }
}
