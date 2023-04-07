package harrypotterkata.hogwarts.sortinghat;

import harrypotterkata.hogwarts.house.House;
import org.junit.Test;

import static harrypotterkata.hogwarts.Wizard.createWizardlyWizard;
import static harrypotterkata.hogwarts.house.House.*;
import static org.assertj.core.api.Assertions.assertThat;

public class SortingHatTest {

    @Test
    public void determineHouseForWizard() throws Exception {
        House result = SortingHat.determineHouseForWizard(createWizardlyWizard("Ron Weasley"));

        assertThat(result).isIn(GRYFFINDOR, SLYTHERIN, HUFFLEPUFF, RAVENCLAW);
    }
}