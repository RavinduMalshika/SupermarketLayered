/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.controller;

import java.util.ArrayList;
import supermarket.layered.dto.ItemDto;
import supermarket.layered.service.ServiceFactory;
import supermarket.layered.service.custom.ItemService;

/**
 *
 * @author ravin
 */
public class ItemController {
    private ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    
    public String saveItem(ItemDto itemDto) throws Exception {
        return itemService.saveItem(itemDto);
    }
    
    public ArrayList<ItemDto> getAllItems() throws Exception {
        return itemService.getAllItems();
    }
    
    public ItemDto getItem(String id) throws Exception {
        return  itemService.getItem(id);
    }
    
    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
    }
    
    public String deleteItem(String id) throws Exception {
        return itemService.deleteItem(id);
    }
}
