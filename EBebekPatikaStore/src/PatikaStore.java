import java.util.Scanner;

public class PatikaStore {
	Scanner scanner = new Scanner(System.in);
	
	public void storeOperations() {
		
		String operations = "PatikaStore Ürün Yönetim Paneli !\n"
							+"1. Notebook İşlemleri\n"
							+"2. Cep Telefonu İşlemleri\n"
							+"3. Markaları Listele\n"
							+"0. Çıkış Yap";
		System.out.println(operations);
		
		System.out.print("Tercihiniz : ");
		int selection = scanner.nextInt();
		scanner.nextLine();
		
		switch(selection) {
		case 1:
			Notebook notebook = new Notebook();
			notebook.inMemoryNotebookList();        //Var olan ürünlerimizi bu methodla sistemimize ekliyoruz.
			notebook.notebookOperations();
			break;
		
		case 2:
			MobilePhone phone = new MobilePhone();
			phone.inMemoryPhoneList();            //Var olan ürünlerimizi bu methodla sistemimize ekliyoruz.
			phone.phoneOperations();
			break;
		
		case 3:
			Brand brand = new Brand();
			brand.inMemoryBrands();
			brand.getBrandsAlphabetic();
			storeOperations();
			break;
		
		case 0:
			System.out.println("PatikaStore Ürün Yönetim Paneli Sonlandırıldı.");
			break;
		
		default:
			System.out.println("Hatalı seçim yaptınız. Yönetim paneline yönlendiliyorsunuz.");
			storeOperations();
			break;
		}
	}
}
