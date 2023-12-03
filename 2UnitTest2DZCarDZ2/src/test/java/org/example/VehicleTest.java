package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car; //создаем объект типа car
    private Motorcycle motorcycle;

    @BeforeEach
        //Перед каждым тестот создаем нового car
    void setUp() {
        car = new Car("Audi", "e-tron", 2020);
        motorcycle = new Motorcycle("Hero ", "SPLENDOR ", 2011);
    }

    @AfterEach
        //После каждого теста обнуляем наш объект
    void tearDown() {
        car = null;
        motorcycle = null;
    }


    //1.Проверить, что экземпляр объекта Car также является экземпляром транспортного
//средства (используя оператор instanceof).
    @Test
    @DisplayName("Проверка принадлежности car к vehicle")
    void carInstanceofVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    //2.Проверить, что объект Car создается с 4-мя колесами.
    @Test
    @DisplayName("Проверка количества 4 колес у Car")
    void numberOfWheelsCar() {
        assertEquals(4, car.getNumWheels());
    }

    //3.Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    @DisplayName("Проверка количества 2 колес у Motorcycle")
    void numberOfWheelsMotorcycle() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //4.Проверить, что объект Car развивает скорость 60
    // в режиме тестового вождения (используя метод testDrive())
    @Test
    @DisplayName("Проверка, что объект Car развивает скорость 60")
    void testDriveCar() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    //   5. Проверить, что объект Motorcycle
    //    развивает скорость 75 в режиме тестового вождения (используя метод testDrive())
    @Test
    @DisplayName("Проверка, что объект Motorcycle развивает скорость 75")
    void testDriveMotorcycle() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
    //    6.Проверить, что в режиме парковки (сначала testDrive, потом park,
    //    т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    @DisplayName("Проверка, что объект Motorcycle останавливается (speed = 0)")
    void parkCar() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    //    7.Проверить, что в режиме парковки (сначала testDrive, потом park,
    //    т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    @DisplayName("Проверка, что объект Motorcycle останавливается (speed = 0)")
    void parkMotorcycle() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
