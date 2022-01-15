package com.qiao.liquibase;

import com.qiao.liquibase.domain.House;
import com.qiao.liquibase.domain.Item;
import com.qiao.liquibase.repository.HouseRepository;
import com.qiao.liquibase.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    CommandLineRunner init(HouseRepository houseRepository, ItemRepository itemRepository) {
        return args -> {
            log.info("Saving House");
            House house = new House();
            house.setOwner("Joey " + System.currentTimeMillis());
            house.setFullyPaid(true);
            houseRepository.save(house);

            log.info("Saving Item");
            Item item = new Item();
            item.setHouse(house);
            item.setName("Joey buy house " + System.currentTimeMillis());
            itemRepository.save(item);
        };
    }
}
