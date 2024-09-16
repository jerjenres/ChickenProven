package com.g3appdev.chickenproven.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.g3appdev.chickenproven.Entity.Analytics;
import com.g3appdev.chickenproven.Service.AnalyticsService;

@RestController
@RequestMapping(method = RequestMethod.GET,path = "/api/analytics")
public class AnalyticsController {

    @Autowired
    AnalyticsService sserv;

    @GetMapping("/print")
    public String print(){
        return "Hello, Alerts";
    }

    @PostMapping("/postanalyticsrecord")
    public Analytics postAnalyticsRecord(@RequestBody Analytics analytics){
        return sserv.postAnalyticsRecord(analytics);
    }

    @GetMapping("/getAllAnalytics")
    public List<Analytics> getAllAnalytics(){
        return sserv.getAllAnalytics();
    }
}
