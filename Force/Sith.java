package Force;

import java.util.ArrayList;

public class Sith implements Force {
    private String nome;
    private String titulo;

    private ArrayList<String> weapons;
    public Sith (String nome, String titulo, ArrayList<String> weapons) {
        this.nome = nome;
        this.titulo = titulo;
        this.weapons = weapons;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void lightning() {

    }

    public void getWeaponsList(ArrayList weapons) {
        for (int i=0; i< weapons.size(); i++) {
            System.out.println(weapons.get(i) + "");
        }
    }

    @Override
    public void mindControl() {
        System.out.println("Do what i wish");
    }

    @Override
    public void farseeing() {

    }

    @Override
    public void telepath() {

    }

    @Override
    public void levitation() {

    }
}
