import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdm.ExrciseExceptions.InventoryLowException;
import com.fdm.ExrciseExceptions.OutOfStockException;
import com.fdm.ExrciseExceptions.ProductRecallException;
import com.fdmgrop.ExrciseforLogginandExceptions.Orders;
import com.fdmgrop.ExrciseforLogginandExceptions.Products;


public class OrderTest {
	
	private Orders order;
	// TODO: private Collection<Products> orderLine;
	@Mock private Products ball,train,blocks,doll;


	@Before
	public void setUp() throws Exception 
	{
		MockitoAnnotations.initMocks(this);
		
		order = new Orders();
		
		when(doll.getName()).thenReturn("doll");
		when(doll.getStock()).thenReturn(0);
			
		when(ball.getName()).thenReturn("ball");
		when(ball.getStock()).thenReturn(3);
		
		when(train.getName()).thenReturn("train");
		when(train.getStock()).thenReturn(1);
		
		when(blocks.getName()).thenReturn("blocks");
		when(blocks.getStock()).thenReturn(4);	
		when(blocks.isRecalled()).thenReturn(true);
		
	}

	@Test(expected=InventoryLowException.class)
	public void testCheckInventory_returnExceptionIfInventoryEmpty() throws OutOfStockException 
	{
		order.checkInventory(doll, 0);
	}
	@Test
	public void testCheckInventory_returnsInventoryAmount() throws OutOfStockException
	{
		order.checkInventory(ball, 0);
		assertTrue(ball.getStock()==3);
	}
	
	@Test(expected=InventoryLowException.class)
	public void testCheckInventory_returnsExceptionsIfInventoryLow() throws OutOfStockException
	{
		order.checkInventory(ball, 25);
	}
	
	@Test(expected=ProductRecallException.class)
	public void testCheckInventory_returnsProductRecallException() throws OutOfStockException
	{
		order.checkInventory(blocks, 2);
	}
	@Test
	public void testCheckInventory_callsUpdateInventoryMethod() //throws OutOfStockException
	{
		try {
			order.checkInventory(ball, 2);
			verify(ball,times(1)).setStock(1);;
					} catch (OutOfStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
