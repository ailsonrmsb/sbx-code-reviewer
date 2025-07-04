package net.sbx.code_reviewer.controller;

import lombok.RequiredArgsConstructor;
import net.sbx.code_reviewer.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping("/sum")
    public ResponseEntity<Integer> sum(
        @RequestParam int a,
        @RequestParam int b) {
        int result = calculatorService.sum(a, b);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/subtraction")
    public ResponseEntity<Integer> subtraction(
        @RequestParam int a,
        @RequestParam int b) {
        int result = calculatorService.subtraction(a, b);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/multiply")
    public ResponseEntity<Integer> multiply(
        @RequestParam int a,
        @RequestParam int b) {
        int result = calculatorService.multiply(a, b);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/divide")
    public ResponseEntity<Double> divide(
        @RequestParam int a,
        @RequestParam int b) {
        Double result = calculatorService.divide(a, b);
        return ResponseEntity.ok(result);
    }
}
