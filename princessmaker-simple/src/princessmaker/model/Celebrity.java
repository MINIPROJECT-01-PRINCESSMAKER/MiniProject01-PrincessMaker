package princessmaker.model;

public class Celebrity extends Job {
    // 생성자
    public Celebrity(String jobName, String bonusStat) {
        super(jobName, bonusStat);
    }
    // 메소드 재정의(오버라이드)
    @Override
    public double getStatBonus() {
        return 0.5;
    }
    @Override
    public String getActivityMessage(String activityName) {
        return "연애인답게 " + activityName + "을 수행했다~";
    }
}
