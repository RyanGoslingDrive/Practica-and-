package ru.neoflex.practice.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcControllerTest {
    @Test //разность 10 и 15 не равна 25
    void minus() {
        CalcController calcController = new CalcController();
        int minus = calcController.minus(10, 15);
        Assertions.assertEquals(25, minus);
    }

    @Test //Сумма 10 и 15 = 25
    void plus() {
        CalcController calcController = new CalcController();
        int plus = calcController.plus(10, 15);
        Assertions.assertEquals(25, plus);
    }

    @Test //Четные числа
    void EvenOrOdd_EvenNumber() {
        CalcController calcController = new CalcController();
        boolean even = calcController.EvenOrOdd(10);
        Assertions.assertTrue(even);
    }

    @Test //Нечетные числа (10 не является четным)
    void EvenOrOdd_OddNumber() {
    CalcController calcController = new CalcController();
    boolean Odd = calcController.EvenOrOdd(10);
    Assertions.assertFalse(Odd);
    }
}