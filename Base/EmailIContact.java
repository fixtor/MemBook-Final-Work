package Base;

import Controller.IContactList;

public class EmailIContact<T> implements IContactList<T> {
	private T eMail;

	public EmailIContact(T eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "eMail: " + eMail + "\n";
	}

	@Override
	public T getContact() {
		return eMail;
	}
}
