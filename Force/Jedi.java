package Force;

import java.util.ArrayList;

public class Jedi implements Force {
    private String nome;
    private String titulo;

    private ArrayList<String> weapons;

    public Jedi (String nome, String titulo, ArrayList<String> weapons) {
        this.nome = nome;
        this.titulo = titulo;
        this.weapons = weapons;
    }

    public void patiente() {
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public void getWeaponsList(ArrayList weapons) {
        for (int i=0; i<weapons.size(); i++) {
            System.out.println(weapons.get(i) + "");
        }
    }

    @Override
    public void mindControl() {

    }

    @Override
    public void farseeing() {

    }

    @Override
    public void telepath() {

    }

    @Override
    public void levitation() {
        System.out.println("Levitating Something");
    }
}
