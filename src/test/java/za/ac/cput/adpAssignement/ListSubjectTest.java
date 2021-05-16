package za.ac.cput.adpAssignement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/*
 * Author: Robin White
 * Student Number: 218034555
 * Description: Test case for List
 */
class ListSubjectTest {

    private final ArrayList<Subject> subjectList = new ArrayList<>();

    @BeforeEach                                 //Creates and Displays a Default list with 3 subjects
    void setUp() {
        Subject s1 = new Subject("ADP","ADP262S");
        Subject s2 = new Subject("CNF","CNF262S");
        Subject s3 = new Subject("MUF","MUF262S");

        subjectList.add(s1);
        subjectList.add(s2);
        subjectList.add(s3);
        System.out.println("Default List");
        System.out.println(subjectList);
        System.out.println("___________________________________________");
    }


    @Test
        //Adds subject to list
    void listAdd(){
        Subject s4 = new Subject("ITS", "ITS262S");
        subjectList.add(s4);                              //Adds 4th subject to list

        System.out.println("List after new subject is added:");
        System.out.println(subjectList);                  //Displays list with 4 subject added
        assertEquals(4,subjectList.size());      //Checks that there are 4 subjects in the list
    }


    @Test                                          //Removes subject from list
    void listRemove(){

        subjectList.remove(1);              //Removes subject at index 1
        System.out.println("List after subject is removed:");
        System.out.println(subjectList);           //Displays list after subject removed
        assertEquals(2 ,subjectList.size()); //Checks that there are 2 subjects remaining in the list
    }


    @Test                                          //Finds subject in List
    void listFind(){
        System.out.println("Subject at index 0: "+ subjectList.get(0));    //Gets and displays subject at index 0
    }

}