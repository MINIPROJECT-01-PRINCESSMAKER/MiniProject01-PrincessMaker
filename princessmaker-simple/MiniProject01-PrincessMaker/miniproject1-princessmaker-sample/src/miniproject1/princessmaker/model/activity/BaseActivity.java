package miniproject1.princessmaker.model.activity;
/*  BaseActivity.java: Activity 인터페이스를 구현한 추상 클래스
    활동 실행 시 공통 로직 (성공률 계산, 애니메이션, 결과 출력)
    getStatChanges(): 각 활동이 오버라이드하여 스탯 변화량 정의

    - 구체적인 활동 클래스들: BaseActivity를 상속하여 각 활동의 스탯 변화 정의*/

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.Stats;

import java.util.Map;
import java.util.Random;

public abstract class BaseActivity implements Activity {
    protected String activityName;
    protected String description;
    protected int baseFatigue;
    protected Random random;

    public BaseActivity(String activityName, String description, int baseFatigue) {
        this.activityName = activityName;
        this.description = description;
        this.baseFatigue = baseFatigue;
        this.random = new Random();
    }

    @Override
    public void execute(Princess princess) {
        Stats stats = princess.getStats();

        // 성공률 계산
        int successRate = calculateSuccessRate(stats);
        int result = random.nextInt(100);

        // 결과에 따른 배율
        double multiplier;
        String resultMessage;

        if (result < successRate * 0.2) {
            multiplier = 1.5;
            resultMessage = "대성공!";
        } else if (result < successRate * 0.6) {
            multiplier = 1.2;
            resultMessage = "성공!";
        } else if (result < successRate) {
            multiplier = 1.0;
            resultMessage = "보통";
        } else {
            multiplier = 0.5;
            resultMessage = "실패...";
        }

        // 스탯 변화 적용
        applyStatChanges(princess, multiplier);

        // 피로 증가
        stats.increaseFatigue(baseFatigue);

        // 결과 출력 정보 저장 (실제 출력은 OutputView에서)
        princess.getStats().increaseGrit(1); // 근성 소폭 증가
    }

    protected int calculateSuccessRate(Stats stats) {
        int baseRate = 70;
        int gritBonus = stats.getGrit() / 5;
        int fatiguePenalty = stats.getFatigue() / 5;
        return Math.max(30, Math.min(95, baseRate + gritBonus - fatiguePenalty));
    }

    protected abstract void applyStatChanges(Princess princess, double multiplier);

    @Override
    public String getActivityName() {
        return activityName;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
