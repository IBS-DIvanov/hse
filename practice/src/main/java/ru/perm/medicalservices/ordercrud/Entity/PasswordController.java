package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    @RequestMapping("/password")
    public PasswordEntity password() {
        return new PasswordEntity();
    }
}
