package miniproject1.princessmaker.model.job;

public class Unemployed extends Job {
    public Unemployed() {
        super("무직", "아직 직업이 없습니다.");
    }

    @Override
    public int applyBonus(String statType, int baseStat) {
        // 보너스 없음
        return baseStat;
    }
}