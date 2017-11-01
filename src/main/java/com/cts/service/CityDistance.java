package com.cts.service;

import com.cts.dao.DistanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityDistance {

    @Autowired
    DistanceDao distanceDao;

    public int calculateDistance(String city) {


        String splitCityName[] = city.split("-");

        String fromCity = splitCityName[0];
        String toCity = splitCityName[1];

        int distance = distanceDao.getDistanceByCityName(fromCity) + distanceDao.getDistanceByCityName(toCity);
        return distance;
    }
}
