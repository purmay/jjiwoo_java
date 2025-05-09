import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 (0 ~ 100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력입니다. 점수는 0에서 100 사이여야 합니다.");
            return;
        }

        String grade;
        switch (score / 10) {
            case 10: // 100점
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }

        System.out.println("학점은 " + grade + "입니다.");
    }
}
