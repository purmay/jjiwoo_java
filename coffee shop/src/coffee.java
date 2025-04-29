import java.util.Scanner;

public class coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int drinkPrice = 0;
        int sizePrice = 0;
        int optionPrice = 0;

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkChoice = scanner.nextInt();

        switch (drinkChoice) {
            case 1:
                drinkPrice = 3000;
                break;
            case 2:
                drinkPrice = 4000;
                break;
            case 3:
                drinkPrice = 4500;
                break;
            default:
                System.out.println("지원하지 않는 음료입니다. 프로그램을 종료합니다.");
                scanner.close();
                return;
        }

        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        int sizeChoice = scanner.nextInt();

        switch (sizeChoice) {
            case 1:
                sizePrice = 0; // Small은 추가요금 없음
                break;
            case 2:
                sizePrice = 500; // Medium은 +500원
                break;
            case 3:
                sizePrice = 1000; // Large는 +1000원
                break;
            default:
                System.out.println("잘못된 크기 선택입니다. 프로그램을 종료합니다.");
                scanner.close();
                return;
        }

        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        int optionChoice = scanner.nextInt();

        switch (optionChoice) {
            case 1:
                optionPrice = 0; // 기본
                break;
            case 2:
                optionPrice = 500; // 샷 추가
                break;
            case 3:
                optionPrice = 300; // 시럽 추가
                break;
            case 4:
                optionPrice = 800; // 샷+시럽 추가
                break;
            default:
                System.out.println("잘못된 옵션 선택입니다. 프로그램을 종료합니다.");
                scanner.close();
                return;
        }

        int totalPrice = drinkPrice + sizePrice + optionPrice;
        System.out.println("최종 가격은 " + totalPrice + "원입니다.");

        scanner.close();
    }
}
