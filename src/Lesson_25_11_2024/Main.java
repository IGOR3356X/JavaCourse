package Lesson_25_11_2024;

public class Main {
    public static void main(String[] args) {
        GameConsolesManager gameConsolesManager = new GameConsolesManager(GameConsolesManager.createGameConsolesList());

        System.out.println(gameConsolesManager);

        gameConsolesManager.turnOnGameConsole(1);
        gameConsolesManager.loadGameToConsole(1,"Far Cry 6");

        System.out.println(gameConsolesManager);

    }
}
