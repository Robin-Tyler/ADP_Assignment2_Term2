package za.ac.cput.adpAssignement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Author: Robin White
 * Student Number: 218034555
 * Description: Test case for Map
 */
class MapAnimalTest {

    private final Map<Integer,Animal> animalMap = new HashMap<>();

    @BeforeEach                                         //Creates and displays Default map with 3 animals
    void setUp() {
        Animal a1 = new Animal("Cow","White");
        Animal a2 = new Animal("Goat","Brown");
        Animal a3 = new Animal("Horse", "Black");

        animalMap.put(1,a1);
        animalMap.put(2,a2);
        animalMap.put(3,a3);

        System.out.println("Default Map:");
        System.out.println(animalMap);
        System.out.println("______________________________");
    }


    @Test                                           //test adds another animal to the map
    void mapAdd(){
        Animal a4 = new Animal("Dog", "Grey");

        animalMap.put(4,a4);                            //code that adds 4th animal to map

        System.out.println("Map after new Animal is added:");
        System.out.println(animalMap);                  //displays map after 4th animal is added
        assertEquals(4, animalMap.size());      //tests to see if the list contains 4 animals
    }


    @Test                                               //Test to remove animal from map
    void mapRemove(){
        animalMap.remove(2);                        //Code removes the second animal from map

        System.out.println("Map after animal is removed:");
        System.out.println(animalMap);                  //Displays list after animal removed
        assertEquals(2, animalMap.size());
    }


    @Test                                               //Test to find animal in map
    void mapFind(){
        System.out.println("Find Animal at index 2 in Map: " +animalMap.get(2));    //gets and displays the animal at index 2
    }
}