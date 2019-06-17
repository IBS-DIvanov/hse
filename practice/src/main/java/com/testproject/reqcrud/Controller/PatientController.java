package com.testproject.reqcrud.Controller;

import com.testproject.reqcrud.Entity.PatientEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @RequestMapping("/patient")
    public PatientEntity patient() {
        return new PatientEntity();
    }
}
