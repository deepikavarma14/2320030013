package auction;

abstract class AuctionTemplate {
	public final void conductAuction() {
        initializeAuction();
        startBidding();
        if (isValidAuction()) {
            endBidding();
        } else {
            cancelAuction();
        }
    }
    protected abstract void initializeAuction();
    protected abstract void startBidding();
    protected abstract boolean isValidAuction();
    protected abstract void endBidding();
    protected void cancelAuction() {
        System.out.println("Auction has been canceled due to invalid conditions.");
    }
}
