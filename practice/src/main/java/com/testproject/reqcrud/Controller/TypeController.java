package com.testproject.reqcrud.Controller;

import com.testproject.reqcrud.Entity.TypeEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeController {
    @RequestMapping("/type")
    public TypeEntity type() {
        return new TypeEntity();
    }
}
