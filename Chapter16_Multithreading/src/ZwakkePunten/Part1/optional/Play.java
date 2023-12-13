package ZwakkePunten.Part1.optional;

import java.util.Optional;

public class Play {
    public static void main(String[] args) {
        Characters characters = new Characters();

        Optional<Characters> optional = characters.getCharacter("Namii");
        Characters chosenCharacter = optional.orElse(new Characters("Zoro"));
        chosenCharacter.fight();

    }
}
