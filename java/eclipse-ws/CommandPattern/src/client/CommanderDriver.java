package client;

import commander.*;

/* CommanderDriver.class
 * ---------------------
 * Represents the class to test the commander (command pattern).
 */

public class CommanderDriver {

	public static void main(String args[]) {

	final String PLAY_PREF = "PLAY_PREF";

	Commander commander = new Commander();
	PlaySoundCommand playSoundCommand = new PlaySoundCommand();
	commander.setCommand(PLAY_PREF, playSoundCommand);

	commander.run(PLAY_PREF);

	}
}
