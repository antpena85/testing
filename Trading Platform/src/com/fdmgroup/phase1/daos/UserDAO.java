package com.fdmgroup.phase1.daos;

import java.util.ArrayList;
import java.util.List;

import phase1.IStorable;
import phase1.IStorage;
import phase1.UserDTO;

import com.fdmgroup.phase1.exceptions.StorableNotFoundException;
import com.fdmgroup.phase1.exceptions.StorableNullException;

public class UserDAO implements IStorage<UserDTO, Integer> {
	List<UserDTO> UserList = new ArrayList<UserDTO>();

	public void setUserList(List<UserDTO> userList) 
	{
		UserList.clear();
		UserList = userList;
	}

	@Override
	public IStorable create(UserDTO user) throws StorableNullException {
		if (user != null) {
			UserList.add(user);
			return user;
		}
		throw new StorableNullException(
				"Attempted to create user of Null value");
	}

	@Override
	public UserDTO read(Integer ID) throws StorableNotFoundException {
		for (UserDTO user : UserList) {
			if (user.getUserID() == ID)
				return user;
		}
		throw new StorableNotFoundException("ID:" + ID
				+ " was not found in our data base.");

	}

	public UserDTO read(String username) throws StorableNotFoundException {
		for (UserDTO user : UserList) {
			if (user.getUsername().equals(username))
				return user;
		}
		throw new StorableNotFoundException("User: " + username
				+ " was not found in our data base.");

	}

	@Override
	public void update(UserDTO oldUser, UserDTO newUser)
			throws StorableNotFoundException {
		if (oldUser == null) {
			throw new StorableNotFoundException("User: " + oldUser
					+ " was not found in our data base.");
		}
		for (int i = 0; i < UserList.size(); i++) {
			if (UserList.get(i).equals(oldUser)) {
				UserList.set(i, newUser);
			}
		}

	}

	@Override
	public void delete(int ID) throws StorableNotFoundException {
		for (UserDTO user : UserList) {
			if (user.getUserID() == ID)
				UserList.remove(user);
		}
		throw new StorableNotFoundException("ID:" + ID
				+ " was not found in our data base.");
	}

}
