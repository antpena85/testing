package test.phase1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import phase1.UserDTO;

import com.fdmgroup.phase1.daos.UserDAO;
import com.fdmgroup.phase1.exceptions.StorableNotFoundException;
import com.fdmgroup.phase1.exceptions.StorableNullException;

public class UserDAOtest {
	private UserDAO userDAO;
	@Mock
	private UserDTO user1, user2, user3, user4;

	@Before
	public void setUp() throws Exception {
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

		userDAO.create(user1);
		userDAO.create(user2);
		userDAO.create(user3);
		userDAO.create(user4);
	}

	@Test(expected = StorableNullException.class)
	public void testCreateUserReturnsNull() throws StorableNullException {
		userDAO.create(null);
	}

	@Test
	public void testCreateAddsUserToRam() throws StorableNullException {
		assertTrue(userDAO.create(user1).equals(user1));
	}

	@Test(expected = StorableNotFoundException.class)
	public void testReadUserNotFound() throws StorableNotFoundException {
		userDAO.read(10010);
	}

	@Test
	public void testReadUserReturnsUser() throws StorableNotFoundException {
		UserDTO userResult = (UserDTO) userDAO.read(1002);
		assertTrue(userResult.getPassword().equals("airplanes"));
		assertTrue(userResult.getFirstName().equals("Zvi"));
		assertTrue(userResult.getLastName().equals("Lam"));
		assertTrue(userResult.getUsername().equals("zlam"));
	}

	@Test
	public void testUpdatesUserToRam() throws StorableNullException,
			StorableNotFoundException {
		userDAO.update(user2, user4);
		assertTrue(userDAO.read(1004).equals(user4));
	}

//	@Test
//	public void testUserRemovedFromRam() throws StorableNotFoundException {
//		userDAO.delete(1001);
//		assertTrue(UserDAO.UserList.contains(user1));
//	}
}
