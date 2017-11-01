package com.cts.service;

import com.cts.dao.DistanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public abstract class Vehicle {


    public static double acRate(String actype) {

        if (actype.equalsIgnoreCase("AC"))
            return 2;
        else
            return 0;
    }


    public static double fuelRate(String fuelType) {
        if (fuelType.equalsIgnoreCase("Petrol"))
            return 9;
        else if (fuelType.equalsIgnoreCase("Diesel"))
            return 8;
        else
            return 0;
    }


    public abstract double getTotalExpense(String input);
}