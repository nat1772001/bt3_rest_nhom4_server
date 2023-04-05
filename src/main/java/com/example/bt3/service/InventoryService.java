package com.example.bt3.service;

import com.example.bt3.entity.Inventory;
import com.example.bt3.repository.InventoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepo inventoryRepo;
    public List<Inventory> checkInventory(Long id, Integer quantity){
        return inventoryRepo.findAllByProductIdAndQuantityGreaterThanEqual(id, quantity);
    }

}
