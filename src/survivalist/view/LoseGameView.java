/*
 THIS PAGE ONLY NEEDS A SMALL TWEAKING TO ALLOW FOR ANY KEY TO BE COUNTED AS THE CORRECT INPUT
 */
package survivalist.view;

/**
 *
 * @author Madison
 */
public class LoseGameView extends View {

    public LoseGameView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n|            x_x You have died x_x             |"
                + "\n------------------------------------------------"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n****************PRESS ANY KEY*******************"
                + "\n------------------------------------------------");
    }

    @Override

    public void doAction(String choice) {

        switch (choice) {
            case "Q": // Exit to Start Program View
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
}
