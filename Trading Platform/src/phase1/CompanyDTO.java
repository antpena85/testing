package phase1;

public class CompanyDTO implements IStorable 
{
	int companyID, stockID;
	String companyName;
	double starting_price;
	
	
//	Setters & Getters
//	----------------------------------------------------------------
	public int getCompanyID() 
	{
		return companyID;
	}
	public void setCompanyID(int companyID) 
	{
		this.companyID = companyID;
	}
	public int getStockID() 
	{
		return stockID;
	}
	public void setStockID(int stockID) 
	{
		this.stockID = stockID;
	}
	public String getCompanyName() 
	{
		return companyName;
	}
	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}
	public double getStarting_price() 
	{
		return starting_price;
	}
	public void setStarting_price(double starting_price) 
	{
		this.starting_price = starting_price;
	}
	
}
