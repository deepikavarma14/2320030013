package auction;

public class AuctionSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AuctionEvent auctionEvent = new AuctionEvent();
	        Bidder bidder1 = new Bidder("Bidder 1");
	        Bidder bidder2 = new Bidder("Bidder 2");
	        auctionEvent.registerObserver(bidder1);
	        auctionEvent.registerObserver(bidder2);
	        auctionEvent.newItemAvailable("Vintage Car");
	        auctionEvent.startAuction();
	        auctionEvent.endAuction();
	        auctionEvent.unregisterObserver(bidder1);
	        AuctionTemplate standardAuction = new StandardAuction();
	        standardAuction.conductAuction();
	        AuctionTemplate reserveAuction = new ReserveAuction(150);
	        reserveAuction.conductAuction();
	}

}
