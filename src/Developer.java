class Developer implements GameObserver {
    public void update(Game game) {
        System.out.println("Our team has developed a new game " + game.getGameName() + "!");
        System.out.println("Game Tech: " + game.getTech());
    }
}
