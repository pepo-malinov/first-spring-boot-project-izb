package uni.pu.fmi.springbootdemoproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.pu.fmi.springbootdemoproject.models.User;
import uni.pu.fmi.springbootdemoproject.repo.UserRepo;

import java.time.LocalDate;
import java.util.List;


@RestController
public class FirstRestDemo
{
    @Autowired
    private UserRepo userRepo;
    @RequestMapping(path = "/")
    public String hello(){
        return "Hello";
    }
    @RequestMapping(path = "/user")
    public User getUser(){
        User user = new User("Ivan", "Ivanov", LocalDate.now());
        userRepo.save(user);
        return user;
    }
    @RequestMapping(path = "/user/add")
    public User addUser(String firstName, String lastName, int age){

        User user = new User(firstName, lastName, LocalDate.now().minusYears(age));
        userRepo.save(user);
        return user;
    }
    @RequestMapping(path = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
}
