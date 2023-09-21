package Chapter3Test;

import chapterthree.HeartRate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TargetHeartTest {
    HeartRate myHeart;
    @BeforeEach
    public void setMyHeart(){
        myHeart = new HeartRate("Jenny", "Musa", 04,
                2004, 31);
    }
    @Test
    public void testThatTargetHeartCanStoreName(){
        // Given
        assertNotNull(myHeart);

        // When
        myHeart.setFirstName("Tobiah");
        String name = myHeart.getFirstName();
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
        myHeart.setMonthOfBirth(12);
        int month = myHeart.getMonthOfBirth();
        myHeart.setDayOfBirth(23);
        int theDay = myHeart.getDayOfBirth();
        myHeart.setYearOfBirth(2004);
        int theYear = myHeart.getYearOfBirth();

        // Check
        assertEquals(12,month);
        assertEquals(23,theDay);
        assertEquals(2004,theYear);
    }
    @Test
    public void testThatTargetHeartRateCanCalculateAge(){
        // Given
        assertNotNull(myHeart);
        myHeart.setDayOfBirth(31);
        assertEquals(31,myHeart.getDayOfBirth());
        myHeart.setMonthOfBirth(04);
        assertEquals(04,myHeart.getMonthOfBirth());
        myHeart.setYearOfBirth(2001);
        assertEquals(2001,myHeart.getYearOfBirth());
        //When
        int age = myHeart.calculateAge();
        assertEquals(22,age);
    }
    @Test
    public void testThatTargetHeartRateCanCalculateMaximumHeartRate(){
        // Given
        assertNotNull(myHeart);
        myHeart.setDayOfBirth(31);
        assertEquals(31,myHeart.getDayOfBirth());
        myHeart.setMonthOfBirth(04);
        assertEquals(04,myHeart.getMonthOfBirth());
        myHeart.setYearOfBirth(2001);
        assertEquals(2001,myHeart.getYearOfBirth());
        int age = myHeart.calculateAge();
        assertEquals(22,age);
        // When
       double maximum = myHeart.maximumHeartRate();
       //Check
        assertEquals(198,maximum);
    }
    @Test
    public void testThatTargetHeartRateCanCalculateTargetHeartRate(){
        //Given
        assertNotNull(myHeart);
        myHeart.setYearOfBirth(2001);
        assertEquals(2001,myHeart.getYearOfBirth());
        myHeart.setMonthOfBirth(03);
        assertEquals(03,myHeart.getMonthOfBirth());
        myHeart.setDayOfBirth(31);
        assertEquals(31,myHeart.getDayOfBirth());
        int age = myHeart.calculateAge();
        assertEquals(22,age);
        double maximum = myHeart.maximumHeartRate();
        assertEquals(198,maximum);
        // When
        double target1 = myHeart.TargetMaximumRate(50);
        double target2 =  myHeart.TargetMaximumRate2(85);
        //Check
        assertEquals(99.00,target1);
        assertEquals(168.3,target2);
    }
}
