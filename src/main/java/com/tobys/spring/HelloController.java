package com.tobys.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobys.dto.HelloSpring;

@Controller
public class HelloController implements com.tobys.spring.Controller{
    
    @Autowired
    HelloSpring helloSpring;
    
	@Override
	@RequestMapping("/handleRequest")
	public String handleRequest(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
	    String name = request.getParameter("name");
	    String message = this.helloSpring.sayHello(name); // 비지니스 로직 호출
	    
	    model.addAttribute("message", message);
	    
	    return "home";
	}
	
}
