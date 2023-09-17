package com.assignment.RestaurantModel.service;

import com.assignment.RestaurantModel.entity.Resturant;
import com.assignment.RestaurantModel.repo.ResturantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResturantService {

    @Autowired
    ResturantRepo myResturant;

    public List<Resturant> getAllResturant() {
        return myResturant.getResturantlist();
    }

    public String addAllUser(List<Resturant> newResturant) {
        getAllResturant().addAll(newResturant);
        return newResturant.size() + " Resturants are added sucessfully.";
    }

    public Resturant getResturantById(Integer id) {
        return getAllResturant().stream()
                .filter(resturant -> resturant.getResturantId()
                        .equals(id)).findFirst()
                .orElse(null);
    }


    public String updateResturantDetails( Integer id,  Resturant updatedRestaurant) {
        for (int i = 0; i < myResturant.getResturantlist().size(); i++) {
            Resturant restaurant = myResturant.getResturantlist().get(i);
            if (restaurant.getResturantId().equals(id)) {

                restaurant.setResturantName(updatedRestaurant.getResturantName());
                restaurant.setResturantAdress(updatedRestaurant.getResturantAdress());
                restaurant.setResturantContactNumber(updatedRestaurant.getResturantContactNumber());
                restaurant.setResturantSpeciality(updatedRestaurant.getResturantSpeciality());
                restaurant.setResturantTotalStaff(updatedRestaurant.getResturantTotalStaff());
                restaurant.setResturantCategory(updatedRestaurant.getResturantCategory());
                return "Restaurant with ID " + id + " updated successfully.";
            }
        }
        return "Restaurant with ID " + id + " not found.";
    }

    public String deleteResturantById(Integer id) {
        for (int i = 0; i < myResturant.getResturantlist().size(); i++) {
            Resturant restaurant = myResturant.getResturantlist().get(i);
            if (restaurant.getResturantId().equals(id)) {

                myResturant.getResturantlist().remove(i);
                return "Restaurant with ID " + id + " updated deleted.";
            }
        }
        return "Restaurant with ID " + id + " not found.";
    }

}
