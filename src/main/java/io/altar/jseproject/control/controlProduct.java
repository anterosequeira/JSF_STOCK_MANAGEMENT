package io.altar.jseproject.control;

import java.util.Scanner;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import io.altar.jseproject.repositories.ProductRepository;
import io.altar.jseproject.repositories.ShelfRepository;
import io.altar.jseproject.control.Check;

public class controlProduct {
	
	public static void createProduct(){
		int i;
		long l;
		String choice;
		Scanner input = new Scanner(System.in);
//
		System.out.println("Novo produto");
		Product p = new Product();

		do {
			System.out.println("o produto encontra se exposto em alguma prateleira? s/n:");
			choice = input.nextLine();

		}while(!((choice.equals("n"))||choice.equals("s")));

		if (choice.equals("s")) {
			System.out.println("Insira as prateleiras onde esta exposto:");
			while(true){

				l= Check.checkLong();
				if((Shelf) ShelfRepository.getInstance().getEntity(l) != null){
					p.getList().add((Shelf) ShelfRepository.getInstance().getEntity(l));
					if(ShelfRepository.getInstance().getEntity(l)!=null){
						((Shelf) ShelfRepository.getInstance().getEntity(l)).setProductAlb(p);
					}
				}
				else{
					System.out.println("prateleira nao existente");
				}
				do{
					System.out.println("deseja adicionar o produto a outra prateleira s/n");			
					choice = input.nextLine();
				}while(!((choice.equals("n"))||choice.equals("s")));

				if (choice.equals("n")){
					break;
				}
				else if(choice.equals("s")){
					System.out.println("Insira a proxima prateleira onde o produto esta exposto:");
				}

			}
		}
		//p.setList((Shelf) ShelfRepository.getInstance().getEntity(l));

		
		System.out.println("Insira o Valor unitario de desconto: ");
		i = Check.checkInt();
		p.setVUD(i);

		System.out.println("Insira o IVA: ");
		i = Check.checkInt();
		p.setIVA(i);

		System.out.println("Insira o PVP ");
		i = Check.checkInt();
		p.setPVP(i);

//		if(p.getList() != null){
//			p.getList().setProductAlb(p);
//		}

		ProductRepository.getInstance().addEntity(p);
		System.out.println();		
	}


	public static void checkProduct(){
		long l;
		System.out.println("Escolha o produto que deseja consultar:");
		l = Check.checkLong();
		System.out.println(ProductRepository.getInstance().getEntity(l));
		System.out.println();		
	}


	public static void removeProduct(){
		long l;
		System.out.println("Escolha o produto que deseja remover:");
		l = Check.checkLong();
		ProductRepository.getInstance().removeEntity(l);		
	}


	public static void editProduct(){
		String choice;
		Long l;
		Scanner input = new Scanner(System.in);

		System.out.println("Escolha o produto que deseja editar:");
		l = Check.checkLong();

		if((Product) ProductRepository.getInstance().getEntity(l)!= null){
			Product p =  (Product) ProductRepository.getInstance().getEntity(l);

			System.out.println("Insira o nova lista de prateleiras onde esta exposto:");
			choice = input.nextLine();

			if (!choice.equals("")){
				p.getList().clear();
				//p.getList().add((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)));

				while(true) {
					//System.out.println((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)));
					if((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)) != null){
					p.getList().add((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)));
					if(ShelfRepository.getInstance().getEntity(l)!=null){
						((Shelf) ShelfRepository.getInstance().getEntity(l)).setProductAlb(p);
					}
					}
					else{
						System.out.println("prateleira nao existente");
					}
					do{
						System.out.println("deseja adicionar o produto a outra prateleira s/n");			
						choice = input.nextLine();
					}while(!((choice.equals("n"))||choice.equals("s")));

					if (choice.equals("n")){
						break;
					}
					else if(choice.equals("s")){
						System.out.println("Insira a proxima prateleira onde o produto esta exposto:");
						choice = input.nextLine();
					}
				}				
			}
			System.out.println("Insira o novo Valor unitario de desconto: ");
			choice = input.nextLine();
			if (!choice.equals("")){
				p.setVUD(Check.checkInt(choice));
			}
			System.out.println("Insira o novo IVA: ");
			choice = input.nextLine();
			if (!choice.equals("")){
				p.setIVA(Check.checkInt(choice));		
			}
			System.out.println("Insira o novo PVP ");
			choice = input.nextLine();
			if (!choice.equals("") ){
				p.setPVP(Check.checkInt(choice));
			}
//			if(p.getList() != null){
//				p.getList().setProductAlb(p);
//			}

			ProductRepository.getInstance().editEntity(p);
		}
		else{
			System.out.println("Produto nao existente.");
			System.out.println();
		}
	}

}
