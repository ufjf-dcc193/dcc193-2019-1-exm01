package br.ufjf.dcc193.exm01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("index.html")
    String home(){
        return "/WEB-INF/home.jsp";
    }
    
}