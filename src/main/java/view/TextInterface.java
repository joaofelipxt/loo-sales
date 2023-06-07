package view;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import control.Register;
import model.Client;
import model.Product;

public class TextInterface {
	private static final String SAIR = "sair";

	private Scanner entrada;
	private String opcao;
	private NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	private Client client;
	private Product product;
	private Register register;

	public TextInterface() {
			entrada = new Scanner(System.in);
			register = new Register();
		}

	public void renderizar() {
		do {
			limpar();
			menu();
		} while (!opcao.equals(SAIR));
	}

	private void menu() {
		menuPrincipal();
		leiaVerifiqueOpcoesMenuPrincipal();
	}

	/*
	 **************************************************************
	 * Menu Principal
	 **************************************************************/
	private void menuPrincipal() {
		String titulo = "Empresa IOO Ltda";

		sln("----------------------------------------");
		sln("|" + centralizarTitulo(titulo) + "|");
		sln("----------------------------------------");
		sln("|               Menu                   |");
		sln("----------------------------------------");
		sln("| 1 - Registrar produto                |");
		sln("| 2 - Listar produtos                  |");
		sln("|                                      |");
		sln("|                                      |");
		sln("| Digite sair para encerrar            |");
		sln("----------------------------------------");
		sln("");
	}

	private void leiaVerifiqueOpcoesMenuPrincipal() {
		opcao = leia("Digite a opção escolhida");
		limpar();
		switch (opcao) {
		case "1":
			registrar();
			break;
		case "2":
			listarFuncionarios();
			break;
		case SAIR:
			sln("Tchau!");
			return;
		default:
			sln("Opção inválida!!");
		}
		pause();
	}

	/*
	 * Métodos referente as opções do menu principal
	 **************************************************************/

	private void registrar() {
		sln("------------------------------------------");
		sln("|           Tipos de Registro            |");
		sln("------------------------------------------");
		sln("| 1 - Produto                            |");
		sln("| 2 - Cliente                            |");
		sln("|                                        |");
		sln("| Precione enter para cancelar           |");
		sln("------------------------------------------");

		String tipo = leia("Digite tipo do registro:      ");
		String nome = leia("Digite o nome do produto:     ");
		double weight = leiaDouble("Digite o peso do produto:   ");
		

		switch (tipo) {
		case "1":
			long id = leiaInteiro("Digite o id do funcionário: ");
			register.productRegister(new Product(nome, id, weight));
			break;
		case "2":
			break;
		}
	}

	/*private void mostrarTotalDeSalariosAPagar() {
		sln("------------------------------------------");
		sln("|   Valor total dos sálarios a pagar     |");
		sln("------------------------------------------");
		sln(formatador.format(empresa.getTotalDeSalariosAPagar()));
	} */

	private void listarFuncionarios() {
		sln("---------------------------------------");
		sln("|  Funcionários da empresa IOO Ltda   |");
		sln("---------------------------------------");
		sln("|  Nome  |    Id_Func    |    Peso    |");
		sln("---------------------------------------");

		for (Product p : register.getProducts()) {
			sf("| %-6s | %-10s | %-13s |\n", p.getName(), p.getId(), formatador.format(p.getWeight()));
			sln("---------------------------------------");
		}
	}

	/*
	 ***************************************************************
	 * Métodos úteis
	 **************************************************************/

	private String centralizarTitulo(String titulo) {
		int tamanho = titulo.length();
		int qntDeEspacos = (38 - tamanho) / 2;
		String espacos = " ".repeat(qntDeEspacos);

		titulo = espacos + titulo + espacos;

		if (tamanho % 2 == 0)
			return titulo;

		return titulo + " ";
	}

	/**************************************************************
	 * Métodos para entrada e saída de dados
	 **************************************************************/

	private void pause() {
		sln();
		sln("Pressione a tecla enter para continuar..");
		entrada.nextLine();
	}

	private String leia(String s) {
		sln(s);
		s("> ");
		return entrada.nextLine().trim();
	}

	private int leiaInteiro(String s) {
		String linha = leia(s);
		return Integer.parseInt(linha);
	}

	private double leiaDouble(String s) {
		String linha = leia(s);
		return Double.parseDouble(linha);
	}

	private void limpar() {
		s("\033[H\033[2J");
		System.out.flush(); // Limpa terminal do Linux
		s("\f"); // Limpa terminal do Bluej
	}

	private void sln() {
		System.out.println();
	}

	private void sln(Object s) {
		System.out.println(s);
	}

	private void s(Object s) {
		System.out.print(s);
	}

	private void sf(Object s, Object... args) {
		System.out.printf(s.toString(), args);
	}
}
