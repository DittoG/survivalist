/*
 THIS PAGE ONLY NEEDS THE TEXT FILLED OUT
 */
package survivalist.view;

/**
 *
 * @author Jerry
 */
public class HelpHuntGatherView extends View {

    public HelpHuntGatherView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n|            How to Hunt and Gather            |"
                + "\n------------------------------------------------"
                + "\n To survive, you will need to eat. In order to  "
                + "\n eat, you need food!! You can find food in two  "
                + "\n ways: hunting animals, or gathering berries.   "
                + "\n"
                + "\n To do either of these things, you will first   "
                + "\n need to explore the immediate area. To do this,"
                + "\n select the 'Exploring Menu' option in the Game "
                + "\n Menu. Once there, you will have the option to  "
                + "\n explore the surrounding area. After exploring, "
                + "\n you will be able to see what resources and     "
                + "\n animals are nearby. If you want to hunt, select"
                + "\n the 'Hunt' option. If you would like to gather "
                + "\n crafting ingredients or berries to eat, select "
                + "\n the 'Gather' option."
                + "\n After selecting one, you will be shown which   "
                + "\n animals or ingredients are available to hunt or"
                + "\n gather and you can make your desired selection."
                + "\n                                                "
                + "\n*******Press Q to return to the help menu*******"
                + "\n------------------------------------------------");
    }

    @Override

    public void doAction(String choice) {

        switch (choice) {
            case "Q": // Return to previous menu
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
}
