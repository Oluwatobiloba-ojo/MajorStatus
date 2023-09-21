package Chapter3Test;

import chapterthree.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockTest {

    Clock myClock;
    @BeforeEach
    public void setUp(){
        myClock = new Clock(00,00,34);
    }
    @Test
    public void testThatClockCanExist(){
        assertNotNull(myClock);
    }

    @Test
    public void testThatClockCanBeSetInSecond(){
        myClock.setSecond(30);
        Assertions.assertEquals(30,myClock.getSecond());
    }

    @Test
    public void testThatClockCanBeSetInMinute(){
        myClock.setSecond(35);
        Assertions.assertEquals(35,myClock.getSecond());

        myClock.setMinute(30);
        Assertions.assertEquals(30,myClock.getMinute());
    }

    @Test
    public void testThatClockCanBeSetInHour(){
        myClock.setSecond(36);
        Assertions.assertEquals(36,myClock.getSecond());

        myClock.setMinute(30);
        Assertions.assertEquals(30,myClock.getMinute());

        myClock.setHour(12);
        Assertions.assertEquals(12,myClock.getHour());
    }
    @Test
    public void testThatClockCanDisplayInHourMinuteSecond(){
    myClock.display();
    assertEquals("0:0:34",myClock.display());

    myClock.setMinute(65);
    myClock.setHour(25);
    myClock.setSecond(40);
    assertEquals("0:0:40", myClock.display());
    }

}