package harrypotterkata.hogwarts.sortinghat;

import harrypotterkata.hogwarts.Wizard;
import harrypotterkata.hogwarts.house.House;

import java.util.Random;

public class SortingHat {
    private static final Random RANDOM = new Random();

    public static House determineHouseForWizard(Wizard wizard) {
        House house = randomHouse(House.class);
        System.out.println(String.format("%s is sorted in: %s", wizard.getName(), house.name()));
        return house;
    }

    private static <T extends Enum<?>> T randomHouse(Class<T> clazz){
        int x = RANDOM.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
