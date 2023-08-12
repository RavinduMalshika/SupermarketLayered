/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.service.custom.impl;

import java.util.ArrayList;
import supermarket.layered.dao.DaoFactory;
import supermarket.layered.dao.custom.CustomerDao;
import supermarket.layered.dto.CustomerDto;
import supermarket.layered.entity.CustomerEntity;
import supermarket.layered.service.custom.CustomerService;

/**
 *
 * @author ravin
 */
public class CustomerServiceImpl implements CustomerService{
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getId(), customerDto.getTitle(), 
                customerDto.getName(), 
                customerDto.getDob(), 
                customerDto.getAddress(), customerDto.getCity(), 
                customerDto.getProvince(), 
                customerDto.getPostalCode(), 
                customerDto.getSalary());
        
        if(customerDao.save(customerEntity)) {
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity customerEntity = new CustomerEntity(customerDto.getId(), customerDto.getTitle(), 
                customerDto.getName(), 
                customerDto.getDob(), 
                customerDto.getAddress(), customerDto.getCity(), 
                customerDto.getProvince(), 
                customerDto.getPostalCode(), 
                customerDto.getSalary());
        
        if(customerDao.update(customerEntity)) {
            return "Successfully Updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        if(customerDao.delete(id)) {
            return "Successfully Deleted";
        } else {
            return "Failed";
        }
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        CustomerEntity customerEntity = customerDao.get(id);
        return new CustomerDto(customerEntity.getId(), customerEntity.getTitle(), 
                customerEntity.getName(), 
                customerEntity.getDob(), 
                customerEntity.getAddress(), 
                customerEntity.getCity(), 
                customerEntity.getProvince(), 
                customerEntity.getPostalCode(), 
                customerEntity.getSalary());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        
        for (CustomerEntity customerEntity : customerEntitys) {
            CustomerDto dto =  new CustomerDto(customerEntity.getId(), customerEntity.getTitle(), 
                customerEntity.getName(), 
                customerEntity.getDob(), 
                customerEntity.getAddress(), 
                customerEntity.getCity(), 
                customerEntity.getProvince(), 
                customerEntity.getPostalCode(), 
                customerEntity.getSalary());
            customerDtos.add(dto);
        }
        return customerDtos;
    }
    
}
