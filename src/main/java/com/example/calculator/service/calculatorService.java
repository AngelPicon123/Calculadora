package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class calculatorService {
    public double calculate (double number1, double number2, @org.jetbrains.annotations.NotNull String operation){
        switch (operation){
            case "suma":
                return number1+number2;
            case "resta":
                return number1-number2;
            case "multiplicacion":
                return number1*number2;
            case "division":
                if (number2==0 || number1==0){
                    throw new IllegalArgumentException("No se puede dividir por 0");
                }
                return number1 / number2;
            default:
                throw new UnsupportedOperationException("No se reconoce esta operacion: " + operation);

        }
    }
}
