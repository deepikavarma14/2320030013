package auction;

class ReserveAuction extends AuctionTemplate{
	private int reservePrice;
    private int highestBid;

    public ReserveAuction(int reservePrice) {
        this.reservePrice = reservePrice;
    }
    protected void initializeAuction() {
        System.out.println("Initializing reserve auction with reserve price: " + reservePrice);
    }
    protected void startBidding() {
        System.out.println("Starting bidding for reserve auction...");
        highestBid = 100; 
    }
    protected boolean isValidAuction() {
        return highestBid >= reservePrice;
    }
    protected void endBidding() {
        if (highestBid >= reservePrice) {
            System.out.println("Auction ended successfully with highest bid: " + highestBid);
        } else {
            System.out.println("Auction failed to meet the reserve price.");
        }
    }
}
