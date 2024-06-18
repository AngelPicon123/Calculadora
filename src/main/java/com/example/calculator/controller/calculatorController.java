package com.example.calculator.controller;

import com.example.calculator.model.Operationrequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.calculator.service.calculatorService;

@RestController
@RequestMapping("/calculator")
public class calculatorController {
    @Autowired
    private calculatorService calculatorService;
    @PostMapping("/calculate")
    public ResponseEntity<Double> calculate(@RequestBody Operationrequest request) {
        double result = calculatorService.calculate(request.getNumber1(), request.getNumber2(), request.getOperation());
        return ResponseEntity.ok(result);
    }
}
