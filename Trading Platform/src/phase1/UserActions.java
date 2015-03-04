package phase1;

import Exceptions.UserNotFoundException;

public class UserActions 
{
	UserDAO user;
	
	public UserDTO login(String username, String password)
	{
		try 
		{
			if (user.read(username)!= null)
			{
				if(user.read(username).getPassword().equals(password))
					return user.read(username);
			}
		}
		catch (UserNotFoundException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
