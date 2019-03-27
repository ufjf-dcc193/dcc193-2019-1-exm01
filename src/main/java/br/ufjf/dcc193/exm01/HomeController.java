package br.ufjf.dcc193.exm01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("index.html")
    ModelAndView home(String nome, Integer idade){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("nome", nome);
        mv.addObject("idade", idade);
        System.out.println(nome);
        return mv;
    }
    @RequestMapping("form.html")
    String form(){
        return "form";
    }
}