package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReferralController {

    @RequestMapping("/referral")
    public ReferralEntity referral() {
        return new ReferralEntity();
    }
}
