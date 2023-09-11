package br.poo.empresa;

public class Empresa {
	private Departamento conselho;
	private Departamento tecnologia;
	private Departamento financeiro;

    public Empresa(Departamento conselho, Departamento tecnologia, Departamento financeiro) {
        this.conselho = conselho;
        this.tecnologia = tecnologia;
        this.financeiro = financeiro;
    }

    public String getNomeCEO() {
        Pessoa chefe = conselho.getChefe();
        return chefe.getNome();
    }
    
    public String getNomeCTO() {
        Pessoa chefe = tecnologia.getChefe();
        return chefe.getNome();
    }
    
    public String getNomeCFO() {
        Pessoa chefe = financeiro.getChefe();
        return chefe.getNome();
    }
}
