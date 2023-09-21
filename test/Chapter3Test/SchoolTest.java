package Chapter3Test;

import org.junit.jupiter.api.Test;
import chapterthree.School;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    @Test
public void testThatSchoolExist() {
        School mySchool = new School("Onitolo","Brown",947382);
        assertNotNull(mySchool);
    }
    @Test
    public void testThatSchoolHasAName(){
        School mySchool = new School("Obele","Blue",12456);
        String name = mySchool.getName();
        assertNotNull("Obele",name);
    }

    @Test
    public void testThatSchoolHasAColor(){
        School mySchool = new School("Agege","Red",1245);
        String name = mySchool.getName();
        assertNotNull("Agege",name);
        String color = mySchool.getColor();
        assertNotNull("Red",color);
    }
    @Test
    public void testTheNumberOfStudent() {
        School mySchool = new School("Convenant","Gold",124);
        String name = mySchool.getName();
        assertNotNull("Convenant",name);

        String color = mySchool.getColor();
        assertNotNull("Gold",color);

        int number = mySchool.getNumberOfStudent();
        assertEquals(124,number);
    }
}