
package principal;//pacote que o código principal vai rodar

//Imports necessários para o funcionamento do programa

import java.util.Scanner;

import dadosclientes.Cliente;//pacote responsavel por armazenar dados dos clientes

import dadosprodutos.Produto;//pacote responsavel por armazenar dados dos produtos

//fim dos importes

public class TrabalhoProgramado1 {
	
	public static void MenuOpcoes() {//Menu de opções disponiveis no programa
		
		System.out.println("Selecione uma das opções a seguir!");
		System.out.println("-------------------------------------------------------------------------------------------------------------------- ");
		System.out.println("1- Cadastar novo cliente ");
		System.out.println("2- Buscar por cliente ");
		System.out.println("3- Cadastrar novo produto ");
		System.out.println("4- Buscar produto ");
		System.out.println("5- Cadastrar venda  ");
		System.out.println("6- Mostrar produtos em estoque ");
		System.out.println("7- Encerrar programa ");
		System.out.println("-------------------------------------------------------------------------------------------------------------------- \n");
		System.out.println("Informe sua opção: ");
		
	}
	
	 static Cliente[] clientesprecadast(Cliente[] cadastroc){//Clientes precadastrados
		
		cadastroc[0] = new Cliente();
		cadastroc[0].setNome("João");
		cadastroc[0].setEndereco("Brasilia");
		cadastroc[0].setTelefone("52511924");
		cadastroc[1] = new Cliente();
		cadastroc[1].setNome("Pedro");
		cadastroc[1].setEndereco("Brasilia");
		cadastroc[1].setTelefone("17382625");
		cadastroc[2] = new Cliente();
		cadastroc[2].setNome("Marcos");
		cadastroc[2].setEndereco("Taguatinga");
		cadastroc[2].setTelefone("46866361");
		cadastroc[3] = new Cliente();
		cadastroc[3].setNome("Vinícius");
		cadastroc[3].setEndereco("Taguatinga");
		cadastroc[3].setTelefone("82518097");
		cadastroc[4] = new Cliente();
		cadastroc[4].setNome("Roberto");
		cadastroc[4].setEndereco("Samambaia");
		cadastroc[4].setTelefone("85901577");
		cadastroc[5] = new Cliente();
		cadastroc[5].setNome("Marisa");
		cadastroc[5].setEndereco("Samambaia");
		cadastroc[5].setTelefone("79153359");
		cadastroc[6] = new Cliente();
		cadastroc[6].setNome("Maria");
		cadastroc[6].setEndereco("Sobradinho");
		cadastroc[6].setTelefone("59770877");
		cadastroc[7] = new Cliente();
		cadastroc[7].setNome("Antônio");
		cadastroc[7].setEndereco("Sobradinho");
		cadastroc[7].setTelefone("47399354");
		cadastroc[8] = new Cliente();
		cadastroc[8].setNome("Bob");
		cadastroc[8].setEndereco("Paranoá");
		cadastroc[8].setTelefone("12969493");
		cadastroc[9] = new Cliente();
		cadastroc[9].setNome("Artur");
		cadastroc[9].setEndereco("Paranoá");
		cadastroc[9].setTelefone("31078098");
		
		return cadastroc;
		
	}
	
	 static Produto[] produtosprecadast(Produto[] cadastrop) {//Produtos pré-cadastrados
		 
		 cadastrop[0] = new Produto();
		 cadastrop[0].setNome("Sardinha");
		 cadastrop[0].setDescricao("Enlatado");
		 cadastrop[0].setEstoque(3);
		 cadastrop[0].setValor(10);
		 cadastrop[0].setLucro(10);
		 cadastrop[1] = new Produto();
		 cadastrop[1].setNome("Leite condensado");
		 cadastrop[1].setDescricao("Enlatado");
		 cadastrop[1].setEstoque(3);
		 cadastrop[1].setValor(12);
		 cadastrop[1].setLucro(10);
		 cadastrop[2] = new Produto();
		 cadastrop[2].setNome("Maçã");
		 cadastrop[2].setDescricao("Fruta Orgânica");
		 cadastrop[2].setEstoque(4);
		 cadastrop[2].setValor(15);
		 cadastrop[2].setLucro(10);
		 cadastrop[3] = new Produto();
		 cadastrop[3].setNome("Melancia");
		 cadastrop[3].setDescricao("Fruta Orgânica");
		 cadastrop[3].setEstoque(5);
		 cadastrop[3].setValor(20);
		 cadastrop[3].setLucro(15);
		 cadastrop[4] = new Produto();
		 cadastrop[4].setNome("Laranja");
		 cadastrop[4].setDescricao("Fruta Orgânica");
		 cadastrop[4].setEstoque(2);
		 cadastrop[4].setValor(100);
		 cadastrop[4].setLucro(40);
		 cadastrop[5] = new Produto();
		 cadastrop[5].setNome("Sabão em pó");
		 cadastrop[5].setDescricao("Produto de limpeza");
		 cadastrop[5].setEstoque(30);
		 cadastrop[5].setValor(125);
		 cadastrop[5].setLucro(25);
		 cadastrop[6] = new Produto();
		 cadastrop[6].setNome("Desinfetante");
		 cadastrop[6].setDescricao("Produto de limpeza");
		 cadastrop[6].setEstoque(35);
		 cadastrop[6].setValor(36);
		 cadastrop[6].setLucro(10);
		 cadastrop[7] = new Produto();
		 cadastrop[7].setNome("Escova de dentes");
		 cadastrop[7].setDescricao("Higiene pessoal");
		 cadastrop[7].setEstoque(7);
		 cadastrop[7].setValor(10);
		 cadastrop[7].setLucro(9);
		 cadastrop[8] = new Produto();
		 cadastrop[8].setNome("Fio dental");
		 cadastrop[8].setDescricao("Higiene pessoal");
		 cadastrop[8].setEstoque(4);
		 cadastrop[8].setValor(10);
		 cadastrop[8].setLucro(41);
		 cadastrop[9] = new Produto();
		 cadastrop[9].setNome("Sabonete");
		 cadastrop[9].setDescricao("Higiene pessoal");
		 cadastrop[9].setEstoque(6);
		 cadastrop[9].setValor(10);
		 cadastrop[9].setLucro(60);
		 
		 return cadastrop;
	 }
 	
 	public static void opcao1(int quantcliente,Cliente[] cadastroc, Scanner ler,int i) {//Primeira opção do menu
 		
 		for(i=10;i<(quantcliente+10);i++) {//cadastro dos clientes 
 			
 		cadastroc[i] = new Cliente();
 		System.out.println("Informe o nome do cliente " + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastroc[i].setNome(ler.nextLine());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("Informe o endereco do cliente " + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastroc[i].setEndereco(ler.nextLine());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("Informe o telefone do cliente " + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastroc[i].setTelefone(ler.nextLine());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("\nCliente " + (i+1) + " cadastrado com sucesso!\n");
		
 		}
 		
 	 }
	
 	public static void opcao2(int quantcliente,Cliente[] cadastroc, Scanner ler,int i) {//Segunda opção do menu
 		
 		char resposta;//caracter para resposta de mudanca de dados do cliente cadastrado
 		
 		if(quantcliente>0) {
			String nomebuscado; boolean achou=false;
			
			System.out.println("Informe o nome desejado : ");
			nomebuscado = ler.nextLine();
			
			for(i=0;i<(quantcliente+10);i++) {//Busca pelo nome desejado
				
				if(cadastroc[i].buscaNome(nomebuscado)) {//verifica se o nome do cliente foi cadastrado
					System.out.println("Cliente encontrado!");
					achou = true;
					System.out.println("Nome: " + cadastroc[i].getNome());
					System.out.println("Endereço: " + cadastroc[i].getEndereco());
					System.out.println("Telefone: " + cadastroc[i].getTelefone());
					System.out.println("Você deseja alterar os dados do cliente encontrado?  Digite s(sim) ou n(não)");
					resposta = ler.next().charAt(0);
					if(resposta=='s'){//Escolha por alterar dados
						
						cadastroc[i] = new Cliente();
				 		System.out.println("Informe o novo nome do cliente(caso necessário, confirme usando a tecla enter 2 vezes) : ");
						cadastroc[i].setNome(ler.nextLine());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Informe o novo endereco do cliente (caso necessário, confirme usando a tecla enter 2 vezes):" );
						cadastroc[i].setEndereco(ler.nextLine());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Informe o novo telefone do cliente (caso necessário, confirme usando a tecla enter 2 vezes):" );
						cadastroc[i].setTelefone(ler.nextLine());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Alterações realizadas com sucesso!" );
						
					}
					
				}
					
			}
			if(achou==false) {//nao encontrado
				
				System.out.println("O cliente não foi encontrado! \n");
				
			}
			}else //nenhum produto cadastrado
				
				System.out.println("Não há clientes cadastrados \n");
 		
 	}
 	
 	public static void opcao3(int quantproduto,Produto[] cadastrop, Scanner ler,int i) {//terceira opção do menu
 		
 		for(i=10;i<(quantproduto+10);i++) {//cadastro dos produtos
 			
 		cadastrop[i] = new Produto();
 		System.out.println("Informe o nome do produto " + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastrop[i].setNome(ler.nextLine());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("Informe uma breve descrição do produto " + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastrop[i].setDescricao(ler.nextLine());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("Informe a quantidade em estoque do produto " + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastrop[i].setEstoque(ler.nextInt());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("Informe o valor do produto " + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastrop[i].setValor(ler.nextFloat());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("Informe o lucro ganho pelo produto percentualmente do produto" + (i+1) + " (caso necessário, confirme usando a tecla enter 2 vezes) : ");
		cadastrop[i].setLucro(ler.nextFloat());
		ler.nextLine();//limpar buffer de memória
		
		System.out.println("\nProduto " + (i+1) + " cadastrado com sucesso!\n");
		
 		}
 		
 	}
 	
 	public static void opcao4(int quantproduto,Produto[] cadastrop, Scanner ler,int i) {//quarta opção do menu
 		
 		char respostap;//caracter para resposta de mudanca de dados do produto cadastrado
 		String produtobuscado; boolean achou=false;
 		
 		if(quantproduto>0) {//Caso existam produtos cadastrados,levando em conta que não existissem dados pré-cadastrados

			System.out.println("Informe o nome desejado : ");
			produtobuscado = ler.nextLine();
			
			for(i=0;i<(quantproduto+10);i++) {//Busca pelo nome desejado
				
				if(cadastrop[i].buscaProduto(produtobuscado)) {//verifica se o nome do cliente foi cadastrado
					System.out.println("Produto encontrado!");
					achou = true;
					System.out.println("Nome do produto: " + cadastrop[i].getNome());
					System.out.println("Descricao: " + cadastrop[i].getDescricao());
					System.out.println("Quantidade em estoque: " + cadastrop[i].getEstoque());
					System.out.println("Valor: " + cadastrop[i].getValor());
					System.out.println("Porcentagem de lucro: " + cadastrop[i].getLucro());
					System.out.println("Você deseja alterar os dados do cliente encontrado?  Digite s(sim) ou n(não)");
					respostap = ler.next().charAt(0);
					ler.nextLine();//limpar buffer de memória
					
					if(respostap=='s'){//Escolha por alterar dados
						
						cadastrop[i] = new Produto();
				 		System.out.println("Informe o novo nome do produto (caso necessário, confirme usando a tecla enter 2 vezes) : ");
						cadastrop[i].setNome(ler.nextLine());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Informe uma nova descricao do produto (caso necessário, confirme usando a tecla enter 2 vezes) : " );
						cadastrop[i].setDescricao(ler.nextLine());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Informe a quantidade em estoque do produto (caso necessário, confirme usando a tecla enter 2 vezes) : " );
						cadastrop[i].setEstoque(ler.nextInt());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Informe o valor do produto (caso necessário, confirme usando a tecla enter 2 vezes) : " );
						cadastrop[i].setValor(ler.nextFloat());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Informe a porcentagem de lucro (caso necessário, confirme usando a tecla enter 2 vezes) : " );
						cadastrop[i].setLucro(ler.nextFloat());
						ler.nextLine();//limpar buffer de memória
						
						System.out.println("Alterações realizadas com sucesso!" );
						
					}
					
				}
					
			}
			if(achou==false) {//nao encontrado
				
				System.out.println("O Produto não foi encontrado! \n");
				
			}
			}else //nenhum produto cadastrado
				
				System.out.println("Não há Produtos cadastrados \n");
 		
 	}
 	
 	public static void opcao5(int quantproduto,int quantcliente,Cliente[] cadastroc,Produto[] cadastrop, Scanner ler,int i){//quinta opção do menu
 		
 		int respostac,respostap;//variavel para a escolha do cliente e do produto,respectivamente
 		int quantvendida;//quantidade de produtos vendidos
 		char escolha;//caracter para escolha do cadastro de mais vendas ou não
 		
 		
 		escolha= 's';//padronizado como 's'(sim) para ganrantir o loop do registro de vendas 
 		
 		System.out.println("Esses sao todos os clientes cadastrados, por gentileza selecione um deles para cadastrar as vendas" );
 		
 		for(i=0;i<(quantcliente+10);i++) {//listagem dos clientes
 			
 			System.out.println("Nome do cliente " + (i+1) + " : " + cadastroc[i].getNome());
 				
 		}
 		
 		System.out.println("Informe o  numero do cliente selecionado (caso necessário, confirme usando a tecla enter 2 vezes) :");
 		respostac = ler.nextInt();
 		ler.nextLine();//limpar buffer de memória
 		
 		if(respostac<1 || respostac > (quantcliente+10)) {//Garantir que um cliente válido foi selecionado
 		do{
 			
 			System.out.println("O número informado não é válido! Tente novamente :");
 			respostac = ler.nextInt();
 	 		ler.nextLine();//limpar buffer de memória
 			
 		}while(respostac<1 || respostac > (quantcliente+10));
 		
 		}
 		
 		System.out.println("Agora esses são todos os produtos cadastrados");
 		
 		do {
 			
 		for(i=0;i<(quantproduto+10);i++) {//Listagem dos produtos
 			
 			System.out.println("Nome do produto " + (i+1) + " : " + cadastrop[i].getNome());
 			System.out.println("Quantidade em estoque do produto " + (i+1) + " : " + cadastrop[i].getEstoque());
 				
 		}
 		
 		
 		
 		System.out.println("Informe o  numero do produto selecionado  para a venda para o cliente " + cadastroc[respostac-1].getNome()  + " (caso necessário, confirme usando a tecla enter 2 vezes) :");
 		respostap = ler.nextInt();
 		ler.nextLine();//limpar buffer de memória
 		
 		if(respostap<1 || respostap > (quantproduto+10)) {//Garantir que um produto válido foi selecionado
 	 		do{
 	 			
 	 			System.out.println("O número informado não é válido! Tente novamente :");
 	 			respostap = ler.nextInt();
 	 	 		ler.nextLine();//limpar buffer de memória 
 	 			
 	 		}while(respostap<1 || respostap > (quantproduto+10));
 	 		
 	 		}
 		
 		
 		System.out.println("Qual foi a quantidade vendida do produto " + cadastrop[respostap-1].getNome() + " ? (caso necessário, confirme usando a tecla enter 2 vezes) ");
 		quantvendida = ler.nextInt();
 		ler.nextLine();//limpar buffer de memória
 		
 		
 		if(cadastrop[respostap-1].getEstoque()>0 && quantvendida <= cadastrop[respostap-1].getEstoque()) {//Garantir que o estoque reaja as vendas
 			
 			cadastrop[respostap-1].setEstoque((cadastrop[respostap-1].getEstoque())- quantvendida); 
 			
 			System.out.println("Venda realizada com sucesso!");
 			
 		}else {
 			
 			System.out.println("Não há estoque disponível para as quantidade selecionada!");
 			
 		}
 		
 		System.out.println("Você deseja registrar mais vendas(s-sim ou n-não) ? (caso necessário, confirme usando a tecla enter 2 vezes)");
 		escolha = ler.next().charAt(0);
 		ler.nextLine();//limpar buffer de memória
 		
 		}while(escolha !='n');
 		
 	}
 	
 	public static void opcao6(int quantproduto,Produto[] cadastrop,int i){//sexta opção do menu
 		
 	
 		
 		for(i=0;i<(quantproduto+10);i++){//Listagem dos produtos e sua respectiva quantidade em estoque
 			
 			System.out.println("----------------------------------------------");
 			System.out.println("Nome do produto " + (i+1) + " : " + cadastrop[i].getNome());
 			System.out.println("Quantidade em estoque do produto " + (i+1)+ " : " + cadastrop[i].getEstoque());
 			System.out.println("----------------------------------------------");
 			
 		}
 		
 	}
 	
	public static void main(String[] args) {//parte principal
		 
		int opcao,quantcliente,quantproduto,i;
		
		i=0;//contador utilizado para controle em diversas ocasiões do código
		quantproduto=0;//quantidade de clientes customizada pelo usuario,portanto iniciada como 0
		quantcliente=0;//quantidade de clientes customizada pelo usuario,portanto iniciada como 0
		opcao=7;//quantidade de opções do menu
		
		Cliente[] cadastroc = new Cliente[100];//Array para compor quantidade de clientes cadastrados, com a quantidade 100 para garantir margem de quantidade ao usuári
		clientesprecadast(cadastroc);//clientes pré-cadastrados
		Produto[] cadastrop = new Produto[100];//array para compor quantidade de produtos cadastrados, com a quantidade 100 para garantir margem de quantidade ao usuário
		produtosprecadast(cadastrop);//produtos pré-cadastrados
		Scanner ler = new Scanner(System.in);//leitura de dados
		
		System.out.println("Bem vindo ao programa de controle de funcionarios e produtos! \n");
		
		
		do{
			MenuOpcoes();
			opcao = ler.nextInt();
			ler.nextLine();//limpar buffer de memória
			switch (opcao){
	        
			case 1:
				
				System.out.println("Por gentileza, infome quantos clientes serao cadastrados(Tendo em vista que já existem 10 clientes pré-cadastrados): ");
		 		quantcliente = ler.nextInt();
		 		ler.nextLine();//limpar buffer de memória
		 		
				opcao1(quantcliente,cadastroc,ler,i);
	            
		        break;
		        
	        case 2:
	        	
	        	opcao2(quantcliente,cadastroc,ler,i);
	            
		        break;
			
	        case 3:
	        	System.out.println("Por gentileza, infome quantos produtos serao cadastrados(Tendo em vista que já existem 10 produtos pré-cadastrados): ");
		 		quantproduto = ler.nextInt();
		 		ler.nextLine();//limpar buffer de memória
	            
		 		opcao3(quantproduto,cadastrop,ler,i);
		 		
		        break;
			
	        case 4:
	        	
	        	opcao4(quantproduto,cadastrop,ler,i);
	            
		        break;
			
	        case 5:
	        	
	        	opcao5(quantproduto,quantcliente,cadastroc,cadastrop,ler,i);
	            
		        break;
		        
	        case 6:
	        	
	        	opcao6(quantproduto,cadastrop,i);
	            
		        break;
		        
	        case 7:
	        	
	        	System.out.print("Você escolheu sair do programa, espero ter sido util! :) ");
	            
		        break;
		        
	        default:
	        	
	        	System.out.print("Opção inválida! Por gentileza tente novamente. \n\n");
	        	
			}
			
		}while(opcao!=7);//Garantir a saída do programa caso solicitado
		
	}
		
}

