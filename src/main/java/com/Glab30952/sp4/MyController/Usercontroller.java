package com.Glab30952.sp4.MyController;

import com.Glab30952.sp4.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {

    @PostMapping("/users")
    public void  printData(@RequestBody User user){
        System.out.println("Printint the user data: " + user);
    }

}
