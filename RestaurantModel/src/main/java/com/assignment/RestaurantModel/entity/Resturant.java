package com.assignment.RestaurantModel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resturant {
    private Integer resturantId;
    private String resturantName;
    private String resturantAdress;
    private String resturantContactNumber;
    private String resturantSpeciality;
    private Integer resturantTotalStaff;
    private Category resturantCategory;
}
