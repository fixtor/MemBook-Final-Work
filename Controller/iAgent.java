package Controller;

import java.util.List;

public interface iAgent
{

	 public <T> List<T> showCounterAgent();
	 public <T> List<T> findCounterAgentByName();
	 public <T> List<T> addCounterAgent();
	 public <T> List<T> deleteCounterAgent();
	 public <T> List<T> deleteContactCounterAgent();
}
