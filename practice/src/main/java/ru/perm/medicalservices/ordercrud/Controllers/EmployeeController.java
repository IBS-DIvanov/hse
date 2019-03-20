package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.EmployeeEntity;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public EmployeeEntity employee() {
        return new EmployeeEntity();
    }
}
