package Chapter3Test;

import chapterthree.HealthProfile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {
    HealthProfile myHealth;
    @BeforeEach
    public void setMyHealth(){
        myHealth = new HealthProfile("Tobi","Ojo", "Male", 31,
                03, 2004, 3.76, 200);
    }
    @Test
    public void testThatHealthProfileCollectInformationFromPatient(){
        myHealth.setName("Opeoluwa");
        assertEquals("Opeoluwa", myHealth.getName());

        myHealth.setLastName("Ogunbemi");
        assertEquals("Ogunbemi", myHealth.getLastName());

        myHealth.setGender("Female");
        assertEquals("Female", myHealth.getGender());

        myHealth.setDateOfBirth(23);
        assertEquals(23, myHealth.getDateOfBirth());

        myHealth.setMonthOfYear(06);
        assertEquals(6,myHealth.getMonthOfYear());

        myHealth.setYearOfBirth(2001);
        assertEquals(2001, myHealth.getYearOfBirth());

        myHealth.setHeight(5.56);
        assertEquals(5.56, myHealth.getHeight());

        myHealth.setWeight(400);
        assertEquals(400, myHealth.getWeight());
    }
    @Test
    public void testThatHealthProfileCanTestForBodyMassIndex(){
        myHealth.setWeight(400);
        myHealth.setHeight(5.56);
        assertEquals(9445.68, myHealth.calculateBMI());
    }
    @Test
    public void testThatHealthProfileCanCalculateAge(){
        myHealth.setYearOfBirth(2004);
        assertEquals(19, myHealth.calculateAge());
    }
    @Test
    public void testThatHealthProfileCanCalculateMaximumHeartRate(){
        myHealth.setYearOfBirth(2004);
        assertEquals(201, myHealth.maximumHeartRate());
    }
  @Test
    public void testThatHealthProfileCanCalculateTargetHeartRate(){
        myHealth.setYearOfBirth(2004);
        String result1 = myHealth.TargetHeartRange(50);
        assertEquals("100.50", result1);

        String result2 = myHealth.TargetHeartRange2(70);
        assertEquals("140.70", result2);
  }
}
