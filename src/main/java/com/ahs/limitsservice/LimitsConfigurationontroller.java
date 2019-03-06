package com.ahs.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahs.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationontroller {
    
    @Autowired
    Configuration configuration;
    
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFronConfigurations(){
        return new LimitConfiguration(configuration.getMaximun(), configuration.getMinimun());
    }
    
}
