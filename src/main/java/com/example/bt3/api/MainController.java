package com.example.bt3.api;

import com.example.bt3.entity.Inventory;
import com.example.bt3.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MainController {

    private final InventoryService inventoryService;
    @GetMapping("/inventory")
    public ResponseEntity<List<Inventory>> checkInventory(@RequestParam(name = "product_id") Long id, @RequestParam(name = "quantity") Integer quantity) {
        List<Inventory> inventories;
        try {
            inventories = inventoryService.checkInventory(id,quantity);


        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(inventories);
    }
}
