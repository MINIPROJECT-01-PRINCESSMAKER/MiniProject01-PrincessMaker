package miniproject1.princessmaker.controller;

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.activity.*;
import miniproject1.princessmaker.service.ActivityService;
import miniproject1.princessmaker.service.EndingService;
import miniproject1.princessmaker.service.JobService;
import miniproject1.princessmaker.util.Constants;
import miniproject1.princessmaker.view.InputView;
import miniproject1.princessmaker.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private Princess princess;
    private final InputView inputView;
    private final OutputView outputView;
    private final ActivityService activityService;
    private final JobService jobService;
    private final EndingService endingService;
    private final List<Activity> activities;
    private int currentTurn;

    public GameController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.activityService = new ActivityService();
        this.jobService = new JobService();
        this.endingService = new EndingService();
        this.activities = new ArrayList<>();
        this.currentTurn = 0;
        initializeActivities();
    }

    private void initializeActivities() {
        activities.add(new MilitaryTraining());
        activities.add(new PhysicalTraining());
        activities.add(new BeautyManagement());
        // 나머지 활동들 추가
        // activities.add(new Study());
        // activities.add(new PoliticalActivity());
        // activities.add(new SocialGathering());
        // activities.add(new Volunteer());
        // activities.add(new Rest());
    }

    public void start() {
        outputView.printWelcome();
        String name = inputView.inputPrincessName();
        princess = new Princess(name);
        outputView.printNameSet(name);

        runGameLoop();
    }

    private void runGameLoop() {
        while (currentTurn < Constants.MAX_TURN) {
            currentTurn++;
            princess.nextMonth();

            outputView.printCurrentDate(princess.getCurrentDate());
            int choice = inputView.selectActivity(activities);
            Activity selectedActivity = activities.get(choice - 1);

            activityService.executeActivity(princess, selectedActivity, outputView);

            if (currentTurn == Constants.JOB_SELECTION_TURN) {
                handleJobSelection();
            }
        }

        handleEnding();
    }

    private void handleJobSelection() {
        outputView.printJobSelectionStart();
        List<String> availableJobs = jobService.getAvailableJobs(princess);
        int choice = inputView.selectJob(availableJobs);
        jobService.assignJob(princess, choice);
        outputView.printJobAssigned(princess.getName(), princess.getCurrentJob().getJobName());
    }

    private void handleEnding() {
        String ending = endingService.determineEnding(princess);
        outputView.printEnding(ending, princess);
        inputView.close();
    }
}