package Controller;

import java.util.List;

public class ContactServices<T> {
	T newRecord;
	List<T> addList;

	public ContactServices(T newRecord, List<T> addList) {
		addList.add(newRecord);
	}


}
