package StudentMajorAndStatus;

public class StudentMajorStatus {
    public static String studentMajorMethod(String input) {
        input = input.toUpperCase();
        String firstChar = String.valueOf(input.charAt(0));
        String secondChar = String.valueOf(input.charAt(input.length() - 1));
        String result = "";
        switch (firstChar){
            case "M" -> result = mathematics(firstChar,secondChar);
            case "C" -> result = computer(firstChar,secondChar);
            case "I" -> result = informationTechnology(firstChar, secondChar);
            default -> result = "Invalid input";
        }
        return result;
    }

    private static String informationTechnology(String firstChar, String secondChar) {
        String result = "";
        if (firstChar.equals("I") && secondChar.equals("1")) {
            result = "Information Technology freshman";
        } else if (firstChar.equals("I") && secondChar.equals("2")) {
            result = "Information Technology sophomore";
        } else if (firstChar.equals("I") && secondChar.equals("3")) {
            result = "Information Technology junior";
        } else if (firstChar.equals("I") && secondChar.equals("4")) {
            result = "Information Technology senior";
        } else {
            result = "Invalid input";
        }
        return result;
    }
    private static String computer(String firstChar, String secondChar) {
        String result = "";
        if (firstChar.equals("C") && secondChar.equals("1")) {
            result = "Computer Science freshman";
        } else if (firstChar.equals("C") && secondChar.equals("2")) {
            result = "Computer Science sophomore";
        } else if (firstChar.equals("C") && secondChar.equals("3")) {
            result = "Computer Science junior";
        } else if (firstChar.equals("C") && secondChar.equals("4")) {
            result = "Computer Science senior";
        }else {
            result = "Invalid input";
        }
        return result;
    }
    public static String mathematics(String firstChar, String secondChar) {
        String result = "";
        if (firstChar.equals("M") && secondChar.equals("1")) {
            result = "Mathematics freshman";
        } else if (firstChar.equals("M") && secondChar.equals("2")) {
            result = "Mathematics sophomore";
        } else if ((firstChar.equals("M") && secondChar.equals("3"))) {
            result = "Mathematics junior";
        } else if (firstChar.equals("M") && secondChar.equals("4")) {
            result = "Mathematics senior";
        }else {
            result = "Invalid input";
        }
        return result;
    }
}
