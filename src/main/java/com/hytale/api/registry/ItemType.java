package com.hytale.api.registry;

import java.util.Collection;

public interface ItemType {
    String getId();
    String getDisplayName();
    String getDescription();
    int getMaxStackSize();
    String getRarity();
    Collection<String> getTags();
}
