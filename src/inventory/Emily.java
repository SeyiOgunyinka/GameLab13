
package inventory;

public class Emily extends NPC {
	private static final long serialVersionUID = 1L;

	public Emily() {
        super("Emily");
    }

    @Override
    public void talk() {

        say("Please! Is someone there? Can you help me?");

        String[] responses = {
            "Who are you?",
            "What happened to you?",
            "Do you know how to escape?"
        };

        int option = getResponse(responses);

        switch (option) {

            case 0:
                say("My name is Emily. I've been trapped in this laboratory for days.");
                break;

            case 1:
                say("I was investigating this laboratory when someone caught me and locked me inside this cell.");
                break;

            case 2:
                say("There is an Access Card somewhere in this facility. It might help you escape.");
                break;

            default:
                say("Please don't leave me here...");
                break;
        }
    }
}
