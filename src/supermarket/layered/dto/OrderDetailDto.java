/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.dto;

/**
 *
 * @author ravin
 */
public class OrderDetailDto {
    private String itemID;
    private Integer qty;
    private Double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String itemID, Integer qty, Double discount) {
        this.itemID = itemID;
        this.qty = qty;
        this.discount = discount;
    }

    /**
     * @return the itemID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OderDetailDto{" + "itemID=" + itemID + ", qty=" + qty + ", discount=" + discount + '}';
    }
}
