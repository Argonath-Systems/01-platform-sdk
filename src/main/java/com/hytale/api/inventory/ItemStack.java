package com.hytale.api.inventory;

public interface ItemStack {
    String getType();
    int getAmount();
    void setAmount(int amount);
}
