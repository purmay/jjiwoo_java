import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수 입력
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        // 과목 수 입력
        System.out.print("과목 수를 입력하세요: ");
        int subjectCount = scanner.nextInt();

        // 2차원 배열 선언
        int[][] scores = new int[studentCount][subjectCount];

        // 점수 입력
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        // 성적표 출력
        System.out.println("\n--- 성적표 ---");
        for (int i = 0; i < studentCount; i++) {
            System.out.print((i + 1) + "번 학생: ");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
