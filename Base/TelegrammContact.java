package Base;

import Model.ContactListInterface;

public class TelegrammContact<T> implements ContactListInterface<T> {

	T telegrammId;

	public TelegrammContact(T telegrammId) {
		this.telegrammId = telegrammId;
	}

	@Override
	public T getContact() {
		return this.telegrammId;
	}

	@Override
	public String toString() {
		return "Телеграмм: " + telegrammId;
	}
}
