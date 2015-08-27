package main;
import java.io.IOException;

import NegocioLoc.Cliente;
import NegocioLoc.Filmes;
import NegocioLoc.Funcionario;
import locadora.io.EscreverArquivo;
import locadora.io.LerTeclado;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// //new LerTeclado();
		// LerTeclado lerTeclado = new LerTeclado();
		//
		// String linha = lerTeclado.lerLinha();
		//
		// lerTeclado.close();
		//
		// new EscreverArquivo(linha);

		EscreverArquivo escreverArquivo = new EscreverArquivo("RegistrosCliente");
		LerTeclado lerTeclado = new LerTeclado();
		Cliente cliente = new Cliente();

		System.out.println("Informe o nome do cliente");
		String nome = lerTeclado.lerLinha();
		cliente.setNome(nome);

		System.out.println("Informe o id do cliente");
		String id = lerTeclado.lerLinha();
		cliente.setId(Integer.parseInt(id));

		escreverArquivo.escreverLinha(cliente.toString());

		escreverArquivo.close();

		EscreverArquivo escreverArquivo1 = new EscreverArquivo("RegistroFuncionarios");
		LerTeclado lerTeclado1 = new LerTeclado();
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o nome do Funcionário");
		String nome1 = lerTeclado1.lerLinha();
		funcionario.setNome(nome1);

		System.out.println("Informe a lotação do Funcionário");
		String lotacao = lerTeclado1.lerLinha();
		funcionario.setLotacao(lotacao);

		escreverArquivo1.escreverLinha(funcionario.toString());

		escreverArquivo1.close();
		
		EscreverArquivo escreverArquivo2 = new EscreverArquivo("RegistroFilmes");
		LerTeclado lerTeclado2 = new LerTeclado();
		Filmes filme = new Filmes();
		
		System.out.println("Informe o nome do filme: ");
		String nome2 = lerTeclado2.lerLinha();
		filme.setNomeFilme(nome2);

		System.out.println("Informe o tipo de filme: ");
		String tipo = lerTeclado2.lerLinha();
		filme.setTipoFilme(tipo);
		
		System.out.println("Informe a quantidade do filme: ");
		String quantidadeFilme = lerTeclado2.lerLinha();
		filme.setQuantidadeFilme(Integer.parseInt(quantidadeFilme));;
		

		escreverArquivo2.escreverLinha(filme.toString());

		escreverArquivo2.close();

	}
}
