package princessmaker.model;

public class Scholar extends Job {
    // 생성자
    public Scholar(String jobName, String bonusStat) {
        super(jobName, bonusStat);
    }
    // 메소드 재정의(오버라이드)
    @Override
    public double getStatBonus() {
        return 0.5;
    }
    @Override
    public String getActivityMessage(String activityName) {
        return "학자답게 " + activityName + "을 수행했다.";
    }
}
