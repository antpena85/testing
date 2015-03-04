package phase1;

import Exceptions.UserNotFoundException;
import Exceptions.UserNullException;

public interface IStorage <T, A>
{
	IStorable create(T storable) throws UserNullException;
	IStorable read(A a) throws UserNotFoundException;
	void update(T old_storable, T new_Storable) throws UserNotFoundException;
	void delete(int ID) throws UserNotFoundException;
}
