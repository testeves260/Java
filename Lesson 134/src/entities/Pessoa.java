package entities;

public class Pessoa {

	protected String name;
	protected Double rendaAnual;
	protected Double tax;
	
	public Pessoa() {}
	
	public Pessoa(String name, Double rendaAnual, Double tax) {
		
		this.name = name;
		this.rendaAnual = rendaAnual;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double totalTaxes() {
		
		return null;
	}
	
	
}
