package phase1;

import com.fdmgroup.phase1.daos.UserDAO;
import com.fdmgroup.phase1.exceptions.StorableCredentialException;
import com.fdmgroup.phase1.exceptions.StorableNotFoundException;

public class UserActions 
{
	UserDAO user = new UserDAO();
	
	public UserDTO login(String username, String password) throws StorableCredentialException, StorableNotFoundException
	{
		if((user.read(username))!=null)
		{
			if (user.read(username).getPassword().equals(password))
				return user.read(username);
			throw new StorableCredentialException("User Credentials do not match"); 
		}
		return null;
	}
}
 