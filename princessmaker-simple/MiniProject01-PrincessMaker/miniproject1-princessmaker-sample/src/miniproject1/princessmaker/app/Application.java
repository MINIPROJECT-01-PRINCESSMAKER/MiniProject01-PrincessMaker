package miniproject1.princessmaker.app;

import miniproject1.princessmaker.controller.GameController;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.start();
    }
}
