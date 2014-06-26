/*
THIS PAGE ONLY NEEDS THE TEXT FILLED OUT
 */

package survivalist.view;

import survivalist.Survivalist;
import survivalist.control.Constants;
import survivalist.model.Item;

/**
 *
 * @author Jerry
 */
public class HelpCraftView extends View{
    
    public HelpCraftView() {
        super("\n"
            + "\n------------------------------------------------"
            + "\n|                 How to Craft                 |"
            + "\n------------------------------------------------"
            + "\n knife"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n"
            + "\n************Return to previous Menu*************"
            + "\n------------------------------------------------");
    }
    
    @Override
    
    public void doAction(String choice) {
            case "Q": // Exit to Help menu
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
    } 

    
    }
}
