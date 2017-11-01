package com.cts.service;

import com.cts.dao.DistanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SUV extends Vehicle {


    @Override
   public double getTotalExpense(String input) {
        double output = 0.0;
        String splitInput[] = input.split(" ");
        String vehicleName = splitInput[0];
        String city = splitInput[1];


        CityDistance cityDistance = new CityDistance();
        double distance = cityDistance.calculateDistance(city);

        double fuelRate = Vehicle.fuelRate("Diesel");
        double acRate = Vehicle.acRate("AC");
        double busDiscount = Bus.busDiscount(vehicleName);


        if (vehicleName.equalsIgnoreCase("SUV"))
            output = distance * (fuelRate + acRate);


        return output;

    }
}








