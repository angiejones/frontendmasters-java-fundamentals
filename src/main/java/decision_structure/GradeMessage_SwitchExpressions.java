package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch(grade){
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            //when you need to execute multiple statements.
            case "C" -> {
                System.out.println("print");
                yield "Good job!"; //last line must yield
            }
            //match multiple cases
            case "D", "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };

        System.out.println(message);
    }
}