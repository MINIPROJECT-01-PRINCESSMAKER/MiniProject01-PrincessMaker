package princessmaker.model;

public class Activity {
    /* 이 클래스는 활동(운동,공부,사교)의 정보를 저장하는 클래스 */
    // 필드
    private String activityName;
    private String primaryStat; // 주로 증가하는 능력치
    private String secondaryStat; // 부수적으로 증가하는 능력치
    // 생성자
    public Activity(String activityName, String primaryStat, String secondaryStat) {
        this.activityName = activityName;
        this.primaryStat = primaryStat;
        this.secondaryStat = secondaryStat;
    }
    // getter
    public String getActivityName() {
        return activityName;
    }
    public String getPrimaryStat() {
        return primaryStat;
    }
    public String getSecondaryStat() {
        return secondaryStat;
    }
}
