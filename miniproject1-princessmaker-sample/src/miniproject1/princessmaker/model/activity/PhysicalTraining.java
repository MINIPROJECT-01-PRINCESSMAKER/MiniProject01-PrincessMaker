package miniproject1.princessmaker.model.activity;

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.Stats;

public class PhysicalTraining extends BaseActivity {
    public PhysicalTraining() {
        super("유격훈련", "체력과 근력이 향상됩니다.", 20);
    }

    @Override
    protected void applyStatChanges(Princess princess, double multiplier) {
        Stats stats = princess.getStats();

        int staminaGain = (int) ((3 + random.nextInt(3)) * multiplier);
        int strengthGain = (int) ((3 + random.nextInt(3)) * multiplier);

        // 직업 보너스 적용
        staminaGain = princess.getCurrentJob().applyBonus("stamina", staminaGain);
        strengthGain = princess.getCurrentJob().applyBonus("strength", strengthGain);

        stats.increaseStamina(staminaGain);
        stats.increaseStrength(strengthGain);
    }
}