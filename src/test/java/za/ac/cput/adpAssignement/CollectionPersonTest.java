package za.ac.cput.adpAssignement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Author: Robin White
 * Student Number: 218034555
 * Description: Test case for Collection
 */
class CollectionPersonTest {

    private final Collection<Person> personCollection = new HashSet<>();
    Person p1 = new Person("Robin","White", 21);
    Person p2 = new Person("Jeff","Bezos",50);
    Person p3 = new Person("Bill","Gates", 65);


    @BeforeEach                                 //Creates and Displays a default collection with 3 person Objects
    void setUp() {
        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);

        System.out.println("Default Collection:");
        System.out.println(personCollection);
        System.out.println("____________________________________");
    }


    @Test                                           //Test to add person to Collection
    void collectionAdd(){
        Person p4 = new Person("Steve","Jobs", 70);
        personCollection.add(p4);                         //Adds 4th person to collection

        System.out.println("Collection after new person is added:");
        System.out.println(personCollection);            //Displays collection after 4th person is added


        assertEquals(4, personCollection.size());    //check to see if collection has 4 Persons.
    }


    @Test                                                   //Test to remove person from collection
    void collectionRemove(){

        personCollection.remove(p2);                       //remove person from Collection
        System.out.println("Collection after person is removed:");
        System.out.println(personCollection);              //Displays collection after person is removed

        assertEquals(2,personCollection.size());   //Check to see if 2 persons are remaining

    }


    @Test                                                   //Test to find person in collection
    void collectionFind(){

        if( personCollection.contains(p2))         //checks to see if car object is in the collection
        {
            System.out.println("Found P2 object in collection:");
            System.out.println(p2);
        }
        else
        {
            System.out.println("Collection does not contain P2 object");
        }

    }
}