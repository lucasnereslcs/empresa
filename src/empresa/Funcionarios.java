package empresa;

public class Funcionarios {

	protected String name;
	protected int horas;
	protected double valorPorHora;
	
	public Funcionarios(String name, int horas, double valorPorHora) {		
		this.name = name;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	
	
	
	
	
	

   public double Pagamento() {
	   
	   return horas * valorPorHora;
   }
	
}
