package entities;

public final class PessoaFisica extends Contribuintes{
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public final double imposto() {
		double imposto;
		
		if (rendaAnual < 20000.0) 	imposto = rendaAnual * 0.15;
		else 						imposto = rendaAnual * 0.25;
		
		imposto -= gastosSaude * 0.5;
				
		return imposto;
	}
}
