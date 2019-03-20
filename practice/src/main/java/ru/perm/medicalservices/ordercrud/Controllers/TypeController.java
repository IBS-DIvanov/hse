package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.TypeEntity;

@RestController
public class TypeController {

    @RequestMapping("/type")
    public TypeEntity type() {
        return new TypeEntity();
    }
}
