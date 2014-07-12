/*
 THIS PAGE IS FINISHED
 */
package survivalist.view;

/**
 *
 * @author Jerry
 */
public class HelpCraftView extends View {

    public HelpCraftView() {
        super("\n"
                + "\n------------------------------------------------"
                + "\n|                 How to Craft                 |"
                + "\n------------------------------------------------"
                + "\n Certain items cannot be found in the wild,    "
                + "\n only made. You can craft these yourself, using"
                + "\n the materials that exist in the wilderness.   "
                + "\n To see which materials you will need to craft "
                + "\n a certain item, select that item in the menu. "
                + "\n Happy crafting!"
                + "\n"
                + "\n******Press Q to return to previous menu*******");
    }

    @Override

    public void doAction(String choice) {
        switch (choice) {
            case "Q": // Exit to Help menu
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    }
}
