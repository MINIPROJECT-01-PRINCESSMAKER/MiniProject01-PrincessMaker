package miniproject1.princessmaker.model.activity;

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.Stats;

public class MilitaryTraining extends BaseActivity {
    public MilitaryTraining() {
        super("정훈교육", "지력과 기품이 향상됩니다.", 15);
    }

    @Override
    protected void applyStatChanges(Princess princess, double multiplier) {
        Stats stats = princess.getStats();

        int intelligenceGain = (int) ((3 + random.nextInt(3)) * multiplier);
        int eleganceGain = (int) ((1 + random.nextInt(2)) * multiplier);

        // 직업 보너스 적용
        intelligenceGain = princess.getCurrentJob().applyBonus("intelligence", intelligenceGain);
        eleganceGain = princess.getCurrentJob().applyBonus("elegance", eleganceGain);

        stats.increaseIntelligence(intelligenceGain);
        stats.increaseElegance(eleganceGain);
    }
}