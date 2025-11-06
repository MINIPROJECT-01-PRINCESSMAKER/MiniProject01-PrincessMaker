package princessmaker.model;

public abstract class Job {
    /* 모든 직업의 부모 클래스. 직업의 공통 기능을 정의 */

    // 필드
    protected String jobName; // 직업 이름
    protected String bonusStat; // 보너스를 받는 능력치 이름

    // 생성자
    public Job(String jobName, String bonusStat) {
        this.jobName = jobName;
        this.bonusStat = bonusStat;
    }
    // getter
    public String getJobName(){
        return jobName;
    }
    public String getBonusStat() {
        return bonusStat;
    }
    // 추상 메서드 (자식이 구현할 값)
    public abstract double getStatBonus();  // 능력치 보정값 반환(자식이 구현)
    public abstract String getActivityMessage(String activityName); // 활동 메시지 반환(자식이 구현)

}
