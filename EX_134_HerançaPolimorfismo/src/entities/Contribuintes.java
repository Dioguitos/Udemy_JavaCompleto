package entities;

public abstract class Contribuintes {
	protected String nome;
	protected Double rendaAnual;
	
	public Contribuintes() {
	}

	public Contribuintes(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	
	public String getNome() {
		return nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract double imposto();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + ": $ ");
		sb.append(String.format("%.2f", imposto()));
		return sb.toString();
	}
}
