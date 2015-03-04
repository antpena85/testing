package test.phase1;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import Exceptions.UserNotFoundException;
import phase1.UserActions;
import phase1.UserDAO;
import phase1.UserDTO;

public class UserActionTest {
	UserActions useractions;
	UserDAO userDAO;
	private Set<UserDTO> UserList;
	@Mock private UserDTO user1,user2,user3, user4;

	@Before
	public void setUp() throws Exception 
	{
		MockitoAnnotations.initMocks(this);
		
		useractions = new UserActions();
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
		
		when(user4.getUserID()).thenReturn(1004);
		when(user4.getFirstName()).thenReturn("first");
		when(user4.getLastName()).thenReturn("last");
		when(user4.getPassword()).thenReturn("password");
		when(user4.getUsername()).thenReturn("firstlast");

		UserList.add(user1);
		UserList.add(user2);
		UserList.add(user3);
		userDAO.setUserList(UserList);
	}

//	@Test(expected=UserNotFoundException.class)
//	public void testLoginNoUserFoundException() throws UserNotFoundException
//	{
//		useractions.login("apena", "password");
//	}

	@Test
	public void testLoginAuthenticatesUser() throws UserNotFoundException
	{
		assertTrue(useractions.login("apena", "password").equals(user1));
	}
}
