public class Main {
    public static void main(String[] args) {
        GameMagazine magazine = new GameMagazine();
        Developer developer = new Developer();
        Gamer gamer = new Gamer();

        GameProducer.registerObserver(magazine);
        GameProducer.registerObserver(developer);
        GameProducer.registerObserver(gamer);

        Game game = new Game("Cyberpunk 2077",
                "Game with too much bugs",
                "NVIDIA GTX 9999",
                "Complete the game without crashing");

        GameProducer.notifyObservers(game);
    }
}
