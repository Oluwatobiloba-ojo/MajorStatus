package chapterthree;
public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int dateOfBirth;
    private int yearOfBirth;
    private int monthOfYear;
    private double height;
    private double weight;

    public HealthProfile(String name, String lastName, String gender, int dateOfBirth, int yearOfBirth
            , int monthOfYear, double height, double weight) {
        firstName = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.monthOfYear = monthOfYear;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        firstName = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMonthOfYear(int monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMonthOfYear() {
        return monthOfYear;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int calculateAge(){
        int yearNow = 2023;
        return yearNow - yearOfBirth;
    }
    public int maximumHeartRate() {
        int constant = 220;
        return constant - calculateAge();
    }
    public double calculateBMI() {
        double value = weight / (height * height);
        double result = value * 730;
        String fakeResult = String.format("%.2f",result);
        return Double.parseDouble(fakeResult);
    }

    public String TargetHeartRange(int percentage) {
        double targetHeartRange1 = 0;
        if (percentage == 50) {
            targetHeartRange1 = maximumHeartRate() * 0.50;
        }
        if (percentage == 70) {
            targetHeartRange1 = maximumHeartRate() * 0.70;
        }
        return String.format("%.2f",targetHeartRange1);
    }
    public String TargetHeartRange2(int percentage2) {
        double targetHeartRange2 = 0;
        if (percentage2 == 70) {
            targetHeartRange2 = maximumHeartRate() * 0.70;
        }
        if (percentage2 == 85) {
            targetHeartRange2 = maximumHeartRate() * 0.85;
        }
        return String.format("%.2f",targetHeartRange2);
    }
}