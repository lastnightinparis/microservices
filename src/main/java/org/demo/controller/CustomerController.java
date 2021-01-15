package org.demo.controller;

import org.demo.model.CustomerDTO;
import org.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kir
 * Created on 15.01.2021
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerService cs;

    @PostMapping
    public void addCustomer(@RequestParam int id, @RequestParam String name) {
        cs.addCustomer(id, name);
    }

    @GetMapping
    public CustomerDTO  getCustomer(@RequestParam int id){
        return cs.getCustomer(id);
    }
}
