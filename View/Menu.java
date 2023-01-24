package View;

import Model.AgentUnit;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<AgentUnit<String>> agList = new ArrayList<>();

	public Menu(List<AgentUnit<String>> agList) {
		this.agList = agList;
	}

	public Menu() {
	}

	String menu0 = "1. Посмотреть список контрагентов\n" +
				"2. Найти контрагента по названию. Посмотреть подробную информацию о нём\n" +
				"3. Добавить контрагента\n" +
				"4. Удалить контрагента\n" +
				"5. Добавить новый способ связаться с контрагентом\n" +
				"6. Удалить способ связаться с контрагентом";
	String menu1 = "1. Посмотреть список контрагентов\n";
	String menu2 = "2. Найти контрагента по названию. Посмотреть подробную информацию о нём\n";
	String menu3 = "3. Добавить контрагента\n";
	String menu4 = "4. Удалить контрагента\n";
	String menu5 = "5. Добавить новый способ связаться с контрагентом\n";
	String menu6 = "6. Удалить способ связаться с контрагентом";

	public String getMenu0() {
		return menu0;
	}
	public void exitMenu(){
		System.out.println("\nВведите действие (9 - exit): ");
	}

	public void setMenu0(String menu) {
		this.menu0 = menu0;
	}

	public void printMenu(){
		System.out.println(this.menu0);
	}

	public void getMenu1(List<AgentUnit<String>> agList){
		System.out.println(menu1);
		for (int i = 0; i < agList.size(); i++) {System.out.println(agList.get(i));}
	}

	public void getMenu4(){
		System.out.println(this.menu4);
	}
}
