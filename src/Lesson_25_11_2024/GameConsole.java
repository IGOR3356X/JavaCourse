package Lesson_25_11_2024;

public class GameConsole {
    private int id;

    private String consoleName;
    private String currentGameName;
    private boolean isActive;

    private int costPerHour;

    public GameConsole(int id, String consoleName, String currentGameName, boolean isActive, int costPerHour) {
        this.id = id;
        this.consoleName = consoleName;
        this.currentGameName = currentGameName;
        this.isActive = isActive;
        this.costPerHour = costPerHour;
    }

    public int getId() {
        return id;
    }

    public String getConsoleName() {
        return consoleName;
    }

    public String getCurrentGameName() {
        return currentGameName;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getCostPerHour() {
        return costPerHour;
    }

    public void setCurrentGameName(String currentGameName) {
        this.currentGameName = currentGameName;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setCostPerHour(int costPerHour) {
        if (costPerHour < 100) {
            this.costPerHour = 100;
        } else if (costPerHour > 1000) {
            this.costPerHour = 1000;
        } else {
            this.costPerHour = costPerHour;
        }
    }

    @Override
    public String toString() {
        return String.format("console: %s, id: %d, is active: %s, loaded game: %s, cost pear hour: %d", consoleName, id, isActive, currentGameName, costPerHour);
    }

}
