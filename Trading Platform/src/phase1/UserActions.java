package phase1;

import com.fdmgroup.phase1.daos.UserDAO;
import com.fdmgroup.phase1.exceptions.UserCredentialException;
import com.fdmgroup.phase1.exceptions.UserNotFoundException;

public class UserActions 
{
	UserDAO user = new UserDAO();
	
	public UserDTO login(String username, String password) throws UserCredentialException, UserNotFoundException
	{
		if((user.read(username))!=null)
		{
			if (user.read(username).getPassword().equals(password))
				return user.read(username);
			throw new UserCredentialException("User Credentials do not match"); 
		}
		return null;
	}
}
 