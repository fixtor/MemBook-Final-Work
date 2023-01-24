package Model;

import java.util.ArrayList;
import java.util.List;

public class AgentUnit<T> {

	private T name;
	private T contactPhone;
	private T contactVk;
	private T contactEmail;
	private T contactTeleg;
	private T adressContact;

	private T newField;

	private final List<T> contactList = new ArrayList<>();

	public AgentUnit(T name, T contactPhone, T contactVk, T contactEmail, T contactTeleg, T adressContact) {

		this.name = name;
		this.contactPhone = contactPhone;
		this.contactVk = contactVk;
		this.contactEmail = contactEmail;
		this.contactTeleg = contactTeleg;
		this.adressContact = adressContact;

		contactList.add(contactPhone);
		contactList.add(contactEmail);
		contactList.add(contactTeleg);
		contactList.add(contactVk);
		contactList.add(adressContact);
	}

	public T getName() {
		return name;
	}


	public void addNewField(T newField) {
		contactList.add(newField);
	}

	public void removeFiled(String string) {
		int flag = 0;
		int index = 0;
		for (T item : contactList) {
			if (item.toString().equals(string)) {
				index = contactList.indexOf(item);
				flag++;
			}
		}
		contactList.remove(index);
		if (flag == 0) {System.out.println("not found");}
	}

	@Override
	public String toString() {
		return "\n" + name + contactList;
	}
}
