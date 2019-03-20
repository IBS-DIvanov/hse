package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.ActEntity;

@RestController
public class ActController {

    @RequestMapping("/act")
    public ActEntity act() {
        return new ActEntity();
    }
}
