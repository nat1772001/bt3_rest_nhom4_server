package com.example.bt3.repository;

import com.example.bt3.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Long> {
    List<Inventory> findAllByProductIdAndQuantityGreaterThanEqual(Long id, Integer quantity);
}
