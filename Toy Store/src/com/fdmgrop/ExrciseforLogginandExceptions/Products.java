package com.fdmgrop.ExrciseforLogginandExceptions;

public abstract class Products 
{	
	protected String name;
	protected String description; 
	protected double price;
	protected boolean recalled;
	protected int stock; 
	
	public abstract void setName(String name);
	public abstract String getName();
	public abstract void setDescription(String description);
	public abstract String getDescriptions();
	public abstract void setPrice(double price);
	public abstract double getPrice();
	public abstract void setRecalled(boolean recalled);
	public abstract boolean getRecalled();
	public abstract void setStock(int stock);
	public abstract int getStock();
}
