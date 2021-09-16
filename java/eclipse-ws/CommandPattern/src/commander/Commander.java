package commander;

import java.util.HashMap;

/* Commander.class
 * ---------------
 * Works like a remote control, where each button corresponds to a command.
 * The commander knows nothing about the implementation of a certain command.
 * It only calls the execute method of the command it is mapped to.
 */
public class Commander {
	
	private HashMap<Object,ICommand> commandMap;  
	
	public Commander() {
		this.commandMap = new HashMap<Object,ICommand>();
	}
	
	public <E> void setCommand(E pref, ICommand command) {
		command.setState(pref);
		commandMap.put(pref, command);
	}
	
	public <E> void run(E pref) {
		if(commandMap.containsKey(pref)) 
			commandMap.get(pref).execute();
		else
			throw new RuntimeException("Specified key doesn't exist");
	}
	
	public int commandCount() { return commandMap.size();}


}
