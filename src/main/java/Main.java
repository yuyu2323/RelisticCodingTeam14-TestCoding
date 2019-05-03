import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("2007년 이후 날짜를 입력해주세요 (YYYY MM DD) :");
        String day = sc.nextLine();

        Date date = new Date(day);

        System.out.println(date.getDate());


    }
}
