package org.demo.services;

import org.demo.model.CustomerDTO;

/**
 * @author Kir
 * Created on 15.01.2021
 */
public interface CustomerService {
    void addCustomer(int id, String name);

    CustomerDTO getCustomer(int id);
}
