package br.poo.empresa;

public class Departamento {

	private Pessoa chefe;

    public Departamento(Pessoa chefe) {
        this.chefe = chefe;
    }

    public Pessoa getChefe() {
        return chefe;
    }
}
