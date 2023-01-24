package Base;

import Controller.IContactList;

public class TelegrammIContact<T> implements IContactList<T> {

	T telegrammId;

	public TelegrammIContact(T telegrammId) {
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
