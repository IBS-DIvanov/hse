package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.ReferralEntity;

@RestController
public class ReferralController {

    @RequestMapping("/referral")
    public ReferralEntity referral() {
        return new ReferralEntity();
    }
}
