package phase1;

public class TradeDTO implements IStorable 
{
	int tradID, stockID, shares, buyerId, sellerID, buyRequest_ID, sellRequest_ID;
	String transaction_time;
	double sharePrice, priceTotal;
	
//	Getters & Setters
//	---------------------------------------------------------------------------------
	public int getTradID() {
		return tradID;
	}
	public void setTradID(int tradID) {
		this.tradID = tradID;
	}
	public int getStockID() {
		return stockID;
	}
	public void setStockID(int stockID) {
		this.stockID = stockID;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getSellerID() {
		return sellerID;
	}
	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}
	public int getBuyRequest_ID() {
		return buyRequest_ID;
	}
	public void setBuyRequest_ID(int buyRequest_ID) {
		this.buyRequest_ID = buyRequest_ID;
	}
	public int getSellRequest_ID() {
		return sellRequest_ID;
	}
	public void setSellRequest_ID(int sellRequest_ID) {
		this.sellRequest_ID = sellRequest_ID;
	}
	public String getTransaction_time() {
		return transaction_time;
	}
	public void setTransaction_time(String transaction_time) {
		this.transaction_time = transaction_time;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public double getPriceTotal() {
		return priceTotal;
	}
	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}
	
	
}
