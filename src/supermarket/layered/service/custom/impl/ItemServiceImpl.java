/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.service.custom.impl;

import java.util.ArrayList;
import supermarket.layered.dao.DaoFactory;
import supermarket.layered.dao.custom.ItemDao;
import supermarket.layered.dto.ItemDto;
import supermarket.layered.entity.ItemEntity;
import supermarket.layered.service.custom.ItemService;

/**
 *
 * @author ravin
 */
public class ItemServiceImpl implements ItemService{
    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    
    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        if(itemDao.save(new ItemEntity(itemDto.getId(), 
                itemDto.getDescription(), 
                itemDto.getPackSize(), 
                itemDto.getUnitPrice(), 
                itemDto.getQtyOnHand()))){
            return "Successfully Saved";
        } else {
            return "Failed";
        }
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        if(itemDao.update(new ItemEntity(itemDto.getId(), 
                itemDto.getDescription(), 
                itemDto.getPackSize(), 
                itemDto.getUnitPrice(), 
                itemDto.getQtyOnHand()))){
            return "Successfully Updated";
        } else {
            return "Failed";
        }
    }

    @Override
    public String deleteItem(String id) throws Exception {
        if(itemDao.delete(id)){
            return "Successfully Deleted";
        } else{
            return "Failed";
        }
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
        ItemEntity itemEntity = itemDao.get(id);
        return new ItemDto(itemEntity.getId(), itemEntity.getDescription(), itemEntity.getPackSize(), itemEntity.getUnitPrice(), itemEntity.getQtyOnHand());
    }

    @Override
    public ArrayList<ItemDto> getAllItems() throws Exception {
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        ArrayList<ItemEntity> itemEntitys = itemDao.getAll();
        
        for (ItemEntity itemEntity : itemEntitys) {
            ItemDto itemDto = new ItemDto(itemEntity.getId(), itemEntity.getDescription(), itemEntity.getPackSize(), itemEntity.getUnitPrice(), itemEntity.getQtyOnHand());
            itemDtos.add(itemDto);
        }
        return itemDtos;
    }
    
}
