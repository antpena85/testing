package com.fdmgrop.ExrciseforLogginandExceptions;

public class Trains extends Products 
{
	
	@Override
	public void setName(String name) 
	{
		this.name = name;
	}

	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public void setDescription(String description) 
	{
		this.description = description;
	}

	@Override
	public String getDescriptions() 
	{
		return description;
	}

	@Override
	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public double getPrice() 
	{
		return price;
	}

	@Override
	public void setRecalled(boolean recall) 
	{
		this.recalled = recall;
	}

	@Override
	public boolean getRecalled() 
	{
		return recalled;
	}
	@Override
	public void setStock(int stock) 
	{
		int current_stock = this.stock;
		this.stock = current_stock + stock;
	}

	@Override
	public int getStock() 
	{
		return stock;
	}

}
