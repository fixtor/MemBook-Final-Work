import Base.EmailContact;
import Base.PhoneContact;
import Base.TelegrammContact;
import Base.VkontakteContact;
import Model.ContactListInterface;
import Model.Contragent;
import Model.CounterAgentUnit;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<ContactListInterface> contactList = new ArrayList<>(); //Это надо в конструктор, там заполнять


	CounterAgentUnit counterAgentUnit = new CounterAgentUnit("Intel",
				"51565", "@2101701", "igor@yahoo.com", "@Georg");

		System.out.println(counterAgentUnit.getName());
		System.out.println(counterAgentUnit.getCountAgentList());

		System.out.println("-------------------------------------------------");

		/// Отсановился на КОНТРАГЕНТЕ!
		/// Создать класс создания контакта
		/// Заполнить адрес
	}
}

