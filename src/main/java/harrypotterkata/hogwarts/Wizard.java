package harrypotterkata.hogwarts;

import harrypotterkata.hogwarts.house.House;
import harrypotterkata.hogwarts.sortinghat.SortingHat;

public class Wizard {
    private String name;
    private House house;

    private Wizard(String name) {
        this.name = name;
        this.house = SortingHat.determineHouseForWizard(this);
    }

    public static Wizard createWizardlyWizard(String name) {
        return new Wizard(name);
    }

    public String getName() {
        return name;
    }

    public House getHouse() {
        return house;
    }
}
