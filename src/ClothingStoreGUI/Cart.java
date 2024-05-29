/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClothingStoreGUI;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annek
 */
public class Cart {
    public List<OrderProduct> cartProducts = new ArrayList<>();
    public int numItems = 0;
    public BigDecimal totalPrice = BigDecimal.ZERO;
    
    public Cart() {    
    }
    
    // adds item to cart
    public void addItem(OrderProduct product) {
        for (OrderProduct existingProduct : cartProducts) {
            if (existingProduct.getProduct().equals(product.getProduct()) && 
                existingProduct.getSize().equals(product.getSize())) {
                // If a similar product exists, update its quantity
                existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
                setNumItems();
                setTotalPrice();
                return; // Exit the method after updating the quantity
            }
        }
        // if there is no similar product, add the product
        this.cartProducts.add(product);
        this.numItems += product.getQuantity();
        this.totalPrice = totalPrice.add(product.getTotalPrice());
    }
    
    public void clear() {
        // when program resets, reset all variables
        cartProducts.clear();
        numItems = 0;
        totalPrice = new BigDecimal(0);
    }
    
    @Override
    public String toString() {
        String out = "";
        int i = 1;
        for (OrderProduct selectedProduct : cartProducts) {
           out += "("+i+") "+selectedProduct+"\n";
           i++;
        }
        out += "Total price: $"+String.format("%.2f", totalPrice); // format to 2dp
        return out;
    }
    
    public String[] toStringArray() {
        List<String> cartDisplay = new ArrayList<>();

        // get cart labels for each product
        for (OrderProduct product : cartProducts) {
            cartDisplay.add(product.toString());
        }

        return cartDisplay.toArray(new String[0]);
    }

    public void removeOrderProduct(OrderProduct product) {
        cartProducts.remove(product); // remove product
        setNumItems(); // update total no of items
        setTotalPrice(); // update total price
    }
    
    public void updateCart(int index, OrderProduct newProduct) {
        System.out.println("updating "+newProduct);
        cartProducts.set(index, newProduct);
        setNumItems(); // update total no of items
        System.out.println("numitems is "+numItems);
        setTotalPrice(); // update total price
        System.out.println(String.format("total price is $%.2f",totalPrice));
    }
    
    public int getNumItems() {
        return numItems;
    }

    public List<OrderProduct> getCartProducts() {
        return cartProducts;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice.setScale(2, RoundingMode.HALF_UP);
    }

    public void setTotalPrice() {
        BigDecimal sum = BigDecimal.ZERO;
        for (OrderProduct product : cartProducts) {
            sum = sum.add(product.getTotalPrice());
        }
        this.totalPrice = sum;
    }

    public void setNumItems() {
        int sum = 0;
        for (OrderProduct product : cartProducts) {
            sum += product.getQuantity();
        }
        this.numItems = sum;
    }
}
