package net.sbx.code_reviewer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CalculatorService {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        BigDecimal result = BigDecimal.valueOf(a)
            .divide(BigDecimal.valueOf(b), 3, java.math.RoundingMode.HALF_UP);
        return result.doubleValue();
    }
}
