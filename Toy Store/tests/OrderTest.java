import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgrop.ExrciseforLogginandExceptions.Balls;


public class OrderTest {
	
	@Mock private Balls ball;

	@Before
	public void setUp() throws Exception 
	{
		MockitoAnnotations.initMocks(this);
		
		ball = new Balls();
				
		when(ball.getDescriptions()).thenReturn("Round thing");
		when(ball.getStock()).thenReturn(24);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
