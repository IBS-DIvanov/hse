package ru.perm.medicalservices.ordercrud.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.medicalservices.ordercrud.Entity.PostEntity;

@RestController
public class PostController {

    @RequestMapping("/post")
    public PostEntity post() {
        return new PostEntity();
    }
}
