package miniproject1.princessmaker.util;
/*  최대 턴 수 (24)
    직업 선택 턴 (12)
    각 엔딩 조건 수치
    활동별 기본 스탯 증가량   */
public class Constants {
    // 게임 진행 관련
    public static final int MAX_TURN = 24;
    public static final int JOB_SELECTION_TURN = 12;

    // 직업 선택 조건
    public static final int JOB_SOLDIER_REQUIREMENT = 30;      // 체력 + 근력
    public static final int JOB_MODEL_REQUIREMENT = 30;        // 미모 + 매력
    public static final int JOB_POLITICIAN_REQUIREMENT = 30;   // 정치력 + 사교성
    public static final int JOB_RESEARCHER_REQUIREMENT = 30;   // 지력 + 도덕성

    // 엔딩 조건
    public static final int ENDING_DARK_WITCH_MORALITY = 20;
    public static final int ENDING_NEET_MAX_STAT = 15;
    public static final int ENDING_COMMANDER_STAT = 80;
    public static final int ENDING_STAR_STAT = 80;
    public static final int ENDING_PRESIDENT_POLITICS = 80;
    public static final int ENDING_PRESIDENT_SOCIAL = 70;
    public static final int ENDING_SCHOLAR_INTELLIGENCE = 90;
    public static final int ENDING_SCHOLAR_MORALITY = 70;
    public static final int ENDING_NORMAL_STAT = 50;

    // 능력치 관련
    public static final int MAX_GRIT = 100;
    public static final int MAX_FATIGUE = 100;
    public static final int FATIGUE_WARNING = 80;

    // 직업 보너스율
    public static final double JOB_BONUS_RATE = 1.3;  // 30% 증가
}
