package miniproject1.princessmaker.service;

import miniproject1.princessmaker.model.Princess;
import miniproject1.princessmaker.model.activity.Activity;
import miniproject1.princessmaker.view.OutputView;

public class ActivityService {

    public void executeActivity(Princess princess, Activity activity, OutputView outputView) {
        outputView.printActivityStart(activity.getActivityName());
        outputView.printActivityAnimation();

        activity.execute(princess);

        outputView.printActivityResult(princess, activity.getActivityName());
    }
}