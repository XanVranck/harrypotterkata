package harrypotterkata.hogwarts;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WizardTest {
    @Test
    public void createWizardlyWizard() throws Exception {
        Wizard theBoyWhoSurvived = Wizard.createWizardlyWizard("Harry Potter");

        assertThat(theBoyWhoSurvived.getName()).isEqualTo("Harry Potter");
    }

}