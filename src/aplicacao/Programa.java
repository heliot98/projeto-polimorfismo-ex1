package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("Informe a quantidade de funcionarios: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionario #" + i);
			System.out.print("É terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.println("Cobranca Adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				Funcionario func = new FuncionarioTerceirizado(nome, horas, valorPorHora, cobrancaAdicional);
				list.add(func);

			} else {
				Funcionario func = new Funcionario(nome, horas, valorPorHora);
				list.add(func);
			}
		}
		System.out.println();
		System.out.println("Pagamentos");
		for(Funcionario func : list) {
			System.out.println(func.getNome() + " - R$" + func.pagamento());
		}
		
		sc.close();
	}

}
