package chapterthree;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int yearOfBirth;
    private int dayOfBirth;
    private double targetMaximumRange1;
    private double targetMaximumRange2;

    public HeartRate(String firstName, String lastName, int monthOfBirth, int yearOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }
    public  int calculateAge(){
        int constant = 2023;
        return constant - yearOfBirth;
    }

    public double maximumHeartRate() {
        int minute = 220;
        int maximumHeart;
        maximumHeart = minute - calculateAge();
        return maximumHeart;
    }

    public int getMaximumHeartRate() {
        return (int) maximumHeartRate();
    }

    public void TargetMaximumRate(int excercise) {
        if (excercise == 50) {
            this.targetMaximumRange1 = maximumHeartRate() * 0.50;
        }
        if (excercise == 70) {
            this.targetMaximumRange1 = maximumHeartRate() * 0.70;
        }
    }
    public double getTargetMaximumRange1(){
        return targetMaximumRange1;
    }

    public void TargetMaximumRate2(int excercise2) {
        if (excercise2 == 70) {
            this.targetMaximumRange2 = maximumHeartRate() * 0.70;
        }
        if (excercise2 == 85) {
            this.targetMaximumRange2 = maximumHeartRate() * 0.85;
        }
    }
    public double getTargetMaximumRange2(){
        return targetMaximumRange2;
    }

}
