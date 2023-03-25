import java.util.ArrayList;
import java.util.List;

class GameProducer {
    private static final List<GameObserver> observers = new ArrayList<>();

    public static void registerObserver(GameObserver observer) {
        observers.add(observer);
    }

    public static void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    public static void notifyObservers(Game game) {
        for (GameObserver observer : observers) {
            observer.update(game);
        }
    }
}