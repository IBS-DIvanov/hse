package com.testproject.reqcrud.Controller;

import com.testproject.reqcrud.Entity.EmployeeEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping("/employee")
    public EmployeeEntity employee() {
        return new EmployeeEntity();
    }
}
