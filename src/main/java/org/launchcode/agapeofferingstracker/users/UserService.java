package org.launchcode.agapeofferingstracker.users;

import org.launchcode.agapeofferingstracker.forms.UserForm;
import org.launchcode.agapeofferingstracker.models.User;

public interface UserService {


    public User save(UserForm userForm) throws EmailExistsException;
    public User findByEmail(String email);
}
