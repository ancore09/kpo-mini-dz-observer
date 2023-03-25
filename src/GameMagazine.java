class GameMagazine implements GameObserver {
    public void update(Game game) {
        System.out.println("New game " + game.getGameName() + " has been released and featured in Game Magazine!");
        System.out.println("Game Description: " + game.getDescription());
    }
}
