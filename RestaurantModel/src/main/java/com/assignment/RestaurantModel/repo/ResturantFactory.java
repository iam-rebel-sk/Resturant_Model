package com.assignment.RestaurantModel.repo;

import com.assignment.RestaurantModel.entity.Resturant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ResturantFactory {
    @Bean
    List<Resturant> getAllResturant(){
        return new ArrayList<>();
    }
}
