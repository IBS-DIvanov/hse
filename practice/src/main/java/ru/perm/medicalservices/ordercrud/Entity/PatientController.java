package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @RequestMapping("/patient")
    public PatientEntity patient() {
        return new PatientEntity();
    }
}
