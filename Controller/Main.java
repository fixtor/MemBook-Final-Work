package Controller;

import Model.AgentUnit;
import View.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Создаем БД с контрагентами
		List<AgentUnit<String>> agList = new ArrayList<>();
		AgentUnit<String> first = new AgentUnit<>("Ольга", "+79042713475", "@2101701", "nayasha@yahoo.com", "@Sope", "Спб");
		AgentUnit<String> second = new AgentUnit<>("Ivan", "+9112651565", "@210171231", "igor@yahoo.com", "@Havi", "Пушкина");
		agList.add(first);
		agList.add(second);
		// до сюда

		Menu menu = new Menu(); //Создаем меню
		menu.printMenu(); //печатаем
		menu.exitMenu();

		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);

		int userInput = scanner.nextInt();
		while (userInput != 9) {
			switch (userInput) {
				case 0:
					menu.printMenu();
					userInput = scanner.nextInt();
					break;
				case 1:
					menu.getMenu1(agList);
					menu.exitMenu();
					userInput = scanner.nextInt();
					break;
				case 2:
					menu.getMenu2();
					System.out.println("Введите имя контрагента: ");
					String userName = scanner1.nextLine();
					int flag = 0;
					for (AgentUnit<String> item : agList) {
						if (item.getName().equals(userName)) {
							System.out.println(item);
							flag++;
							break;
						}
					}
					if (flag == 0) System.out.println("Не найден");
					menu.exitMenu();
					userInput = scanner.nextInt();
					break;
				case 3:
					menu.getMenu3();
					System.out.println("Введите имя контрагента: ");
					String name = scanner3.nextLine();
					System.out.println("\nВведите телефон: ");
					String phone = scanner3.nextLine();
					System.out.println("\nВведите ВК: ");
					String vk = scanner3.nextLine();
					System.out.println("\nВведите E=mail: ");
					String email = scanner3.nextLine();
					System.out.println("\nВведите Телеграмм: ");
					String teleg = scanner3.nextLine();
					System.out.println("\nВведите адрес: ");
					String address = scanner3.nextLine();

					agList.add(new AgentUnit<>(name, phone, vk, email, teleg, address));
					System.out.println(agList);
					menu.exitMenu();
					userInput = scanner.nextInt();
					break;

				case 4:
					menu.getMenu4();
					System.out.println("Введите имя контрагента: ");
					String userName1 = scanner1.nextLine();
					int flag3 = 0;
					for (AgentUnit<String> item : agList) {
						if (item.getName().equals(userName1)) {
							System.out.println(item);
							agList.remove(item);
							flag3++;
							break;
						}
					}
					if (flag3 == 0) System.out.println("Не найден");
					menu.exitMenu();
					userInput = scanner.nextInt();
					break;

				case 5:
					menu.getMenu5();
					System.out.println("Введите Имя контрагента: ");
					userName = scanner1.nextLine();
					int flag1 = 0;
					for (AgentUnit<String> item : agList) {
						if (item.getName().equals(userName)) {
							System.out.println("Введите новый тип связи: ");
							flag1++;
							String userContact = scanner3.nextLine();
							item.addNewField(userContact);
							System.out.println(item);
						}
					}
					if (flag1 == 0) System.out.println("Не найден");
					menu.exitMenu();
					userInput = scanner.nextInt();
					break;
				case 6:
					menu.getMenu6();
					System.out.println(agList);
					System.out.println("Введите Имя контрагента: ");

					userName = scanner1.nextLine();
					for (AgentUnit<String> item : agList) {
						if (item.getName().equals(userName)) {
							System.out.println("введите полный контакт чтобы удалить: ");
							String delete = scanner3.nextLine();
							item.removeFiled(delete);
							System.out.println(item);
						}
					}
					menu.exitMenu();
					userInput = scanner.nextInt();
					break;
			}
		}
	}
}


