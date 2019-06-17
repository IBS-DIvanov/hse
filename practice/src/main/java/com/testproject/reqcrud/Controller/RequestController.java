package com.testproject.reqcrud.Controller;

import com.testproject.reqcrud.Entity.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public RequestEntity request() {
        return new RequestEntity();
    }
}
