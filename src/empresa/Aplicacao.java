package empresa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Locale.setDefault(Locale.US);
		 
		 

		List<Funcionarios> func = new ArrayList<>();
		

		Scanner sc = new Scanner(System.in);
		int count, horas;
		String c, nome;
		double valor_hora, adicional;

		System.out.println("Digite o numero de Funcionarios:");
		count = sc.nextInt();

		for (int i = 1; i <= count; i++) {

			System.out.println("Dados #" + i + " Funcionario");
			System.out.println("Funcionario Terceirizado (y/n)?");
			c = sc.next();

			if (c.equals("n")) {
				System.out.println("Nome:");
				nome = sc.next();
				System.out.println("Horas:");
				horas = sc.nextInt();
				System.out.println("Valor por Hora");
				valor_hora = sc.nextDouble();
				Funcionarios f = new Funcionarios(nome, horas, valor_hora);
				func.add(f);
			}

			if (c.equals("y")) {
				System.out.println("Nome:");
				nome = sc.next();
				System.out.println("Horas:");
				horas = sc.nextInt();
				System.out.println("Valor por Hora");
				valor_hora = sc.nextDouble();
				System.out.println("Adicional:");
				adicional = sc.nextDouble();
				Terceirizados t = new Terceirizados (nome, horas, valor_hora, adicional);				
				func.add(t);
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		
			
			for(Funcionarios f : func) {
				System.out.println(f.name + "- $" + " "+ String.format("%.2f", f.Pagamento()));
				
			}
			
			
		}

	}


