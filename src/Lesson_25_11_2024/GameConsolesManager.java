package Lesson_25_11_2024;

import java.util.ArrayList;

public class GameConsolesManager {
    private ArrayList<GameConsole> gameConsoles;

    public GameConsolesManager(ArrayList<GameConsole> gameConsoles) {
        this.gameConsoles = gameConsoles;
    }

    public void addGameConsole(GameConsole gameConsole) {
        gameConsoles.add(gameConsole);
    }

    private GameConsole getGameConsoleById(int id) {
        for (int i = 0; i < gameConsoles.size(); i++) {
            if (gameConsoles.get(i).getId() == id) {
                return gameConsoles.get(i);
            }
        }
        return null;
    }

    public void removeGameConsole(int id) {
        for (int i = 0; i < gameConsoles.size(); i++) {
            if (gameConsoles.get(i).getId() == id) {
                gameConsoles.remove(i);
                break;
            }
        }
    }

    public void turnOffGameConsole(int id) {
        getGameConsoleById(id).setActive(false);
    }

    public void turnOnGameConsole(int id) {
        getGameConsoleById(id).setActive(true);
    }

    public void loadGameToConsole(int id, String gameName) {
        getGameConsoleById(id).setCurrentGameName(gameName);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < gameConsoles.size(); i++) {
            stringBuilder.append(gameConsoles.get(i).toString());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public static ArrayList<GameConsole> createGameConsolesList() {
        ArrayList<GameConsole> gameConsoles = new ArrayList<>();

        gameConsoles.add(new GameConsole(1, "PS5", "NONE", false, 250));
        gameConsoles.add(new GameConsole(2, "PS4", "NONE", false, 200));
        gameConsoles.add(new GameConsole(3, "XBOX ONE", "NONE", false, 300));

        return gameConsoles;
    }

}
