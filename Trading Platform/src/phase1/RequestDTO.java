package phase1;

import java.util.Date;

public class RequestDTO implements IStorable {
	
	int requestID, parentResquestID, shareholderID, stockID, sharesFilled, shares, min_shares;
	Date requestDate;
	String time_in_force;
	double limitPrice, stopPrice;
	
	public enum STATUS{FILLED, UNFILLED};
	public enum buy_sell {BUY, SELL};
	
	
//	Setter &  Getters
//	----------------------------------------------------------------------------------------------
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	public int getParentResquestID() {
		return parentResquestID;
	}
	public void setParentResquestID(int parentResquestID) {
		this.parentResquestID = parentResquestID;
	}
	public int getShareholderID() {
		return shareholderID;
	}
	public void setShareholderID(int shareholderID) {
		this.shareholderID = shareholderID;
	}
	public int getStockID() {
		return stockID;
	}
	public void setStockID(int stockID) {
		this.stockID = stockID;
	}
	public int getSharesFilled() {
		return sharesFilled;
	}
	public void setSharesFilled(int sharesFilled) {
		this.sharesFilled = sharesFilled;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public int getMin_shares() {
		return min_shares;
	}
	public void setMin_shares(int min_shares) {
		this.min_shares = min_shares;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public String getTime_in_force() {
		return time_in_force;
	}
	public void setTime_in_force(String time_in_force) {
		this.time_in_force = time_in_force;
	}
	public double getLimitPrice() {
		return limitPrice;
	}
	public void setLimitPrice(double limitPrice) {
		this.limitPrice = limitPrice;
	}
	public double getStopPrice() {
		return stopPrice;
	}
	public void setStopPrice(double stopPrice) {
		this.stopPrice = stopPrice;
	}
	

}
