package com.springapi.ms.inventoryservice.repository;

import java.util.Optional;

import com.springapi.ms.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    Optional<Inventory> findbySkyCode(String skuCode);
}
