package com.fdmgroup.pena.antonio.users;

public interface IStorage 
{	
	void create();
	void read(User user);
	void update(User user, String userName, String password,String email);
	void delete(User user);
}
