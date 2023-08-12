/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layered.service.custom;

import java.util.ArrayList;
import supermarket.layered.dto.ItemDto;
import supermarket.layered.service.SuperService;

/**
 *
 * @author ravin
 */
public interface ItemService extends SuperService{
    String saveItem(ItemDto itemDto) throws Exception;
    
    String updateItem(ItemDto itemDto) throws Exception;
    
    String deleteItem(String id) throws Exception;
    
    ItemDto getItem(String id) throws Exception;
    
    ArrayList<ItemDto> getAllItems() throws Exception;
}
