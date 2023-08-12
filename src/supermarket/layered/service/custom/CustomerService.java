/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layered.service.custom;

import java.util.ArrayList;
import supermarket.layered.dto.CustomerDto;
import supermarket.layered.service.SuperService;

/**
 *
 * @author ravin
 */
public interface CustomerService extends SuperService{
    String saveCustomer(CustomerDto customerDto) throws Exception;
    
    String updateCustomer(CustomerDto customerDto) throws Exception;
    
    String deleteCustomer(String id) throws Exception;
    
    CustomerDto getCustomer(String id) throws Exception;
    
    ArrayList<CustomerDto> getAllCustomers() throws Exception;
}
