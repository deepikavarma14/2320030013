package auction;

class Bidder implements Observer{
	private String name;

    public Bidder(String name) {
        this.name = name;
    }
    public void update(String event) {
        System.out.println(name + " received notification: " + event);
    }
}
