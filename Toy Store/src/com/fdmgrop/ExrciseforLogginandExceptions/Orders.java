package com.fdmgrop.ExrciseforLogginandExceptions;

import com.fdm.ExrciseExceptions.InventoryLowException;
import com.fdm.ExrciseExceptions.OutOfStockException;
import com.fdm.ExrciseExceptions.ProductRecallException;

public class Orders
{
	
	public void checkInventory(Products product, int productAmount) throws OutOfStockException
	{
			if(product.getStock()<=0)
				throw new InventoryLowException("Product: "+product.getName()+" is out of stock");
			else if(product.getStock()<productAmount)
				throw new InventoryLowException("Insufficient amount of "+product.getName()+"s to fulfil order of " +productAmount+
					". Current stock is "+product.getStock());
			else if (product.isRecalled())
				throw new ProductRecallException(product.getName()+" is marked for recall");
			else
				updateInventory(product, productAmount);
		
	}
	
	public void updateInventory(Products product, int productAmount)
	{
		product.setStock(product.getStock()-productAmount);
	}
	
}
