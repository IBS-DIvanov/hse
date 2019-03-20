package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.PatientEntity;

import java.sql.Date;
import java.time.LocalDate;

@RestController
public class PatientController {

    @RequestMapping("/patient")
    public String patient() {
        PatientEntity patient=new PatientEntity();
        patient.setIdPatient(1);
        patient.setpDob(Date.valueOf(LocalDate.now()));
        patient.setpName("Иванов Иван");

        return "Id: "+patient.getIdPatient()+" Name: "+patient.getpName()+" Birthday: "+patient.getpDob();
    }
}
