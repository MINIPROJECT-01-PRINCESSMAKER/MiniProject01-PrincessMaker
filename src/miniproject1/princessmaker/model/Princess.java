package miniproject1.princessmaker.model;
// 프린세스의 모든 정보를 담는 클래스
// 이름, Stats 객체, 현재 Job 객체, 현재 날짜를 필드로 가짐
// Job을 변경하는 메서드 포함
import miniproject1.princessmaker.model.job.Job;
import miniproject1.princessmaker.model.job.Unemployed;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Princess {
    private String name;
    private Stats stats;
    private Job currentJob;
    private LocalDateTime currentDate;

    public Princess(String name) {
        this.name = name;
        this.stats = new Stats();
        this.currentJob = new Unemployed();
        this.currentDate = LocalDateTime.now();
    }

    public void nextMonth() {
        currentDate = currentDate.plusMonths(1);
    }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM");
        return currentDate.format(formatter);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }

    public Job getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(Job currentJob) {
        this.currentJob = currentJob;
    }

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }
}
