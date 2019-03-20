package ru.perm.medicalservices.ordercrud.Entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping("/post")
    public PostEntity post() {
        return new PostEntity();
    }
}
