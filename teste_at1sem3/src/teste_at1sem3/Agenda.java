package teste_at1sem3;
// Samuel Soares e Caua Luca 
import java.util.Iterator;
import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		Contato contato = new Contato();
		Scanner scan = new Scanner(System.in);	
		String opcao;
		String continuar = " "; //" " para poder usar o .equals
		int i = 0;
		int n = 1;
		
			System.out.println("\t\t_-*Agenda*-_\n");
				
					do{
						System.out.println("Escolha uma opção: Incluir - Listar - Excluir - Sair");
						opcao = scan.next();
						
				switch (opcao) {
					case "Incluir":
							
								do {
								
								System.out.print("Novo contato \nNome:\n");
								contato.Nome.add(scan.next());
								
								System.out.println("Telefone:");
								contato.Telefone.add(scan.next());
								
								System.out.println("Gmail:");
								contato.Email.add(scan.next());
								
								System.out.println("Deseja continuar a adicionar? se sim digite (sim)");
								continuar = scan.next();
								
								n++;
								} while (continuar.equals("sim"));
							
						break;
							
					case "Listar":
					
					Iterator<String> iterator = contato.Nome.iterator();
					Iterator<String> iterator2 = contato.Telefone.iterator();
					Iterator<String> iterator3 = contato.Email.iterator();
					
						while (iterator.hasNext()) {
						System.out.println(i+1+" Nome:" + iterator.next()+ "\t" + "Telefone:" +
						iterator2.next() + "\t " +"Email:"+ iterator3.next());
					     i++;
					    }
						
						break;
							
					case "Excluir":
						
						
						 System.out.printf("Informe *Numero a esquerda* do contato que deseja excluir:");
						    i = scan.nextInt()-1;

						    try {
						      // [ D ] remove o i-simo contato da agenda
						      contato.Nome.remove(i);
						      contato.Telefone.remove(i);
						      contato.Email.remove(i);
						    } catch (IndexOutOfBoundsException e) {
						        // exceo lanada para indicar que um ndice (i)
						        // fora do intervalo valido (de 0 ate agenda.size()-1)
						        System.out.printf("\nErro: Posição invalida (%s).\n",
						          e.getMessage());
						    }
						
							
						break;
							
					case "Sair":
							
							System.out.println("Agenda fechada");
						return;

					default:
							//invalidar opção
							System.out.println("Opção invalida");
						break;
						}
					}while(!opcao.equals("Sair"));
					
	}
}

