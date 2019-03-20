package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.PasswordEntity;

@RestController
public class PasswordController {

    @RequestMapping("/password")
    public PasswordEntity password() {
        return new PasswordEntity();
    }
}
