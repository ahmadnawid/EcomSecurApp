package com.app.EcomSecurApp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String greeting(HttpServletRequest request)
    {

        return "Hello Secure App." + request.getSession().getId();
    }
}
