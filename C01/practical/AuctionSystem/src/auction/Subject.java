package auction;
import java.util.List;
import java.util.ArrayList;
interface Subject {
	void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers(String event);
}
