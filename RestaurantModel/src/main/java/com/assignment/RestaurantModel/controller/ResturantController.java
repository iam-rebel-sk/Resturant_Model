package com.assignment.RestaurantModel.controller;

import com.assignment.RestaurantModel.entity.Resturant;
import com.assignment.RestaurantModel.service.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturantController {
    @Autowired
    ResturantService resturantService;

    @GetMapping("resturants")
    public List<Resturant> getAllResturant(){
        return resturantService.getAllResturant();

    }

    @GetMapping("resturant/resturantId/{id}")
    public Resturant getResturantById(@PathVariable Integer id){
        return resturantService.getResturantById(id);
    }

    @PostMapping("resturants")
    public String addResturant(@RequestBody List<Resturant> newRestursnt){
        return resturantService.addAllUser(newRestursnt);
    }

    @PutMapping("resturant/resturantId/{id}")
    public String updateResturantDetails(@PathVariable Integer id, @RequestBody Resturant resturantData){
        return resturantService.updateResturantDetails(id,resturantData);
    }

    @DeleteMapping("resturant/resturantId/{id}")
    public String deleteResturant(@PathVariable Integer id){
        return resturantService.deleteResturantById(id);
    }

}
