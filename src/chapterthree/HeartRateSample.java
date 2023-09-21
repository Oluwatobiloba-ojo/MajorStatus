package chapterthree;

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRateSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        //System.out.println(date.getYear());
        int dateNow = date.getYear();

        HeartRate myHeart = new HeartRate("Oluwaseun","Ojo", 03,2005,31);

        System.out.print("Enter your name: ");
        String theName = input.nextLine();
        myHeart.setFirstName(theName);

        System.out.print("\nEnter your last name: ");
        String theLast = input.nextLine();
        myHeart.setLastName(theLast);

        System.out.print("\nEnter the month your where born: ");
        int theMonth = input.nextInt();
        myHeart.setMonthOfBirth(theMonth);

        System.out.print("\nEnter the year you where born: ");
        int theYear = input.nextInt();
        myHeart.setYearOfBirth(theYear);

        int age = dateNow - theYear;

        System.out.printf("\nYour age from the calculation is %d",age);

        myHeart.maximumHeartRate();
        System.out.printf("\nMaximum heart rate is %f",myHeart.maximumHeartRate());

        System.out.print("\nYou will have to write a percentage of your heart rate in which " +
                "\nthe range is from " + "50% to 85% but for this app our moderate heartrate is 50% and 70 " +
                "\nso for our vigorous activity on the heart is between 70% and 85%  ");

        System.out.print("\nEnter the first range percentage your target heart rate: ");
        int thePer = input.nextInt();

        System.out.print("\nEnter the second range percentage of your target heart rate: ");
        int theExcercise1 = input.nextInt();

        System.out.printf("Their target rate range during the workout is %.2fBpm - %.2fBpm",
                myHeart.TargetMaximumRate(theExcercise1),myHeart.TargetMaximumRate2(thePer));


    }
}
