import java.util.Scanner;

public class Corredor {
	  int Energia=100; 
	
	
	
	
	public void verificarEnergia() {
		if(Energia>0 && Energia<=100) {
			         System.out.println("----La energia actual es de "+Energia+"%----");
	                                  }
		
		else {
			Energia=0;
			energiaAgotada();
		      } 
		menu();	
	}
/*--------------------------------------------------------*/	
	public void recargarEnergia() {
		if(Energia<100) {
			   Energia+=15;
			   energiaAgotada();
			            }
	    else {
				Energia=100;
			    energiaAgotada();
		    }
			menu();
		}
/*--------------------------------------------------------*/		
	public  void Correr() {
		if(Energia<=0) {
			energiaAgotada();
			           }
	    else if(Energia>0){
		   Energia-=10;
			}
			menu();
		}
/*--------------------------------------------------------*/		
	public void entrenar() {
		if(Energia<100) {
      		 Energia+=15;
             energiaAgotada();
		                }
		else {
			Energia=100;
		    energiaAgotada();
		     }
		menu();
		}
/*--------------------------------------------------------*/		
	public void energiaAgotada() {
		if(Energia>=100) {
			Energia=100;
		System.out.println("----la energia ya esta al maximo,energia="+Energia+"%----\n");
	                     }
		else if(Energia==0) {
			System.out.println("----la energia ya esta al minimo,energia="+Energia+"%----\n");
		                    }
	}		
/*--------------------------------------------------------*/	
	public void menu() {
		System.out.println("Que desea hacer");
		System.out.println("**************");
		System.out.println("1.Verificar la Energia");
		System.out.println("2.Correr");
		System.out.println("3.Recargar energia");
		System.out.println("4.Entrenar");
		
		System.out.println("DIGITE OPCION:");
		Scanner entrada = new Scanner(System.in);
		int opcion=entrada.nextInt();
		switch (opcion) {
		case 1:verificarEnergia();break;
		case 2:Correr();break;
		case 3:recargarEnergia();break;
		case 4:entrenar();break;
		
		}
		
	}
/*----------------------------------------------------------*/	
	public static void main(String[] args) {
		Corredor corredor1=new Corredor();
		
		// TODO Auto-generated method stub
		
		corredor1.menu();
		}
	}
	
	


