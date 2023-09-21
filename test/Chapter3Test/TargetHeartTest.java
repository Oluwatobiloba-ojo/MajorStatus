package Chapter3Test;

import chapter_3.TargetHeart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TargetHeartTest {
    TargetHeart myHeart;
    @BeforeEach
    public void setMyHeart(){
        myHeart = new TargetHeart();
    }
    @Test
    public void testThatTargetHeartCanStoreName(){
        // Given
        assertNotNull(myHeart);

        // When
        myHeart.setName("Tobiah");
        String name = myHeart.getName();
        myHeart.setLastName("Ojo");
        String theName = myHeart.getLastName();

        //Check
        assertEquals("Tobiah",name);
        assertEquals("Ojo",theName);
    }
    @Test
    public void testThatTargetHeartRateCanTakeInDateOfBirth(){
        // Given
        assertNotNull(myHeart);

        //When
        myHeart.setMonthOfBirth("March");
        String month = myHeart.getMonthOfBirth();
        myHeart.setDayOfBirth(23);
        int theDay = myHeart.getDayOfBirth();
        myHeart.setYearOfBirth(2004);
        int theYear = myHeart.getYearOfBirth();

        // Check
        assertEquals("March",month);
        assertEquals(23,theDay);
        assertEquals(2004,theYear);
    }
    @Test
    public void testThatTargetHeartRateCanCalculateAge(){
        // Given
        assertNotNull(myHeart);
        myHeart.setDayOfBirth(31);
        assertEquals(31,myHeart.getDayOfBirth());
        myHeart.setMonthOfBirth("April");
        assertEquals("April",myHeart.getMonthOfBirth());
        myHeart.setYearOfBirth(2001);
        assertEquals(2001,myHeart.getYearOfBirth());
        //When
        int age = myHeart.displayAge();
        assertEquals(22,age);
    }
    @Test
    public void testThatTargetHeartRateCanCalculateMaximumHeartRate(){
        // Given
        assertNotNull(myHeart);
        myHeart.setDayOfBirth(31);
        assertEquals(31,myHeart.getDayOfBirth());
        myHeart.setMonthOfBirth("April");
        assertEquals("April",myHeart.getMonthOfBirth());
        myHeart.setYearOfBirth(2001);
        assertEquals(2001,myHeart.getYearOfBirth());
        int age = myHeart.displayAge();
        assertEquals(22,age);
        // When
       int maximum = myHeart.displayMaximumHeartRate(age);
       //Check
        assertEquals(198,maximum);
    }
    @Test
    public void testThatTargetHeartRateCanCalculateTargetHeartRate(){
        //Given
        assertNotNull(myHeart);
        myHeart.setYearOfBirth(2001);
        assertEquals(2001,myHeart.getYearOfBirth());
        myHeart.setMonthOfBirth("March");
        assertEquals("March",myHeart.getMonthOfBirth());
        myHeart.setDayOfBirth(31);
        assertEquals(31,myHeart.getDayOfBirth());
        int age = myHeart.displayAge();
        assertEquals(22,age);
        int maximum = myHeart.displayMaximumHeartRate(age);
        assertEquals(198,maximum);
        // When
        double target1 = myHeart.displayTargetHeartRateRange1(50);
        double target2 =  myHeart.displayTargetHeartRateRange2(85);
        //Check
        assertEquals(99.00,target1);
        assertEquals(168.0,target2);
    }
}
