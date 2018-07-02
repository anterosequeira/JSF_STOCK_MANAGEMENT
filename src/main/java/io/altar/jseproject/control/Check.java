package io.altar.jseproject.control;

import java.util.Scanner;

public  class Check {

	public static Integer checkInt(){
		String choice;
		Scanner input = new Scanner(System.in);

		while (true){
			try{				
				choice = input.nextLine();
				int G =Integer.parseInt(choice);
				if(G>=0){
					return G;
				}
				else{
					System.out.println("numero invalido, insira um numero");
				}
			}
			catch(Exception e){
				System.out.println("numero invalido, insira um numero");
			}
		}		
	}

	
	public static Integer checkInt(String s){
		Scanner input = new Scanner(System.in);

		while (true){
			try{								
				int G =Integer.parseInt(s);
				if(G>=0){
					return G;
				}
				else{
					System.out.println("numero invalido, insira um numero");
					s = input.nextLine();
				}
			}
			catch(Exception e){
				System.out.println("numero invalido, insira um numero");
				s = input.nextLine();
			}
		}
	}

	
	public static Long checkLong(){
		String choice;
		Scanner input = new Scanner(System.in);
		
		while (true){
			try{
				choice = input.nextLine();
				long G =Integer.parseInt(choice);
				if(G>=0){
					return G;
				}
				else{
					System.out.println("numero invalido, insira um numero");
				}
			}
			catch(Exception e){
				System.out.println("numero invalido, insira um numero");
			}
		}
	}

	
	public static Long checkLong(String s){
		Scanner input = new Scanner(System.in);
		
		while (true){
			try{
				long G =Integer.parseInt(s);
				if(G>=0){
					return G;
				}
				else{
					System.out.println("numero invalido, insira um numero");
					s = input.nextLine();
				}
			}
			catch(Exception e){
				System.out.println("numero invalido, insira um numero");
				s = input.nextLine();
			}
		}
	}

	
	public static Float checkFloat(){
		String choice;
		Scanner input = new Scanner(System.in);
		
		while (true){
			try{
				choice = input.nextLine();
				float G =Integer.parseInt(choice);
				if(G>=0){
					return G;
				}
				else{
					System.out.println("numero invalido, insira um numero");
				}
			}
			catch(Exception e){
				System.out.println("numero invalido, insira um numero");
			}
		}
	}

	
	public static Float checkFloat(String s){
		Scanner input = new Scanner(System.in);
		
		while (true){
			try{			
				float G =Integer.parseInt(s);
				if(G>=0){
					return G;
				}
				else{
					System.out.println("numero invalido, insira um numero");
					s = input.nextLine();
				}
			}
			catch(Exception e){
				System.out.println("numero invalido, insira um numero");
				s = input.nextLine();
			}
		}
	}	
}







