package Weapon;

public class Blast extends Weapon {

    public Blast(String descricao, float dano) {
        super(descricao, dano);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public void shot() {}
}
