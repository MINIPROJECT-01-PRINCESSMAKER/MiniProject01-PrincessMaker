package miniproject1.princessmaker.util;
/*  DateManager.java
    LocalDateTime을 사용한 날짜 관리
    턴마다 1개월씩 증가
    yy/MM 형식으로 날짜 포맷  */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateManager {
    private LocalDateTime currentDate;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yy/MM");

    public DateManager() {
        this.currentDate = LocalDateTime.now();
    }

    public void addMonth() {
        currentDate = currentDate.plusMonths(1);
    }

    public String getFormattedDate() {
        return currentDate.format(FORMATTER);
    }

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }
}
