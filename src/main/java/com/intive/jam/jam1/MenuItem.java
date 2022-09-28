package com.intive.jam.jam1;

import java.math.BigDecimal;

public record MenuItem(
    String itemName,
    String itemDescription,
    BigDecimal itemPrice) {

    public String print() {
        return String.format("""
            %s "%s" with price: %s PLN\
            """, itemName, itemDescription, itemPrice);
    }
}
