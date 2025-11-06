package miniproject1.princessmaker.model.job;

public class Freelancer extends Job {
    public Freelancer() {
        super("프리랜서", "자유로운 프리랜서입니다.");
    }

    @Override
    public int applyBonus(String statType, int baseStat) {
        // 보너스 없음
        return baseStat;
    }
}