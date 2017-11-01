package com.cts.dao;

;
import com.cts.dao.DaoMethods;
import com.cts.model.CarRentalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class DistanceDao implements DaoMethods {


    @Autowired
    MongoTemplate template;

    public Integer getDistanceByCityName(String city){
        Query searchByCityName=new Query(Criteria.where("name").is(city));
        CarRentalModel cityDistances =template.findOne(searchByCityName,CarRentalModel.class);
        Integer distance= cityDistances.getDistacePerKm();
        return distance;
    }
}
