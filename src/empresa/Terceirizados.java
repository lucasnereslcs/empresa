package empresa;

public class Terceirizados extends Funcionarios {

	private double adicional;

	public Terceirizados(String name, int horas, double valorPorHora, double adicional) {
		super(name, horas, valorPorHora);
		

		this.adicional = adicional * 110 / 100;
	}
	
	
	
	
	
	

	@Override
	public double Pagamento() {

		return super.Pagamento() + this.adicional;
	}
}
