package Chapter3Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import chapterthree.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
Account tobiAccount;
@BeforeEach
public void setTobiAccount(){
 tobiAccount = new Account("Jane", 0.00);
}
 @Test
    public void depositTest(){
        // given
        // when
     tobiAccount.deposit(5000);
        //check
     double balance = tobiAccount.checkBalance();
     assertEquals(5000,balance);
    }

    @Test
    public void depositMultipleTimes(){
     tobiAccount.deposit(2000);
     double balance1 = tobiAccount.checkBalance();
     assertEquals(2000,balance1);

     tobiAccount.deposit(1000);
     double balance2 = tobiAccount.checkBalance();
     assertEquals(3000,balance2);

     tobiAccount.deposit(500);
     double balance3 = tobiAccount.checkBalance();
     assertEquals(3500,balance3);
 }

 @Test
    public void withdrawTest() {
     tobiAccount.deposit(2500);
     double balance = tobiAccount.checkBalance();
     assertEquals(2500, balance);

     tobiAccount.deposit(1000);
     double balance2 = tobiAccount.checkBalance();
     assertEquals(3500, balance2);

     tobiAccount.withdraw(1000);
     double balance3 = tobiAccount.checkBalance();
     assertEquals(2500,balance3);
 }

 @Test
    public void withdrawMultipleTest() {
     tobiAccount.deposit(1000);
     double balance = tobiAccount.checkBalance();
     assertEquals(1000,balance);

     tobiAccount.deposit(1200);
     double balance1 = tobiAccount.checkBalance();
     assertEquals(2200,balance1);

     tobiAccount.withdraw(500);
     double balance2 = tobiAccount.checkBalance();
     assertEquals(1700,balance2);

     tobiAccount.withdraw(1000);
     double balance3 = tobiAccount.checkBalance();
     assertEquals(700,balance3);
 }

}