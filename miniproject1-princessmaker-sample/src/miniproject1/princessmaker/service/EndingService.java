package miniproject1.princessmaker.service;

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.Stats;

public class EndingService {

    public String determineEnding(Princess princess) {
        Stats stats = princess.getStats();

        // 우선순위 1: 도덕성 관련
        if (stats.getMorality() <= 20) {
            return "어둠의 마녀";
        }

        // 우선순위 2: 특수 엔딩
        if (isAllStatsLow(stats)) {
            return "방구석 폐인";
        }

        // 우선순위 3: 최고 엔딩
        if (stats.getStamina() >= 80 && stats.getStrength() >= 80) {
            return "사령관";
        }
        if (stats.getBeauty() >= 80 && stats.getCharm() >= 80) {
            return "톱스타";
        }
        if (stats.getPolitics() >= 80 && stats.getSocial() >= 70) {
            return "대통령";
        }
        if (stats.getIntelligence() >= 90 && stats.getMorality() >= 70) {
            return "석학";
        }

        // 우선순위 4: 일반 엔딩
        if (hasAnyStat50OrMore(stats)) {
            return "평범한 직장인";
        }

        // 기본 엔딩
        return "취준생";
    }

    private boolean isAllStatsLow(Stats stats) {
        return stats.getBeauty() <= 15 &&
                stats.getStamina() <= 15 &&
                stats.getStrength() <= 15 &&
                stats.getIntelligence() <= 15 &&
                stats.getElegance() <= 15 &&
                stats.getCharm() <= 15 &&
                stats.getMorality() <= 15 &&
                stats.getPolitics() <= 15 &&
                stats.getSocial() <= 15;
    }

    private boolean hasAnyStat50OrMore(Stats stats) {
        return stats.getBeauty() >= 50 ||
                stats.getStamina() >= 50 ||
                stats.getStrength() >= 50 ||
                stats.getIntelligence() >= 50 ||
                stats.getElegance() >= 50 ||
                stats.getCharm() >= 50 ||
                stats.getMorality() >= 50 ||
                stats.getPolitics() >= 50 ||
                stats.getSocial() >= 50;
    }
}