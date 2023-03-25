public class Gamer implements GameObserver{
    @Override
    public void update(Game game) {
        System.out.println("New game " + game.getGameName() + " has been played by gamer");
        System.out.println("Game Achievements: " + game.getAchievements());
    }
}
