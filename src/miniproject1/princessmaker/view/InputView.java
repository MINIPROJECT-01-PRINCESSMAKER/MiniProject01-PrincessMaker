package miniproject1.princessmaker.view;

import miniproject1.princessmaker.model.activity.Activity;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String inputPrincessName() {
        System.out.print("Princess의 이름을 설정해주세요: ");
        return scanner.nextLine().trim();
    }

    public int selectActivity(List<Activity> activities) {
        System.out.println("\n오늘은 어떤 활동을 하실 건가요?");
        for (int i = 0; i < activities.size(); i++) {
            System.out.println((i + 1) + ". " + activities.get(i).getActivityName());
        }
        System.out.print("번호를 선택하세요: ");

        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= activities.size()) {
                    return choice;
                }
                System.out.print("올바른 번호를 입력하세요: ");
            } catch (NumberFormatException e) {
                System.out.print("숫자를 입력하세요: ");
            }
        }
    }

    public int selectJob(List<String> jobs) {
        System.out.println("\n선택 가능한 직업:");
        for (String job : jobs) {
            System.out.println(job);
        }
        System.out.print("번호를 선택하세요: ");

        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= jobs.size()) {
                    return choice;
                }
                System.out.print("올바른 번호를 입력하세요: ");
            } catch (NumberFormatException e) {
                System.out.print("숫자를 입력하세요: ");
            }
        }
    }

    public void close() {
        scanner.close();
    }
}