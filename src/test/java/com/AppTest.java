package com.example;

import static org.junit.Assert.assertEquals;

import io.qameta.allure.Description;
import org.junit.Test;

public class AppTest {
  @Test
  @Description("Тест для проверки сложения")
  public void testAdd() {
    App app = new App();
    assertEquals(5, app.add(2, 3));
    assertEquals(-1, app.add(2, -3));
  }

  @Test
  @Description("Тест для вычитания")
  public void testSubtract() {
    App app = new App();
    assertEquals(-1, app.subtract(2, 3));
    assertEquals(5, app.subtract(2, -3));
  }

  @Test
  @Description("Тест умножения")
  public void testMultiply() {
    App app = new App();
    assertEquals(6, app.multiply(2, 3));
    assertEquals(-6, app.multiply(2, -3));
  }

  @Test
  @Description("Тест для деления")
  public void testDivide() {
    App app = new App();
    assertEquals(3, app.divide(9, 3), 0.0001);
    assertEquals(-3, app.divide(9, -3), 0.0001);
  }
}
