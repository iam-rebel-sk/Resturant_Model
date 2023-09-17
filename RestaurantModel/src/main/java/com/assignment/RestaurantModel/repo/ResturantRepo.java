package com.assignment.RestaurantModel.repo;

import com.assignment.RestaurantModel.entity.Resturant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResturantRepo {
    @Autowired
    private List<Resturant> resturantlist;

    public List<Resturant> getResturantlist() {
        return resturantlist;
    }
}
