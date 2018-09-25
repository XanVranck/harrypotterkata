package harrypotterkata.hogwarts.duel;

import harrypotterkata.hogwarts.Wizard;
import org.junit.Test;

import static harrypotterkata.hogwarts.Wizard.createWizardlyWizard;
import static org.assertj.core.api.Assertions.assertThat;

public class DuellingClubTest {

    @Test
    public void duel() {
        Wizard theAlmightyDumbledore = createWizardlyWizard("Dumbledore");
        Wizard heWhoMustNotBeNamed = createWizardlyWizard("Tom Riddle");

        Wizard winner = new DuellingClub().duel(theAlmightyDumbledore, heWhoMustNotBeNamed);

        assertThat(winner.getHp()).isPositive();
        if (winner.equals(theAlmightyDumbledore)) {
            assertThat(winner.getName()).isEqualTo("Dumbledore");
        } else {
            assertThat(winner.getName()).isEqualTo("Tom Riddle");
        }
    }
}