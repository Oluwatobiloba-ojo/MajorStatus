package chapterthree;

public class School {
private String name;
private String color;
private int numberOfStudent;

    public School(String name,String color,int numberOfStudent) {
        this.name = name;
        this.color = color;
        this.numberOfStudent = numberOfStudent;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
}
