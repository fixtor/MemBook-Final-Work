package Model;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	List<AgentUnit<String>> list = new ArrayList<>();

	public void addNewAgent(AgentUnit<String> newAgent){
		list.add(newAgent);
	}
	public List<AgentUnit<String>> getList() {
		return list;
	}
}

