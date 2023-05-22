package ru.bit.producer1.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("convert")
public class Producer1Controller {
    @GetMapping("from/{firstCurrency}/to/{secondCurrency}")
    public Map<String, String> exchange(@PathVariable String firstCurrency, @PathVariable String secondCurrency,
                                        @RequestParam int value) {
        HashMap<String, String> result = new HashMap<>();
        double returningValue = value * 0.013;
        result.put(secondCurrency, returningValue + "");
        String instanceName = "Producer1";
        result.put("instanceId", instanceName);
        return result;
    }
}