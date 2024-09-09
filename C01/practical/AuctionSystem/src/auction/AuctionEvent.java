package auction;
import java.util.List;
import java.util.ArrayList;
class AuctionEvent implements Subject{
	private List<Observer> observers = new ArrayList<>();
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void startAuction() {
        notifyObservers("Auction has started!");
    }

    public void endAuction() {
        notifyObservers("Auction has ended!");
    }

    public void newItemAvailable(String item) {
        notifyObservers("New item available: " + item);
    }
}
