import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// al momento de escribir se guardan en las siguientes variables
		//declarar variables
		//Librerias 
		Scanner lectura = null;
		
		String marca,so;
		float precio;
		int stock, menuPrinc, subMenu,indice;
		Computadoras computadora = null;
		
		List<Computadoras> listaComps = new ArrayList<Computadoras>();
		
		
		//realizar el crud basico
		
		do {
			
			System.out.println("Menu principal");
			System.out.println("1---Alta");
			System.out.println("2---Mostrar");
			System.out.println("3---Buscar");
			System.out.println("4---Editar");
			System.out.println("5--Eliminar");
			System.out.println("6---Buscar por marca");
			System.out.println("7---Buscar por so");
			System.out.println("8---calcular dinero invertido");
			System.out.println("9---eliminar buscando marca");
			System.out.println("10---Salir");
			// se lee el numero que escrbio el usuario en el teclado
			
			
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();
			//permite la lectura de lo ingresado y lo convierte a un numero entero
			switch(menuPrinc) {
		    case 1:
		        // Alta
		    	try {
		    		System.out.println("ingrese la marca");
		    		lectura = new Scanner(System.in);
		    		marca=lectura.nextLine();
		    		
		    		
		    		System.out.println("ingrese el precio");
		    		lectura = new Scanner(System.in);
		    		precio=lectura.nextFloat();
		    		
		    		
		    		
		    		System.out.println("ingrese el stock");
		    		lectura = new Scanner(System.in);
		    		stock=lectura.nextInt();

		    		
		    		System.out.println("ingresa el sistema operativo");
		    		lectura = new Scanner(System.in);
		    		so=lectura.nextLine();
		    		
		    		
		    		
///permite obtener un objeto con los datos ingresados
		    		
		    		//crear el objeto
		    	
		    		computadora = new Computadoras (marca,precio,stock,so);
		    		
		    		//agregar a lista
		    		
		    		listaComps.add(computadora);
		    		System.out.println("se guardo con exito");
               
		    		
		    		
		    		
		    	} catch (Exception e) {
		    		
		    		System.out.println("error al guardar"+e.getCause());
		    		
		    	}
		    	
		        break;
		        
		    case 2:
		       System.out.println(listaComps);
		       
		        break;
		        
		        
		    case 3:
		        try {
		        	System.out.println("ingrese el indice al registro a buscar");
		        	lectura=new Scanner(System.in);
		        	indice= lectura.nextInt();
		        	
		        	//buscar
		        	computadora = listaComps.get(indice);
		        	System.out.println("se encontro el registro"+computadora);
		        	
		        }catch (Exception e) {
		        	System.out.println("Error al buscar el registro");
		        	
		        }
		        break;
		        
		        
		    case 4:
		    	try {
		    		System.out.println("ingresa el indice del registro a editar");
		    		lectura=new Scanner(System.in);
		    		indice=lectura.nextInt();
		    		
		    		//buscar
		    		
		    	computadora = listaComps.get(indice);
		 System.out.println("se encontro la computadora a editar"+computadora.getMarca());
		    		
		        	do {
		        		System.out.println("submenu para editar");
		        		System.out.println("1---Marca");
		        		System.out.println("2---Precio");
		        		System.out.println("3---Regresar");
		        		
		        		
		        		lectura = new Scanner(System.in);
		        		subMenu = lectura.nextInt();
		        		
		        		
		        		
		        		switch(subMenu) {
		        		
		        		case 1:
		        	System.out.print("ingresa la nueva marca");
		        	lectura = new Scanner(System.in);
		        	marca = lectura.nextLine();
		        			
		        			
		        	//actualizar
		        	 computadora.setMarca(marca);
		        		System.out.println("se edito");
		        			
		        			break;
		        			
		        	case 2:
		        		System.out.print("ingresa la nuevo precio");
		        		  lectura = new Scanner(System.in);
		        			precio = lectura.nextFloat();
		        			
		        			//actualizar
		        			computadora.setPrecio(precio);
		        			System.out.println("se edito");
		        			break;
		        		
		        		
		      }
		        		
		        }while(subMenu<3);
		        	
		        	
		  
		    	}catch (Exception e) {
		    		System.out.println("no existe el registro a editar");
		    	
		    		}
		    	
		    // Editar
		        break;
		    case 5:
		    	try {
		    		System.out.println("ingresa el indice del registro a borrar");
		    		lectura=new Scanner(System.in);
		    		indice=lectura.nextInt();
		    		
		    		//Eliminar
		    		
		    		listaComps.remove(indice);
		    		System.out.println("se elimino");
		    	} catch (Exception e) {
		    		
		    		System.out.println("no existe  ese registro");
		    		
		    	}
		    	
		  break;
		  
		    case 6:
		    //algoritmo 
		    	
		    	//1.pedir sitema operativo
		    	//2recorrer los registros de la lista -- ciclos
		    	//buscar la condicional
		    	//mensaje cuando 
		    boolean bandera = false;
		    	
		    	
		            System.out.println("Ingresa la marca a  buscar");
		            lectura = new Scanner(System.in);
		            marca = lectura.nextLine();
		            
		            for(int i = 0; i< listaComps.size(); i++) {
		            	if(listaComps.get(i).getMarca().equals(marca)) {
		            		
		            		System.out.println(listaComps.get(i));
		            		bandera = true;
		            		break;
		            	}
		            }
		            
		            if(bandera == false)
		            	System.out.println("No existe");
		             break;
		            
		            case 7:
		            	
		            	boolean bandera2 = false;
				    	
				    	
			            System.out.println("Ingresa el sistema operativo a  buscar");
			            lectura = new Scanner(System.in);
			            so = lectura.nextLine();
			            
			            for(int i = 0; i< listaComps.size(); i++) {
			            	if(listaComps.get(i).getSo().equals(so)) {
			            		
			            		System.out.println(listaComps.get(i));
			            		bandera2 = true;
			            		break;
			            	}
			            }
			            
			            if(bandera2 == false)
			            	System.out.println("No existe el sistema operativo");
			             break;
		            
		            case 8:
		            	try {
		            		float SumTotal=0;
		            		System.out.println("vamos a calcular el total de la inversion");
		            		for(Computadoras comp:listaComps) {
		            			float sum=comp.getStock() * comp.getPrecio();
		            			System.out.println("se invirtio en"+comp.getMarca()+"$"+sum);
		            		SumTotal+=sum;
		            		}
		            		System.out.println("invertiste en total : $ +SumTotal");
		            		break;
		            	}catch(Exception e) {
		            		System.out.println("tienes un error"+e.getCause());
		            		}
		            break;
		            case 9:
		            	boolean bandera3 = false;
		            	System.out.println("escribe la marca que quieres eliminar");
		            	lectura = new Scanner(System.in);
		            	marca = lectura.nextLine();
		            	
		            	for(int i = 0; i<listaComps.size(); i++) {
		            		if(listaComps.get(i).getMarca().equals(marca)) {
		            			listaComps.remove(i);
		            			listaComps.remove(listaComps.get(i));
		            			bandera3=true;
		            			break;  //para la interacion
		            		}
		            	}
		            	if(bandera3 == false)
		            		System.out.println("no existe");
		            	break;
		            	
		            case 10:
		            	break;
		            	default:
		            		System.out.println("opcion invalida");
		
	
 }
				
				
			
		}while (menuPrinc <10);

	}

}













