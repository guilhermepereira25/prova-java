package Weapon;

public class Weapon {
    protected String descricao;
    protected float dano;

    public Weapon(String descricao, float dano) {
        this.descricao = descricao;
        this.dano = dano;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public float getDano() {
        return this.dano;
    }

    public void drop() {}

    public void pickUp() {
        System.out.println(getDescricao());
    }
}
