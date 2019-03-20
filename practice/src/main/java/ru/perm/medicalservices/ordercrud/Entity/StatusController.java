package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @RequestMapping("/status")
    public StatusEntity status() {
        return new StatusEntity();
    }
}
