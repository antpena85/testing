package phase1;

public interface IStorage <T>
{
	IStorable create(T storable) throws UserNullException;
	IStorable read(int ID) throws UserNotFoundException;
	void update(T old_storable, T new_Storable) throws UserNotFoundException;
	void delete(int ID) throws UserNotFoundException;
}
