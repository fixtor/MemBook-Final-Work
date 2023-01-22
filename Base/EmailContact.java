package Base;

import Model.ContactListInterface;

public class EmailContact<T> implements ContactListInterface<T> {
	private T eMail;

	public EmailContact(T eMail) {
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
