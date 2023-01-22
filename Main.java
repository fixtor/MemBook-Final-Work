import Model.CounterAgentUnit;

public class Main {
	public static void main(String[] args) {

		CounterAgentUnit<String> counterAgentUnit = new CounterAgentUnit<>("Intel",
				"51565", "@2101701", "igor@yahoo.com", "@Georg");

		System.out.println(counterAgentUnit.getName());
		System.out.println(counterAgentUnit.getCountAgentList());

		System.out.println("-------------------------------------------------");
	}
}

