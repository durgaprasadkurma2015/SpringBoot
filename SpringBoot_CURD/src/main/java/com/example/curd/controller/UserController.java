package com.example.curd.controller;

import com.example.curd.model.User;
import com.example.curd.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }
    
    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        User existing = repository.findById(id).orElseThrow();

        existing.setFirstName(user.getFirstName());
        existing.setLastName(user.getLastName());
        existing.setAge(user.getAge());
        existing.setGender(user.getGender());
        existing.setDateOfBirth(user.getDateOfBirth());
        existing.setMobileNumber(user.getMobileNumber());
        existing.setEmail(user.getEmail());
        existing.setAddress(user.getAddress());
        existing.setCity(user.getCity());
        existing.setDistrict(user.getDistrict());
        existing.setState(user.getState());
        existing.setCountry(user.getCountry());

        return repository.save(existing);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
