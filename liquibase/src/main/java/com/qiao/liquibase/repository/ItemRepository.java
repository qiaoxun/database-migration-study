package com.qiao.liquibase.repository;

import com.qiao.liquibase.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
