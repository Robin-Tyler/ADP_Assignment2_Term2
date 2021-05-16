package za.ac.cput.adpAssignement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Author: Robin White
 * Student Number: 218034555
 * Description: Test case for Set
 */
class SetCarTest {

    private final Set<Car> carSet = new HashSet<>();
    Car c1 = new Car("BMW", 2006);
    Car c2 = new Car("Audi", 2018);
    Car c3 = new Car("Ferrari", 1999);

    @BeforeEach                                             //Creates and Displays a Default set with 3 car objects
    void setUp() {
        carSet.add(c1);
        carSet.add(c2);
        carSet.add(c3);

        System.out.println("Default Set:");
        System.out.println(carSet);
        System.out.println("___________________________________");
    }


    @Test                                                   //test adds car to set
    void setAdd() {
        Car c4 = new Car("Nissan", 2016);

        carSet.add(c4);                                 //adds 4th car to set
        System.out.println("Set after new car is added:");
        System.out.println(carSet);                     //displays set after 4th car added

        assertEquals(4, carSet.size());

    }


    @Test                                                   //test removes car from set
    void setRemove() {

        carSet.remove(c2);                                  //Removes the second car from set
        System.out.println("Set after car is removed:");
        System.out.println(carSet);                         //displays set after second car is removed

        assertEquals(2, carSet.size());             //check to see if there are 2 cars remaining in set
    }


    @Test                                                   //Test finds a car object in set
    void setFind(){
        if(carSet.contains(c1))
        {
            System.out.println("Car object c1 found in Set:");
            System.out.println(c1);
        }
        else
        {
            System.out.println("Car object c1 does not exist in Set");
        }
    }
}