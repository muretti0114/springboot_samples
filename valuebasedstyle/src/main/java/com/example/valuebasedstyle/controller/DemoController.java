package com.example.valuebasedstyle.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.valuebasedstyle.entity.HealthCondition;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    
    @GetMapping("/")
    public String showHealthCondition(Model model) {

        List<HealthCondition> hList = generateDummyData();
        model.addAttribute("hList", hList);
        
        return "demo";
    }

    private List<HealthCondition> generateDummyData() {
        List<HealthCondition> hList = new ArrayList<>();

        hList.add(new HealthCondition("松場建都", Arrays.asList("36.0","いいえ","いいえ","未回答")));
        hList.add(new HealthCondition("浅野広大", Arrays.asList("36.5","いいえ","いいえ","未回答")));
        hList.add(new HealthCondition("木山啓人", Arrays.asList("37.7","はい","はい","風邪気味？")));
        hList.add(new HealthCondition("濱邉陸", Arrays.asList("36.2","いいえ","いいえ","未回答")));
        hList.add(new HealthCondition("吉井俊一", Arrays.asList("39.7","はい","はい","コロナになった")));

        return hList;


    }

}
