package Model;

import java.util.ArrayList;
import java.util.List;

public class CounterAgentUnit<T> implements ContactListInterface<T> {

	T name;
	private final List<T> contactListInterfaceList = new ArrayList<>();

	public CounterAgentUnit(T name, T contactPhone, T contactVk, T contactEmail, T contactTeleg) {
		this.name = name;

		contactListInterfaceList.add(contactPhone);
		contactListInterfaceList.add(contactEmail);
		contactListInterfaceList.add(contactTeleg);
		contactListInterfaceList.add(contactVk);
	}

	public List<T> getCountAgentList() {
		return contactListInterfaceList;
	}

	public T getName() {
		return name;
	}

	@Override
	public T getContact() {
		return null;
	}

	@Override
	public String toString() {
		return "КонтрАгент:" + this.name + "contactListInterfaceList=" + contactListInterfaceList +
				'}';
	}
}

