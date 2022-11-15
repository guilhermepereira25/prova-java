package Force;

import Weapon.Weapon;

import java.util.ArrayList;

public class Sith implements Force {
    private String nome;
    private String titulo;
    public Sith (String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void lightning() {

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
