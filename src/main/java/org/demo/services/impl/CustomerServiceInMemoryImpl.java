package org.demo.services.impl;

import org.demo.model.CustomerDTO;
import org.demo.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kir
 * Created on 15.01.2021
 */
@Service
public class CustomerServiceInMemoryImpl implements CustomerService {
    private Map<Integer, CustomerDTO> persist = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDTO(id, name));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return persist.get(id);
    }
}
