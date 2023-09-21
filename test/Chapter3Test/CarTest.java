package Chapter3Test;

import chapterthree.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void testThatCarExist(){
        Car myCar;
        myCar = new Car("Toyota", 2004, 30000.00, 4);
        assertNotNull(myCar);
    }
    @Test
    public void testThatCarHasAName(){
        Car myCar;
        myCar = new Car("Siena", 4000, 4000.00, 3);
        myCar.setName("Toyota");
        assertEquals("Toyota", myCar.getName());

        myCar.setModel(2000);
        assertEquals(2000, myCar.getModel());

        myCar.setPrice(3000.00);
        assertEquals(3000.00, myCar.getPrice());
    }
    @Test
    public void testThatNegativeValueOfPriceCanNotBeUsedToSetPrice(){
        Car myCar;
        myCar = new Car("Toyota", 2004, 3000, 5);
        myCar.setPrice(-4000);
        assertEquals(3000, myCar.getPrice());
    }
    @Test
    public void testThatTwoObjectOfCarCanHaveDifferentPriceAndCalculatePercentage(){
        Car myCar = new Car("Toyota", 3004, 5000, 3);
        assertEquals(5000, myCar.getPrice());
        Car ourCar = new Car("Camry", 2010, 10000, 4);
        assertEquals(10000, ourCar.getPrice());

        myCar.percentageOf(5);
        assertEquals(4750.0, myCar.getPrice());
        ourCar.percentageOf(7);
        assertEquals(9300.0, ourCar.getPrice());
    }
}
