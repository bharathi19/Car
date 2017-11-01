package com.cts.service;

import com.cts.dao.DistanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Car extends Vehicle {


    @Override
   public double getTotalExpense(String input) {

        double output = 0.0;
        String splitInput[] = input.split(" ");
        String vehicleName = splitInput[0];
        String fuelType = splitInput[1];
        String acType = splitInput[2];
        String city = splitInput[3];

        CityDistance cityDistance = new CityDistance();
        double distance = cityDistance.calculateDistance(city);

        double fuelRate = Vehicle.fuelRate(fuelType);
        double acRate = Vehicle.acRate(acType);
        double busDiscount = Bus.busDiscount(vehicleName);


        if (vehicleName.equalsIgnoreCase("car"))
            output = distance * (fuelRate + acRate);
        return output;

    }
}