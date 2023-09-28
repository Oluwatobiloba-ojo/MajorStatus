package StudentMajorAndStatus;

import java.util.Scanner;

import static StudentMajorAndStatus.StudentMajorStatus.studentMajorMethod;

public class StudentMajorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stopper = "Start";
        while (!stopper.equals("END")) {
            System.out.println("Enter a character: ");
            String chars = input.nextLine();
            String result = studentMajorMethod(chars);
            System.out.println(result);
            System.out.println("""
                    ==========================================================
                    ENTER CONTINUE TO KEEP ON OR ENTER END TO STOP APPLICATION
                    ==========================================================
                    """);
            stopper = input.nextLine();
            stopper = stopper.toUpperCase();
        }
    }
}
