package com.fdmgroup.pena.antonio.users;

import java.util.ArrayList;
import java.util.Random;

public class Storage implements IStorage 
{
	Random randomID = new Random();
	ArrayList<User> userList = new ArrayList<User>();

	@Override
	public void create() 
	{		
		User user = new User();
		userList.add(user);
		user.setUserID(randomID.nextInt(9999)+1);
		System.out.printf("%s ID number is %d \n",user.getUsername(),user.getUserID());
	}

	@Override
	public void read(User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getUserID());
		System.out.println(user.getEmail());		
	}

	@Override
	public void update(User user, String username, String password,String email) 
	{ 
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
	}

	@Override
	public void delete(User user) 
	{
		System.out.printf("%s is bieng deleted...", user.getUserID());
		userList.remove(user);
		
	}


}
