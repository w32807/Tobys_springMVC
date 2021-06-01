package com.tobys.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

public interface Controller {
    public String handleRequest(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
