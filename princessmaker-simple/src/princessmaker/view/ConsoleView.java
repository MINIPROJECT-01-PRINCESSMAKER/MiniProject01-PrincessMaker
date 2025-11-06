package princessmaker.view;

import princessmaker.model.Princess;

import java.util.Scanner;

public class ConsoleView {
    Scanner sc = new Scanner(System.in);

    // 메서드
    // 환영메시지 출력
    public void showWelcome(){
        System.out.println("Princess Maker를 시작합니다!");
    }
    // 이름받는 칸
    public String inputName(){
        System.out.print("Princess의 이름을 설정해주세요 : ");
        String name = sc.nextLine().trim();
        return name;
    }
    // INTRO
    public void showIntro(Princess princess){
        System.out.println("");
        System.out.println("============================================");
        System.out.println(princess.getName() + "님, 환영합니다! 이제 게임을 시작합니다.");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("<Enter를 누르면 이어서 스토리가 나옵니다.>");
        System.out.print(princess.getName() + "은(는) 원래 왕국의 공주였습니다. 하지만 반역자들에 의해 왕과 왕비는 폐위되어 감옥에 갇히게 되었고, \n당신은 왕의 충직한 신하로서 아기였던 공주를 빼돌려 옆 왕국으로 도망쳤습니다.");
        sc.nextLine();

        System.out.print("당신은 공주의 신분을 숨기고 키우며 살아왔지만, 이제 2년 후면 그녀는 성인이 됩니다.");
        sc.nextLine();

        System.out.print("당신은 그녀의 미래를 당신 마음대로 좌지우지하는 것은 옳지 않다는 것을 알고 있습니다.");
        sc.nextLine();

        System.out.print("그렇기에 공주가 성인이 되면 그녀의 출생에 대한 진실을 알려주리라 결심했고, \n이후 성인이 된 그녀가 맞이할 미래를 위해 왕국의 공주로서 도움이 되는 능력을 기르게 하고 싶습니다.");
        sc.nextLine();

        System.out.print("그녀에게 필요하다고 생각되는 활동을 권유하여 미래에 대비하게 하세요.");
        sc.nextLine();
    }

    // 활동 선택
    public int selectActivity(Princess princess){
        System.out.println("\n==============================");
        System.out.println(princess.getFormattedDate());
        System.out.println("오늘은 어떤 활동을 하실건가요?");
        System.out.println("1. 운동(체력↑↑, 지능↑)");
        System.out.println("2. 공부(지능↑↑, 매력↑)");
        System.out.println("3. 사교(매력↑↑, 체력↑)");
        return sc.nextInt();
    }
    // 활동 중 화면
    public void showActivityProgress(String activityName, String message) {
        System.out.println("\n" + message);
        System.out.println("진행중...");
    }
    // 활동 결과
    public void showActivityResult(String stat1, int amount1, String stat2, int amount2, Princess princess) {
        System.out.println("\n대성공!!");
        System.out.println(stat1 + "이(가) " + amount1 + "상승했습니다!");
        System.out.println(stat2 + "이(가) " + amount2 + "상승했습니다!");
        System.out.println("[체력 : " + princess.getPhysical() + "] [지력 : " + princess.getIntelligence() + "] [매력 : " + princess.getCharm() + "]" );
    }
    // 12개월 경과 후 직업선택
    public int selectJob(Princess princess) {
        System.out.println("12개월이 지났습니다!");
        System.out.println(princess.getName() + "의 직업을 선택해주세요.");
        System.out.println("1. 군인 (체력 보정 +50%)");
        System.out.println("2. 학자 (지능 보정 +50%)");
        System.out.println("3. 연예인 (매력 보정 +50%)");
        System.out.print("번호를 선택하세요 : ");
        return sc.nextInt();
    }
    public void showJobMessage(Princess princess) {
        System.out.println(princess.getName() + "은(는) " + princess.getJob().getJobName() + "에 취직했다!");
        System.out.println("이제부터 직업에 따른 능력치 상승률이 증가합니다!");
    }
    public void showEnding(String endingName, String message){
        System.out.println("게임 종료!");
        System.out.println("엔딩: " + endingName);
        System.out.println(message);
    }
    public void close(){
        sc.close();
    }
}
