package Base;

import Model.ContactListInterface;

public class AddressContact<T> implements ContactListInterface<T> {
	T addressContact;

	public AddressContact(T addressContact) {
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
