package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservas;
import model.exceptions.DomainException;

public class ProgramaPrincipal {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		    try {
			
				System.out.print("Numero do quarto: ");
				
				int numeroQuarto = sc.nextInt();
				
				System.out.print("Data de chegada (dd/MM/yyyy): ");
				
				Date chegada = sdf.parse(sc.next());
				
				System.out.print("Data de saida (dd/MM/yyyy): ");
				
				Date saida = sdf.parse(sc.next());
				
				Reservas reservas = new Reservas(numeroQuarto, chegada, saida);
				System.out.println("Reserva: " + reservas);
				
				System.out.println();
				System.out.println("Entre com os dados para atualizar a reserva: ");
				
		        System.out.print("Data de chegada (dd/MM/yyyy): ");
				
				chegada = sdf.parse(sc.next());
				
				System.out.print("Data de saida (dd/MM/yyyy): ");
				
				saida = sdf.parse(sc.next());
					
			    reservas.atualizarDatas(chegada, saida);
			    
			    System.out.println("Reserva: " + reservas);
		   }
		    
		    catch (ParseException e) {
		    	
		    	System.out.println("Formato de data inválido! ");
		    }
		    
		    catch (DomainException e ) {
		    	
		    System.out.println(e.getMessage());
		    }
		    
		    catch (RuntimeException e) {
		    	
		    	System.out.println("Erro inesperado! ");
		    }
		    
			sc.close();
		
	}

}
