package io.altar.jseproject.control;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import io.altar.jseproject.model.Product;
import io.altar.jseproject.repositories.EntityRepository;
import io.altar.jseproject.repositories.ProductRepository;


@RequestScoped
public class controlProduct {
	
	 EntityRepository<Product> DbProduct = ProductRepository.getInstance();
	
	public  void createProduct(Product p){
		

		DbProduct.addEntity(p);		
	}


	public  Collection<Product> getProducts(){
		
		return DbProduct.getEntity();
	}
	
	public  void editProduct(Product p){
		

		DbProduct.editEntity(p);
			
	}
	
	public  void removeProduct(Product p){
		
		DbProduct.removeEntity(p);
	}



//	public static void removeProduct(){
//		long l;
//		System.out.println("Escolha o produto que deseja remover:");
//		l = Check.checkLong();
//		ProductRepository.getInstance().removeEntity(l);		
//	}
//
//
//	public static void editProduct(){
//		String choice;
//		Long l;
//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Escolha o produto que deseja editar:");
//		l = Check.checkLong();
//
//		if((Product) ProductRepository.getInstance().getEntity(l)!= null){
//			Product p =  (Product) ProductRepository.getInstance().getEntity(l);
//
//			System.out.println("Insira o nova lista de prateleiras onde esta exposto:");
//			choice = input.nextLine();
//
//			if (!choice.equals("")){
//				p.getList().clear();
//				//p.getList().add((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)));
//
//				while(true) {
//					//System.out.println((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)));
//					if((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)) != null){
//						p.getList().add((Shelf) ShelfRepository.getInstance().getEntity(Check.checkInt(choice)));
//						if(ShelfRepository.getInstance().getEntity(l)!=null){
//							((Shelf) ShelfRepository.getInstance().getEntity(l)).setProductAlb(p);
//						}
//					}
//					else{
//						System.out.println("prateleira nao existente");
//					}
//					do{
//						System.out.println("deseja adicionar o produto a outra prateleira s/n");			
//						choice = input.nextLine();
//					}while(!((choice.equals("n"))||choice.equals("s")));
//
//					if (choice.equals("n")){
//						break;
//					}
//					else if(choice.equals("s")){
//						System.out.println("Insira a proxima prateleira onde o produto esta exposto:");
//						choice = input.nextLine();
//					}
//				}				
//			}
//			System.out.println("Insira o novo Valor unitario de desconto: ");
//			choice = input.nextLine();
//			if (!choice.equals("")){
//				p.setVUD(Check.checkInt(choice));
//			}
//			System.out.println("Insira o novo IVA: ");
//			choice = input.nextLine();
//			if (!choice.equals("")){
//				p.setIVA(Check.checkInt(choice));		
//			}
//			System.out.println("Insira o novo PVP ");
//			choice = input.nextLine();
//			if (!choice.equals("") ){
//				p.setPVP(Check.checkInt(choice));
//			}
//			//			if(p.getList() != null){
//			//				p.getList().setProductAlb(p);
//			//			}
//
//			ProductRepository.getInstance().editEntity(p);
//		}
//		else{
//			System.out.println("Produto nao existente.");
//			System.out.println();
//		}
//	}

}
