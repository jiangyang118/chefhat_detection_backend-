package com.example.chefhat_detection.daos;

import com.example.chefhat_detection.pojo.Kitchen;

import java.util.Set;

public interface KitchenDao {
    Set<Kitchen> getallkitchen();
    Kitchen getKitchenbyId(int id);
    Kitchen getKitchenName(String name);
    Set<Kitchen> getKitchenByUsername(String username);
//    int  getKitchenId(String name);
}
