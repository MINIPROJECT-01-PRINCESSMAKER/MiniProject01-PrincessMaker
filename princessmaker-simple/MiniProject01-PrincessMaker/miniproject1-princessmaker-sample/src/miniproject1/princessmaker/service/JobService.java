package miniproject1.princessmaker.service;

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.Stats;
import miniproject1.princessmaker.model.job.*;

import java.util.ArrayList;
import java.util.List;

public class JobService {

    public List<String> getAvailableJobs(Princess princess) {
        List<String> jobs = new ArrayList<>();
        Stats stats = princess.getStats();

        // 조건 충족 시 직업 추가
        if (stats.getStamina() + stats.getStrength() >= 30) {
            jobs.add("1. 신병 (체력/근력 상승률 +30%)");
        }
        if (stats.getBeauty() + stats.getCharm() >= 30) {
            jobs.add("2. 신인 모델 (미모/매력/기품 상승률 +30%)");
        }
        if (stats.getPolitics() + stats.getSocial() >= 30) {
            jobs.add("3. 정치 보좌관 (정치력/사교성 상승률 +30%)");
        }
        if (stats.getIntelligence() + stats.getMorality() >= 30) {
            jobs.add("4. 연구 조교 (지력/도덕성 상승률 +30%)");
        }

        // 프리랜서는 항상 선택 가능
        jobs.add((jobs.size() + 1) + ". 프리랜서 (보너스 없음)");

        return jobs;
    }

    public void assignJob(Princess princess, int choice) {
        Stats stats = princess.getStats();
        Job newJob;

        List<Job> availableJobs = new ArrayList<>();

        if (stats.getStamina() + stats.getStrength() >= 30) {
            availableJobs.add(new Soldier());
        }
        if (stats.getBeauty() + stats.getCharm() >= 30) {
            availableJobs.add(new Model());
        }
        if (stats.getPolitics() + stats.getSocial() >= 30) {
            availableJobs.add(new Politician());
        }
        if (stats.getIntelligence() + stats.getMorality() >= 30) {
            availableJobs.add(new Researcher());
        }

        if (choice <= availableJobs.size()) {
            newJob = availableJobs.get(choice - 1);
        } else {
            newJob = new Freelancer();
        }

        princess.setCurrentJob(newJob);
    }
}