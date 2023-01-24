package View;
import Model.AgentUnit;
import java.util.List;
public class Menu {
	public Menu() {}
	private String menu0 = "1. Посмотреть список контрагентов\n" +
			"2. Найти контрагента по названию. Посмотреть подробную информацию о нём\n" +
			"3. Добавить контрагента\n" +
			"4. Удалить контрагента\n" +
			"5. Добавить новый способ связаться с контрагентом\n" +
			"6. Удалить способ связаться с контрагентом";
	private String menu1 = "1. Посмотреть список контрагентов\n";
	private String menu2 = "2. Найти контрагента по названию. Посмотреть подробную информацию о нём\n";
	private String menu3 = "3. Добавить контрагента\n";
	private String menu4 = "4. Удалить контрагента\n";
	private String menu5 = "5. Добавить новый способ связаться с контрагентом\n";
	private String menu6 = "6. Удалить способ связаться с контрагентом";

	public void exitMenu() {System.out.println("\nВведите действие (9 - exit): ");}
	public void printMenu() {System.out.println(this.menu0);}
	public void getMenu1(List<AgentUnit<String>> agList) {
		System.out.println(menu1);
		for (int i = 0; i < agList.size(); i++) {System.out.println(agList.get(i));}
	}
	public void getMenu2() {System.out.println(this.menu2);}
	public void getMenu3() {System.out.println(this.menu3);}
	public void getMenu4() {System.out.println(this.menu4);}
	public void getMenu5() {System.out.println(this.menu5);}
	public void getMenu6() {System.out.println(this.menu6);}
}
