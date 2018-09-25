package harrypotterkata.hogwarts.sortinghat;

import harrypotterkata.hogwarts.Wizard;
import harrypotterkata.hogwarts.house.House;

import static harrypotterkata.hogwarts.random.RandomEnum.getRandom;

public class SortingHat {
    public static House determineHouseForWizard(Wizard wizard) {
        House house = getRandom(House.class);

        StringBuilder sb = new StringBuilder();
        sb.append("Sorting Hat:");
        sb.append("\n");
        sb.append("Hmm, who do we have here?");
        sb.append("\n");
        sb.append("Ah, I see, it's " + wizard.getName());
        sb.append("\n");
        sb.append("Where shall we put you...");
        sb.append("\n");
        sb.append("Oh, I know...");
        sb.append("\n");
        sb.append("OK " + wizard.getName() + ", I'll put you in ... " + house.name() + "!");
        System.out.println(sb);

        return house;
    }
}
