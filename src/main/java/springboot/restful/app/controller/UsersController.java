package springboot.restful.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.restful.app.entiry.UsersEntiry;
import springboot.restful.app.repository.UsersRepository;

@RestController
public class UsersController {
    
    @Autowired
    private UsersRepository repo;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String findAll() {
        return repo.findAll().toString();
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody UsersEntiry user) {
        repo.save(user);
    }
}
