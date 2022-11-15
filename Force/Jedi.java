package Force;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jedi implements Force {
    public String nome;
    public String titulo;

    public Jedi (String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;
    }

    public void patiente() {
    }

    public String getNome() {
        return this.nome;
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
