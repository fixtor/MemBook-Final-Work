package Base;

import Controller.IContactList;

public class AddressIContact<T> implements IContactList<T> {
	T addressContact;

	public AddressIContact(T addressContact) {
		this.addressContact = addressContact;
	}

	@Override
	public T getContact() {
		return this.addressContact;
	}

	@Override
	public String toString() {
		return "Адрес: " + addressContact + "\n";
	}
}
