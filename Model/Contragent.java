package Model;
import java.util.List;

public class Contragent {

	String name;
	List<ContactListInterface> contactList;

	public Contragent(String name, List<ContactListInterface> contactList) {
		this.name = name;
		this.contactList = contactList;
	}

	@Override
	public String toString() {
		return "Контрагент: " + name + " " + contactList; // Вот тут
	}


}