package com.g3appdev.chickenproven.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3appdev.chickenproven.Entity.Analytics;
import com.g3appdev.chickenproven.Repository.AnalyticsRepository;

@Service
public class AnalyticsService {
    
    @Autowired
    AnalyticsRepository srepo;

    public AnalyticsService() {
        super();
    }

    public Analytics postAnalyticsRecord(Analytics analytics){
        return srepo.save(analytics);
    }

    public List<Analytics>getAllAnalytics(){
        return srepo.findAll();
    }
}
