package com.qiao.liquibase.repository;

import com.qiao.liquibase.domain.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
