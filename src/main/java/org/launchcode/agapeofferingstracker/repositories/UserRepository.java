package org.launchcode.agapeofferingstracker.repositories;

import org.launchcode.agapeofferingstracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String email);
}
