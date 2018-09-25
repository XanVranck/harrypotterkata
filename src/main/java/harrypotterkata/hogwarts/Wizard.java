package harrypotterkata.hogwarts;

public class Wizard {
    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    public static Wizard createWizardlyWizard(String name) {
        return new Wizard(name);
    }

    public String getName() {
        return name;
    }
}
