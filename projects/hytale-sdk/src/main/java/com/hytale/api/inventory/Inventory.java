package com.hytale.api.inventory;

public interface Inventory {
    int getSize();
    ItemStack getItem(int slot);
    void setItem(int slot, ItemStack item);
    void addItem(ItemStack... items);
    void clear();
}
