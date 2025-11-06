package miniproject1.princessmaker.model.job;

public class Politician extends Job {
    public Politician() {
        super("정치 보좌관", "정치력과 사교성이 향상됩니다.");
    }

    @Override
    public int applyBonus(String statType, int baseStat) {
        // 정치력, 사교성 +30%
        if (statType.equals("politics") || statType.equals("social")) {
            return (int) (baseStat * 1.3);
        }
        return baseStat;
    }
}