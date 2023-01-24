package Base;

import Controller.IContactList;

public class PhoneIContact<T> implements IContactList<T> {

	T phoneNumber;

	public PhoneIContact(T phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public T getContact() {
		return this.phoneNumber;
	}

	@Override
	public String toString() {
		return "Номер телефона: " + phoneNumber;
	}
}
