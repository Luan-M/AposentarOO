package application;

import java.util.Scanner;

import user.Usuario;

public class Program {

	public final Integer ANO_ATUAL = 2023;
	
	public static final Integer IDADE_MINIMA_HOMEM = 65;
	public static final Integer TEMPO_MINIMO_HOMEM = 26;
	
	public static final Integer IDADE_MINIMA_MULHER = 63;
	public static final Integer TEMPO_MINIMO_MULHER = 24; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Usuario usuario = new Usuario();
		
		System.out.print("1 - Começar o software | 2 - Informação para se aposentar: ");
		Integer menuInicial = sc.nextInt();
		
		System.out.println();
		
		if(menuInicial.equals(1)) {
			
			System.out.print("Digite o seu nome: ");
			usuario.nome = sc.next();
			
			System.out.print("Digite o ano que você nasceu: ");
			usuario.dataNascimento = sc.nextInt();
			
			System.out.println("Qual o seu sexo?");
			System.out.print("1 - Masculino | 2 - Feminino: ");
			Integer menuSexo = sc.nextInt();
			
			System.out.print("Digite o tempo de registro na carteira: ");
			usuario.tempoRegistro = sc.nextInt();
			
			System.out.println();
			
			if(menuSexo.equals(1)) {
				if(usuario.homemAposentar()) {
					System.out.println(usuario.homemPodeAposentar());
				} else {
					System.out.println(usuario.homemNaoPodeAposentar());
				}
				
			} else if(menuSexo.equals(2)) {
				if(usuario.mulherAposentar()) {
					System.out.println(usuario.mulherPodeAposentar());
					
				} else {
					System.out.println(usuario.mulherNaoPodeAposentar());
					
				}
			} else {
				System.out.println("Você só pode escolher 1 para masculino ou 2 para feminino.");
				
			}
			
		} else if(menuInicial.equals(2)) {
			System.out.println(usuario.informacaoHomem());
			System.out.println(usuario.informacaoMulher());
			
		} else {
			System.out.println("Você só pode escolher 1 para iniciar o software ou 2 para saber as informações para se aposentar.");
		}
		
		sc.close();
	}
}
