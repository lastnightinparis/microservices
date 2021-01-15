package org.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kir
 * Created on 15.01.2021
 */
@Data
@AllArgsConstructor
public class CustomerDTO {
    private int id;
    private String name;
}
