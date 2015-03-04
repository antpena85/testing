package test.phase1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import phase1.IStorable;
import phase1.UserDAO;
import phase1.UserDTO;
import phase1.UserNotFoundException;
import phase1.UserNullException;

public class UserDAOtest {
	private UserDAO userDAO;
	private Collection<UserDTO> UserList;
	@Mock private UserDTO user1,user2,user3;

	@Before
	public void setUp() throws Exception 
	{
		MockitoAnnotations.initMocks(this);
		
		userDAO = new UserDAO();
		UserList = new HashSet<UserDTO>();
		

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

		UserList.add(user1);
		UserList.add(user2);
		UserList.add(user3);
	}

	@Test(expected=UserNullException.class)
	public void testCreateUserReturnsNull() throws UserNullException
	{
		userDAO.create(null);
	}
	
	@Test
	public void testCreateAddsUserToRam() throws UserNullException
	{
		IStorable user = userDAO.create(user1);
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
		UserDTO userResult = (UserDTO) userDAO.read(1002);
		assertTrue(userResult.getUsername().equals("airplanes"));
	}
}




