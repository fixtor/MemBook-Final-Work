package Base;

import Model.ContactListInterface;

public class PhoneContact<T> implements ContactListInterface<T> {

	T phoneNumber;

	public PhoneContact(T phoneNumber) {
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
