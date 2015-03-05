package phase1;

import com.fdmgroup.phase1.exceptions.StorableNotFoundException;
import com.fdmgroup.phase1.exceptions.StorableNullException;

public interface IStorage <T, A>
{
	IStorable create(T storable) throws StorableNullException;
	IStorable read(A a) throws StorableNotFoundException;
	void update(T old_storable, T new_Storable) throws StorableNotFoundException;
	void delete(int ID) throws StorableNotFoundException;
}
