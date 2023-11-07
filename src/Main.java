import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your grade: /n");
            int grade = scanner.nextInt();
            char studentGrade;

            if (grade <= 100) {
                switch (grade / 10) {
                    case 10:
                    case 9:
                        studentGrade = 'A';
                        break;
                    case 8:
                        studentGrade = 'B';
                        break;
                    case 7:
                        studentGrade = 'C';
                        break;
                    case 6:
                        studentGrade = 'D';
                        break;

                    default:
                        studentGrade = 'F';
                }
            } else {
                studentGrade = 'I';
            }

            System.out.println("student grade: " + studentGrade);
        }


    }
}