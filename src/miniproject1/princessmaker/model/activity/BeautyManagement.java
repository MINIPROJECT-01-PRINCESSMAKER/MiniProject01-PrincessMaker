package miniproject1.princessmaker.model.activity;

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.Stats;

public class BeautyManagement extends BaseActivity {
    public BeautyManagement() {
        super("피부관리", "미모, 매력, 기품이 향상됩니다.", 10);
    }

    @Override
    protected void applyStatChanges(Princess princess, double multiplier) {
        Stats stats = princess.getStats();

        int beautyGain = (int) ((3 + random.nextInt(3)) * multiplier);
        int charmGain = (int) ((2 + random.nextInt(2)) * multiplier);
        int eleganceGain = (int) ((1 + random.nextInt(2)) * multiplier);

        // 직업 보너스 적용
        beautyGain = princess.getCurrentJob().applyBonus("beauty", beautyGain);
        charmGain = princess.getCurrentJob().applyBonus("charm", charmGain);
        eleganceGain = princess.getCurrentJob().applyBonus("elegance", eleganceGain);

        stats.increaseBeauty(beautyGain);
        stats.increaseCharm(charmGain);
        stats.increaseElegance(eleganceGain);
    }
}