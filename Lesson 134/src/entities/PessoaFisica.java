package entities;

public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double tax, Double gastosSaude) {
		super(name, rendaAnual, tax);
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double totalTaxes() {
		
		if(rendaAnual < 20000.00) {
			tax = rendaAnual * 0.15;
		} else {
			tax = rendaAnual * 0.25;
		}
		
		if(gastosSaude > 0) {
			tax = tax - (gastosSaude/2);
		}
		return tax;
	}
	
	
}
