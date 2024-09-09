package auction;

class StandardAuction extends AuctionTemplate{
	protected void initializeAuction() {
        System.out.println("Initializing standard auction...");
    }
    protected void startBidding() {
        System.out.println("Starting bidding for standard auction...");
    }
    protected boolean isValidAuction() {
        return true;
    }
    protected void endBidding() {
        System.out.println("Ending bidding for standard auction.");
    }
}
