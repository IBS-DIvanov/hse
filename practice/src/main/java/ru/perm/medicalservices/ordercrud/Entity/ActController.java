package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActController {

    @RequestMapping("/act")
    public ActEntity act() {
        return new ActEntity();
    }
}
