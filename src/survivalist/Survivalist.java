/*\
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package survivalist;

import survivalist.model.Animal;
import survivalist.model.Building;
import survivalist.model.Item;
import survivalist.model.Map;
import survivalist.model.Npc;
import survivalist.model.Player;

/**
 *
 * @author Madison
 */
public class Survivalist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Player codes
        
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Map codes
        
        Map map = new Map();
        
        map.setRowCount(20);
        map.setColumnCount(10);
        
        String mapInfo = map.toString();
        System.out.println(map);
        
        //Item codes
        //WEAPON codes
        //Knife
        
        Item knife = new Item();
        
        knife.setName("Knife");
        knife.setDescription("A sharp object used for cutting that is not very dangerous.");
        knife.setType("weapon");
        knife.setPossibleQuantity(1);
        knife.setActualQuantity(0);
        
        String knifeInfo = knife.toString();
        System.out.println(knife);
        
        //Bow
        
        Item bow = new Item();
        bow.setName("Bow");
        bow.setDescription("A bow is used to hunt by shooting arrows and is good for taking down animals from a distance.");
        bow.setType("weapon");
        bow.setPossibleQuantity(1);
        bow.setActualQuantity(0);
        
        String bowInfo = bow.toString();
        System.out.println(bow);
        
        //Arrow
        
        Item arrow = new Item();
        arrow.setName("Arrow");
        arrow.setDescription("Arrows can be shot using a bow, to hunt animals from a distance.");
        arrow.setType("weapon");
        arrow.setPossibleQuantity(20);
        arrow.setActualQuantity(0);
        
        String arrowInfo = arrow.toString();
        System.out.println(arrow);
        
        //Machete
        
        Item machete = new Item();
        machete.setName("Machete");
        machete.setDescription("A machete can be used to hunt larger animals and is also useful for clearing a path through dense undergrowth.");
        machete.setType("weapon");
        machete.setPossibleQuantity(1);
        machete.setActualQuantity(0);
        
        String macheteInfo = machete.toString();
        System.out.println(machete);
        
        //TOOL codes
        //Axe
        
        Item axe = new Item();
        axe.setName("Axe");
        axe.setDescription("An axe is used for chopping down trees.");
        axe.setType("tool");
        axe.setPossibleQuantity(1);
        axe.setActualQuantity(0);
        
        String axeInfo = axe.toString();
        System.out.println(axe);
        
        //Hammer
        
        Item hammer = new Item();
        hammer.setName("Hammer");
        hammer.setDescription("A hammer is used to build structures.");
        hammer.setType("tool");
        hammer.setPossibleQuantity(1);
        hammer.setActualQuantity(0);
        
        String hammerInfo = hammer.toString();
        System.out.println(hammer);
        
        //Flint and Stone
        
        Item flintAndStone = new Item();
        flintAndStone.setName("Flint and Stone");
        flintAndStone.setDescription("Flint and Stone are used to make fires.");
        flintAndStone.setType("tool");
        flintAndStone.setPossibleQuantity(1);
        flintAndStone.setActualQuantity(0);
        
        String flintAndStoneInfo = flintAndStone.toString();
        System.out.println(flintAndStone);
        
        //Hook
        
        Item grapplingHook = new Item();
        grapplingHook.setName("Grappling Hook");
        grapplingHook.setDescription("A hook attached to a rope, this is used to climb rocks by throwing it up the side of a cliff and climbing it up a string.");
        grapplingHook.setType("tool");
        grapplingHook.setPossibleQuantity(1);
        grapplingHook.setActualQuantity(0);
        
        String grapplingHookInfo = grapplingHook.toString();
        System.out.println(grapplingHook);
        
        //INGREDIENT codes
        //Branch
        
        Item branch = new Item();
        branch.setName("Branch");
        branch.setDescription("A branch from a tree.");
        branch.setType("ingredient");
        branch.setPossibleQuantity(15);
        branch.setActualQuantity(0);
        
        String branchInfo = branch.toString();
        System.out.println(branch);
        
        //Flat Rock
        
        Item flatRock = new Item();
        flatRock.setName("Flat Rock");
        flatRock.setDescription("A flat rock");
        flatRock.setType("ingredient");
        flatRock.setPossibleQuantity(3);
        flatRock.setActualQuantity(0);
        
        String flatRockInfo = flatRock.toString();
        System.out.println(flatRock);
        
        //Sharp Rock
        
        Item sharpRock = new Item();
        sharpRock.setName("Sharp Rock");
        sharpRock.setDescription("A sharp rock.");
        sharpRock.setType("ingredient");
        sharpRock.setPossibleQuantity(3);
        sharpRock.setActualQuantity(0);
        
        String sharpRockInfo = sharpRock.toString();
        System.out.println(sharpRock);
        
        //Animal Skin
        
        Item animalSkin = new Item();
        animalSkin.setName("Animal Skin");
        animalSkin.setDescription("A skin obtained from a dead animal.");
        animalSkin.setType("ingredient");
        animalSkin.setPossibleQuantity(5);
        animalSkin.setActualQuantity(0);
        
        String animalSkinInfo = animalSkin.toString();
        System.out.println(animalSkin);
        
        //Raw Meat
        
        Item rawMeat = new Item();
        rawMeat.setName("Raw Meat");
        rawMeat.setDescription("Raw meat obtained from killing an animal.");
        rawMeat.setType("ingredient");
        rawMeat.setPossibleQuantity(5);
        rawMeat.setActualQuantity(0);
        
        String rawMeatInfo = rawMeat.toString();
        System.out.println(rawMeat);
        
        //Leather Strip
        
        Item leatherStrip = new Item();
        leatherStrip.setName("Leather Strip");
        leatherStrip.setDescription("A strip of leather cut from an animal skin.");
        leatherStrip.setType("ingredient");
        leatherStrip.setPossibleQuantity(20);
        leatherStrip.setActualQuantity(0);
        
        String leatherStripInfo = leatherStrip.toString();
        System.out.println(leatherStrip);
        
        //Flint
        
        Item flint = new Item();
        flint.setName("Flint");
        flint.setDescription("A piece of flint.");
        flint.setType("ingredient");
        flint.setPossibleQuantity(5);
        flint.setActualQuantity(0);
        
        String flintInfo = flint.toString();
        System.out.println(flint);
        
        //Stone
        
        Item stone = new Item();
        stone.setName("Stone");
        stone.setDescription("A small stone.");
        stone.setType("ingredient");
        stone.setPossibleQuantity(5);
        stone.setActualQuantity(0);
        
        String stoneInfo = stone.toString();
        System.out.println(stone);
        
        //Log
        
        Item log = new Item();
        log.setName("Log");
        log.setDescription("A large log obtained by cutting down a tree.");
        log.setType("ingredient");
        log.setPossibleQuantity(2);
        log.setActualQuantity(0);
        
        String logInfo = log.toString();
        System.out.println(log);
        
        //Gut String
        
        Item gutString = new Item();
        gutString.setName("Gut String");
        gutString.setDescription("String made from animal gut. Can be used as bow string or thread.");
        gutString.setType("ingredient");
        gutString.setPossibleQuantity(10);
        gutString.setActualQuantity(0);
        
        String gutStringInfo = gutString.toString();
        System.out.println(gutString);
        
        //FOOD codes
        //Berry
        
        Item berry = new Item();
        berry.setName("Berry");
        berry.setDescription("A wild berry. Provides fruit to round out your diet!");
        berry.setType("ingredient");
        berry.setPossibleQuantity(50);
        berry.setActualQuantity(0);
        
        String berryInfo = berry.toString();
        System.out.println(berry);
        
        //Cooked Meat
        
        Item cookedMeat = new Item();
        cookedMeat.setName("Cooked Meat");
        cookedMeat.setDescription("Cooked meat, ready to eat! Has lots of protein to keep your strength up!");
        cookedMeat.setType("ingredient");
        cookedMeat.setPossibleQuantity(10);
        cookedMeat.setActualQuantity(0);
        
        String cookedMeatInfo = cookedMeat.toString();
        System.out.println(cookedMeat);
        
        //Animal codes
        //DOCILE animals
        //Deer
        Animal deer = new Animal();
        deer.setName("Deer");
        deer.setDescription("A medium sized, agile animal that scares easily.");
        deer.setType("docile");
        deer.setMeat(20);
        deer.setHitpoints(20);
        
        String deerInfo = deer.toString();
        System.out.println(deer);
        
        //Elk
        Animal elk = new Animal();
        elk.setName("Elk");
        elk.setDescription("A large animal that scares easily.");
        elk.setType("docile");
        elk.setMeat(30);
        elk.setHitpoints(40);
        
        String elkInfo = elk.toString();
        System.out.println(elk);
        
        //Rabbit
        Animal rabbit = new Animal();
        rabbit.setName("Rabbit");
        rabbit.setDescription("A small, quick animal that scares easily.");
        rabbit.setType("docile");
        rabbit.setMeat(5);
        rabbit.setHitpoints(5);
        
        String rabbitInfo = rabbit.toString();
        System.out.println(rabbit);

        //Raccoon
        
        Animal raccoon = new Animal();
        raccoon.setName("Raccoon");
        raccoon.setDescription("A small, curious animal that doesn't scare easily, raccoons like to steal food!");
        raccoon.setType("docile");
        raccoon.setMeat(5);
        raccoon.setHitpoints(10);
        
        String raccoonInfo = raccoon.toString();
        System.out.println(raccoon);

        //DANGEROUS animals
        //Wolf
        
        Animal wolf = new Animal();
        wolf.setName("Wolf");
        wolf.setDescription("medium sized carnivore that is dangerous. Careful about hunting wolves, they'll fight back!");
        wolf.setType("dangerous");
        wolf.setMeat(10);
        wolf.setHitpoints(30);
        
        String wolfInfo = wolf.toString();
        System.out.println(wolf);
        
        //Moose
        
        Animal moose = new Animal();
        moose.setName("Moose");
        moose.setDescription("A huge animal that is very dangerous. Hunting a moose is a daunting task!");
        moose.setType("dangerous");
        moose.setMeat(50);
        moose.setHitpoints(60);
        
        String mooseInfo = moose.toString();
        System.out.println(moose);
        
        //Bear
        
        Animal bear = new Animal();
        bear.setName("Bear");
        bear.setDescription("A huge animal that is extremely dangerous! Stay away from this animal!!");
        bear.setType("dangerous");
        bear.setMeat(40);
        bear.setHitpoints(80);
        
        String bearInfo = bear.toString();
        System.out.println(bear);
        
        
        //Npc codes
        //Uncle Darwin
        
        Npc uncleDarwin = new Npc();
        uncleDarwin.setName("Uncle Darwin");
        
        String uncleDarwinInfo = uncleDarwin.toString();
        System.out.println(uncleDarwin);
        
        
        //Building codes
        //Cabin
        
        Building cabin = new Building();
        cabin.setName("Cabin");
        cabin.setDescription("A sturdy shelter that requires a medium amount of materials to build.");
        cabin.setType("permanent");
        cabin.setLength(20);
        cabin.setWidth(30);
        cabin.setHeight(20);
        
        String cabinInfo = cabin.toString();
        System.out.println(cabin);
        
        //Tower
        
        Building tower = new Building();
        tower.setName("Tower");
        tower.setDescription("A tall, solid structure that requires lots of materials to build but will reveal the surrounding area for miles.");
        tower.setType("permanent");
        tower.setLength(20);
        tower.setWidth(20);
        tower.setHeight(75);
        
        String towerInfo = tower.toString();
        System.out.println(tower);
        
        //Lean-to
        
        Building leanTo = new Building();
        leanTo.setName("Lean-to");
        leanTo.setDescription("A small makeshift shelter, requiring few materials to build, that provides protection from the elements for a short period of time.");
        leanTo.setType("temporary");
        leanTo.setLength(8);
        leanTo.setWidth(4);
        leanTo.setHeight(4);
        
        String leanToInfo = leanTo.toString();
        System.out.println(leanTo);
        
        
    }
    
}
