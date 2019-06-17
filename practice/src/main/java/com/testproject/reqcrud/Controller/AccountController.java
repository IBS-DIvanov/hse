package com.testproject.reqcrud.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.testproject.reqcrud.Entity.AccountEntity;

@RestController
public class AccountController {
    @RequestMapping("/account")
    public AccountEntity account() {
        return new AccountEntity();
    }
}
