package org.launchcode.agapeofferingstracker.controllers;

import org.launchcode.agapeofferingstracker.models.User;
import org.launchcode.agapeofferingstracker.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.security.Principal;

public abstract class AbstractBaseController {


    @Autowired
    UserService userService;

    protected static final String MESSAGE_KEY = "message";

    @ModelAttribute("user")
    public User getLoggedInUser(Principal principal) {

        if (principal != null)
            return userService.findByEmail(principal.getName());
        return null;

    }
}
