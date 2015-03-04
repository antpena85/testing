package phase1;

import Exceptions.UserCredentialException;
import Exceptions.UserNotFoundException;

public class UserActions 
{
	UserDAO user;
	
	public UserDTO login(String username, String password) throws UserNotFoundException, UserCredentialException
	{
//		try 
//		{
//			if ((user.read(username))!= null)	 
//			{
//				if(user.read(username).getPassword().equals(password))
//					return user.read(username);
//			}
//		}
//		catch (UserNotFoundException e) 
//		{
//			e.printStackTrace();
//		}
		if(user.read(username)!=null)
		{
			if (user.read(username).getPassword().equals(password))
				return user.read(username);
			throw new UserCredentialException("User Credentials do not match"); 
		}
		return null;
	}
}
 