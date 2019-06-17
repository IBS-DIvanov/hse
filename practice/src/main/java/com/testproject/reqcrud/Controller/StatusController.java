package com.testproject.reqcrud.Controller;

import com.testproject.reqcrud.Entity.StatusEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @RequestMapping("/status")
    public StatusEntity status() {
        return new StatusEntity();
    }
}
