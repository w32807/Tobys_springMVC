package com.tobys.spring.servlet;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class ServletTests {
    
    @Test
    public void mockhttpServletTest() throws ServletException, IOException {
        MockHttpServletRequest req = new MockHttpServletRequest("GET", "/handleRequest");  
        req.addParameter("name", "spring");
        
        MockHttpServletResponse res = new MockHttpServletResponse();
        SimpleGetServlet servlet = new SimpleGetServlet();
        servlet.service(req, res);
        // 아직 한글을 쓰기엔 인코딩이 문제임
        assertEquals(res.getContentAsString(), "<HTML><BODY>Hello spring</BODY></HTML>");
    }
}
