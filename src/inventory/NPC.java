
package inventory;

import javax.swing.JOptionPane;
import java.io.Serializable;

public class NPC implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;

    public NPC(String name) {
        this.name = name;
    }

    public void say(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public int getResponse(String[] responses) {

        String response = (String) JOptionPane.showInputDialog(
                null,
                "Choose your response:",
                name,
                JOptionPane.QUESTION_MESSAGE,
                null,
                responses,
                responses[0]);

        if (response == null) {
            return -1;
        }

        for (int i = 0; i < responses.length; i++) {
            if (response.equals(responses[i])) {
                return i;
            }
        }

        return -1;
    }

    public void talk() {

        say("Help! Is someone there? My name is Emily. "
                + "I've been trapped in this laboratory cell!");

        String[] responses = {
            "Who are you?",
            "How did you get trapped here?",
            "Do you know how I can escape?",
            "I'll come back later."
        };

        int choice = getResponse(responses);

        switch (choice) {

            case 0:
                say("I'm Emily. I was investigating this laboratory "
                        + "when someone locked me inside this cell.");
                break;

            case 1:
                say("I was searching for a way out when the doors "
                        + "locked automatically. I haven't been able "
                        + "to escape since.");
                break;

            case 2:
                say("I overheard someone talking. They said "
                        + "there is a key or code somewhere that is missing. "
                        + "You need it to unlock the doors and escape!");
                break;

            case 3:
                say("Please hurry! I don't know how much longer "
                        + "I can stay here!");
                break;

            case -1:
                say("Please don't leave me here!");
                break;
        }
    }

    public String getName() {
        return name;
    }
}

