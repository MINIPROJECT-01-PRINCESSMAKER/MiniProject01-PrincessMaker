package miniproject1.princessmaker.model;
/* Stats.java
 11개의 능력치를 관리 (엔딩 능력치 9개 + 근성 + 피로)
 능력치 증가/감소 메서드
 현재 능력치 조회 메서드 */

public class Stats {
    // 엔딩 분기 능력치
    private int beauty;      // 미모
    private int stamina;     // 체력
    private int strength;    // 근력
    private int intelligence;// 지력
    private int elegance;    // 기품
    private int charm;       // 매력
    private int morality;    // 도덕성
    private int politics;    // 정치력
    private int social;      // 사교성

    // 관리 능력치
    private int grit;        // 근성 (0~100)
    private int fatigue;     // 피로 (0~100)

    public Stats() {
        this.beauty = 0;
        this.stamina = 0;
        this.strength = 0;
        this.intelligence = 0;
        this.elegance = 0;
        this.charm = 0;
        this.morality = 50;  // 시작 도덕성
        this.politics = 0;
        this.social = 0;
        this.grit = 50;      // 시작 근성
        this.fatigue = 0;    // 시작 피로
    }

    // 능력치 증가 메서드
    public void increaseBeauty(int amount) {
        this.beauty += amount;
    }

    public void increaseStamina(int amount) {
        this.stamina += amount;
    }

    public void increaseStrength(int amount) {
        this.strength += amount;
    }

    public void increaseIntelligence(int amount) {
        this.intelligence += amount;
    }

    public void increaseElegance(int amount) {
        this.elegance += amount;
    }

    public void increaseCharm(int amount) {
        this.charm += amount;
    }

    public void increaseMorality(int amount) {
        this.morality += amount;
    }

    public void increasePolitics(int amount) {
        this.politics += amount;
    }

    public void increaseSocial(int amount) {
        this.social += amount;
    }

    public void increaseGrit(int amount) {
        this.grit = Math.min(100, this.grit + amount);
    }

    public void increaseFatigue(int amount) {
        this.fatigue = Math.min(100, this.fatigue + amount);
    }

    public void decreaseFatigue(int amount) {
        this.fatigue = Math.max(0, this.fatigue - amount);
    }

    // Getters
    public int getBeauty() {
        return beauty;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getElegance() {
        return elegance;
    }

    public int getCharm() {
        return charm;
    }

    public int getMorality() {
        return morality;
    }

    public int getPolitics() {
        return politics;
    }

    public int getSocial() {
        return social;
    }

    public int getGrit() {
        return grit;
    }

    public int getFatigue() {
        return fatigue;
    }

    @Override
    public String toString() {
        return String.format(
                "미모:%d | 체력:%d | 근력:%d | 지력:%d | 기품:%d | 매력:%d | 도덕성:%d | 정치력:%d | 사교성:%d | 근성:%d | 피로:%d",
                beauty, stamina, strength, intelligence, elegance, charm, morality, politics, social, grit, fatigue
        );
    }
}
