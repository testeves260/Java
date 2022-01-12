package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Double tax, Integer numeroFuncionarios) {
		super(name, rendaAnual, tax);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double totalTaxes() {
		
		if(numeroFuncionarios < 10) {
			tax = rendaAnual * 0.16;
		} else {
			tax = rendaAnual * 0.14;
		}
		return tax;
	}
}
