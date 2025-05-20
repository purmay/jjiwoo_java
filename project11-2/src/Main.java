import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;         // 총합
        int count = 0;       // 유효한 점수 개수

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");

            // 입력이 정수인지 검사
            if (!scanner.hasNextInt()) {
                System.out.println("⚠️ 정수를 입력해야 합니다.");
                scanner.next(); // 잘못된 입력 무시
                continue;
            }

            int score = scanner.nextInt();

            // 음수 입력 시 반복 종료
            if (score < 0) {
                break;
            }

            // 유효한 점수 누적
            sum += score;
            count++;
        }

        // 결과 출력
        if (count == 0) {
            System.out.println("입력된 점수가 없습니다.");
        } else {
            System.out.println("점수의 총합은: " + sum);
        }

        scanner.close();
    }
}
