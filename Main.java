import Force.Jedi;
import Force.Sith;
import Weapon.Saber;
import Weapon.Blast;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa novaPessoa1 = new Pessoa("Leia", "Organa", "F");

        Pessoa novaPessoa2 = new Pessoa("Luke", "Skywalker", "M");

        System.out.printf(novaPessoa1.getNome());
        System.out.printf(novaPessoa2.getNome());

        Saber sabreAzul = new Saber("Um sabre de luz azul", 200);
        Saber sabreVermelho = new Saber("Um sabre de luz vermelho", 500);
        Blast blastLazer = new Blast("Blast Lazer", 1000);

        ArrayList<String> weapons = new ArrayList<>();

        weapons.add("Sabre de luz verde");
        weapons.add("Sabre de luz azul");
        weapons.add("Sabre de luz vermelho");

        Jedi jedi = new Jedi("Obi-wan Kenobi", "Jedi", weapons);
        jedi.levitation();
        sabreVermelho.pickUp();
        blastLazer.shot();
        blastLazer.drop();
        jedi.getWeaponsList(weapons);

        Sith sith = new Sith("Darth Vader", "Sith", weapons);
        sith.mindControl();
        sabreAzul.slash();
        sabreVermelho.pickUp();

        System.out.println(sith.getNome());
        System.out.println(sabreAzul.getDescricao());

        System.out.println(jedi.getNome());
        System.out.println(sabreVermelho.getDescricao());

    }
}