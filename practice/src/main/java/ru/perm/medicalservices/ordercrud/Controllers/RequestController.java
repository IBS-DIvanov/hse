package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.RequestEntity;

@RestController
public class RequestController {

    @RequestMapping("/request")
    public RequestEntity request() {
        return new RequestEntity();
    }
}
