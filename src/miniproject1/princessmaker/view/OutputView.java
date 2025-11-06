package miniproject1.princessmaker.view;

import miniproject1.princessmaker.model.Princess;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OutputView {

    public void printWelcome() {
        System.out.println("========================================");
        System.out.println("    PrincessMaker를 시작합니다!");
        System.out.println("========================================");
    }

    public void printNameSet(String name) {
        System.out.println("\n" + name + " 공주님의 육성을 시작합니다!\n");
    }

    public void printCurrentDate(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM");
        System.out.println("\n========================================");
        System.out.println("현재 날짜: " + date.format(formatter));
        System.out.println("========================================");
    }

    public void printActivityStart(String activityName) {
        System.out.println("\n" + activityName + "를(을) 하는 중");
    }

    public void printActivityAnimation() {
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void printActivityResult(Princess princess, String activityName) {
        System.out.println("\n활동 완료!");
        System.out.println("현재 스탯: " + princess.getStats().toString());

        if (princess.getStats().getFatigue() >= 80) {
            System.out.println("⚠️ 경고: 피로도가 매우 높습니다! 휴식이 필요합니다.");
        }
    }

    public void printJobSelectionStart() {
        System.out.println("\n========================================");
        System.out.println("       12개월이 지났습니다!");
        System.out.println("       직업 선택 시간입니다.");
        System.out.println("========================================");
    }

    public void printJobAssigned(String name, String jobName) {
        System.out.println("\n" + name + "은(는) " + jobName + "에 취직했습니다!");
        System.out.println("이제부터 직업에 따른 능력치 상승률 보정이 적용됩니다!\n");
    }

    public void printEnding(String endingName, Princess princess) {
        System.out.println("\n========================================");
        System.out.println("         24개월이 지났습니다!");
        System.out.println("========================================");
        System.out.println("\n최종 스탯: " + princess.getStats().toString());
        System.out.println("\n========================================");
        System.out.println("           엔딩: " + endingName);
        System.out.println("========================================");
        printEndingMessage(endingName, princess.getName());
    }

    private void printEndingMessage(String endingName, String name) {
        switch (endingName) {
            case "어둠의 마녀":
                System.out.println("\n" + name + "은(는) 어둠의 힘에 눈을 떴습니다...");
                System.out.println("세상은 그녀를 두려워하게 되었습니다.");
                break;
            case "방구석 폐인":
                System.out.println("\n" + name + "은(는) 집에만 틀어박혀 지내게 되었습니다...");
                System.out.println("아무것도 하지 않은 채 시간만 흘러갔습니다.");
                break;
            case "사령관":
                System.out.println("\n" + name + "은(는) 뛰어난 군사 지휘관이 되었습니다!");
                System.out.println("그녀의 이름은 역사에 길이 남을 것입니다.");
                break;
            case "톱스타":
                System.out.println("\n" + name + "은(는) 세계적인 스타가 되었습니다!");
                System.out.println("그녀의 아름다움과 매력은 모두를 사로잡았습니다.");
                break;
            case "대통령":
                System.out.println("\n" + name + "은(는) 국가의 정상에 올랐습니다!");
                System.out.println("그녀의 정치력으로 나라를 이끌어갑니다.");
                break;
            case "석학":
                System.out.println("\n" + name + "은(는) 위대한 학자가 되었습니다!");
                System.out.println("그녀의 연구는 세상을 변화시킬 것입니다.");
                break;
            case "평범한 직장인":
                System.out.println("\n" + name + "은(는) 평범하지만 행복한 삶을 살게 되었습니다.");
                System.out.println("때로는 평범한 것이 가장 소중한 것입니다.");
                break;
            case "취준생":
                System.out.println("\n" + name + "은(는) 아직 자신의 길을 찾고 있습니다.");
                System.out.println("하지만 포기하지 않는다면 언젠가는...");
                break;
        }
    }
}