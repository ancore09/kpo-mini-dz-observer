class Game {
    private final String name;
    private final String description;
    private final String tech;
    private final String achievements;

    public Game(String name, String description, String tech, String achievements) {
        this.name = name;
        this.description = description;
        this.tech = tech;
        this.achievements = achievements;
    }

    public String getGameName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTech() {
        return tech;
    }

    public String getAchievements() {
        return achievements;
    }
}
