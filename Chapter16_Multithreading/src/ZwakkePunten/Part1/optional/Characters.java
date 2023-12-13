package ZwakkePunten.Part1.optional;

import java.util.Arrays;
import java.util.Optional;

public class Characters {
    String[] AllCharacters = {"Luffy", "Zoro", "Sanji", "Nami", "Chopper"};
    String name;

    public Characters(){

    }

    public Characters(String name){
        this.name = name;
    }

    public Optional<Characters> getCharacter(String name){
        if (Arrays.asList(AllCharacters).contains(name))
            return Optional.of(new Characters(name));
        return Optional.empty();
    }

    public void fight(){
        switch (name){
            case "Luffy":   System.out.println("Gomu Gomu no Red Hawk"); break;
            case "Zoro":    System.out.println("Demon Slash");           break;
            case "Sanji":   System.out.println("Devil Leg");             break;
            case "Nami":    System.out.println("Thunderbolt Tempo");     break;
            case "Chopper": System.out.println("Kung Fu Point");
        }
    }


}
