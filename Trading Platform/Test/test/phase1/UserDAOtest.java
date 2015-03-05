package test.phase1;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.phase1.daos.UserDAO;
import com.fdmgroup.phase1.exceptions.UserNotFoundException;
import com.fdmgroup.phase1.exceptions.UserNullException;

import phase1.UserDTO;

public class UserDAOtest {
	private UserDAO userDAO;
	@Mock private UserDTO user1,user2,user3, user4;

	@Before
	public void setUp() throws Exception 
	{
		MockitoAnnotations.initMocks(this);
		
		userDAO = new UserDAO();
		

		when(user1.getUserID()).thenReturn(1001);
		when(user1.getFirstName()).thenReturn("Antonio");
		when(user1.getLastName()).thenReturn("Pena");
		when(user1.getPassword()).thenReturn("password");
		when(user1.getUsername()).thenReturn("apena");
		
		when(user2.getUserID()).thenReturn(1002);
		when(user2.getFirstName()).thenReturn("Zvi");
		when(user2.getLastName()).thenReturn("Lam");
		when(user2.getPassword()).thenReturn("airplanes");
		when(user2.getUsername()).thenReturn("zlam");
		
		when(user3.getUserID()).thenReturn(1003);
		when(user3.getFirstName()).thenReturn("Louis");
		when(user3.getLastName()).thenReturn("yang");
		when(user3.getPassword()).thenReturn("podcast");
		when(user3.getUsername()).thenReturn("lyang");
		
		when(user4.getUserID()).thenReturn(1004);
		when(user4.getFirstName()).thenReturn("first");
		when(user4.getLastName()).thenReturn("last");
		when(user4.getPassword()).thenReturn("password");
		when(user4.getUsername()).thenReturn("firstlast");

		
	}

	@Test(expected=UserNullException.class)
	public void testCreateUserReturnsNull() throws UserNullException
	{
		userDAO.create(null);
	}
	
	@Test
	public void testCreateAddsUserToRam() throws UserNullException
	{
		UserDTO user = (UserDTO) userDAO.create(user1);
		assertTrue(user.equals(user1));
	}
	
	@Test(expected=UserNotFoundException.class)
	public void testReadUserNotFound() throws UserNotFoundException
	{
		userDAO.read(1004);
	}
	@Test
	public void testReadUserReturnsUser() throws UserNotFoundException
	{
		UserDTO userResult = (UserDTO)userDAO.read(1002);
		assertTrue(userResult.getPassword().equals("airplanes"));
		assertTrue(userResult.getFirstName().equals("Zvi"));
		assertTrue(userResult.getLastName().equals("Lam"));
		assertTrue(userResult.getUsername().equals("zlam"));
	}
	@Test
	public void testUpdatesUserToRam() throws UserNullException, UserNotFoundException
	{
		userDAO.update(user2, user4);
//		assertTrue((user4));
	}
//	@Test(expected=UserNullException.class)
//	public void testUserRemovedFromRam() throws UserNotFoundException
//	{
//		userDAO.delete(1001);
//		userDAO.read(1001);
//	}
}




