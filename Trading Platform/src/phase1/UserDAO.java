package phase1;

import java.util.HashSet;
import java.util.Set;

public class UserDAO implements IStorage<UserDTO> 
{
	Set<UserDTO> UserList = new HashSet<UserDTO>();

	@Override
	public IStorable create(UserDTO user) 
	{
		UserList.add(user);
		return user;
	}

	@Override
	public IStorable read(int ID) throws UserNotFoundException
	{
		for(UserDTO user: UserList)
		{
			if(user.getUserID() == ID)
				return user;
		}
		throw new UserNotFoundException("ID:"+ID+" was not found in our data base.");
		
	}

	@Override
	public void update(UserDTO oldUser, UserDTO newUser) throws UserNotFoundException
	{
		for(UserDTO user: UserList)
		{
			if(user.equals(oldUser))
			{
				UserList.remove(oldUser);
				UserList.add(newUser);
			}
		}
		throw new UserNotFoundException("User:"+oldUser+" was not found in our data base.");
	}

	@Override
	public void delete(int ID) throws UserNotFoundException
	{
		for(UserDTO user: UserList)
		{
			if(user.getUserID() == ID)
				UserList.remove(user);
		}	
		throw new UserNotFoundException("ID:"+ID+" was not found in our data base.");
	}
	
	

}
