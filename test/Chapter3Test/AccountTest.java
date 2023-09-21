package Chapter3Test;

import org.junit.jupiter.api.Test;
import tdd.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

 @Test
    public void depositTest(){
        // given
     Account tobiAccount = new Account();
        // when
     tobiAccount.deposit(5000);
        //check
     int balance = tobiAccount.checkBalance();
     assertEquals(5000,balance);
    }

    @Test
    public void depositMultipleTimes(){

     Account tobiAccount = new Account();

     tobiAccount.deposit(2000);
     int balance1 = tobiAccount.checkBalance();
     assertEquals(2000,balance1);

     tobiAccount.deposit(1000);
     int balance2 = tobiAccount.checkBalance();
     assertEquals(3000,balance2);

     tobiAccount.deposit(500);
     int balance3 = tobiAccount.checkBalance();
     assertEquals(3500,balance3);
 }

 @Test
    public void withdrawTest() {
     Account tobiAccount = new Account();

     tobiAccount.deposit(2500);
     int balance = tobiAccount.checkBalance();
     assertEquals(2500, balance);

     tobiAccount.deposit(1000);
     int balance2 = tobiAccount.checkBalance();
     assertEquals(3500, balance2);

     tobiAccount.withdraw(1000);
     int balance3 = tobiAccount.checkBalance();
     assertEquals(2500,balance3);
 }

 @Test
    public void withdrawMultipleTest() {
     Account tobiAccount = new Account();
     tobiAccount.deposit(1000);
     int balance = tobiAccount.checkBalance();
     assertEquals(1000,balance);

     tobiAccount.deposit(1200);
     int balance1 = tobiAccount.checkBalance();
     assertEquals(2200,balance1);

     tobiAccount.withdraw(500);
     int balance2 = tobiAccount.checkBalance();
     assertEquals(1700,balance2);

     tobiAccount.withdraw(1000);
     int balance3 = tobiAccount.checkBalance();
     assertEquals(700,balance3);
 }

}