import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Notebook extends Product {
	
	private TreeMap<Integer, Notebook> notebookList = new TreeMap<Integer, Notebook>();  //Objelerimizi key sırasına göre ekrana yazdırmak
	Scanner scanner = new Scanner(System.in);                                            //istediğim için TreeMap kullandım.
	
	public Notebook() {
		
	}
	
	public Notebook(String name, String unitPrice, int discount, int stock, String brand, int ram, int memory,
			double screenSize) {
		super(name, unitPrice, discount, stock, brand, ram, memory, screenSize);
		// TODO Auto-generated constructor stub
	}

	public TreeMap<Integer, Notebook> getNotebookList() {
		return notebookList;
	}

	public void setNotebookList(TreeMap<Integer, Notebook> notebookList) {
		this.notebookList = notebookList;
	}
	
	public void inMemoryNotebookList() {  //Database kullanmadığımız için, bu methodla listemize objelerimizi gönderdim.
		this.getNotebookList().put(1, new Notebook("HUAWEI Matebook 14", "7000.0 TL", 10, 50, "HUAWEI", 16, 512, 14.0));
		this.getNotebookList().put(2, new Notebook("Lenovo V14 IGL", "3699.0 TL", 10, 150, "Lenovo", 8, 1024, 14.0));
		this.getNotebookList().put(3, new Notebook("ASUS Tuf Gamin", "8199.0 TL", 10, 30, "ASUS", 32, 2048, 15.6));
	}
	
	public void printNotebooks() {
		System.out.println("Notebook Listesi");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(Map.Entry<Integer, Notebook> entry : this.getNotebookList().entrySet()) {  //Map'i doğrudan yazdıramadığımız için, entrySet
			int k = entry.getKey();                                                    //methoduyla map'i set'e çeviriyoruz. Key ve value değerlerini ayrı ayrı alıyoruz.
			Notebook v = entry.getValue();
			System.out.printf("|%2d  | %-30s| %-10s| %-10s| %-10d| %-10.1f| %-12d|\n",k,v.getName(),v.getUnitPrice(),v.getBrand(),v.getMemory(),v.getScreenSize(),v.getRam());
		}
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		
	}
	
	public void addNotebook() {
		System.out.print("Notebook marka ve modeli: ");
		String neWname = scanner.nextLine();
		
		System.out.print("Notebook fiyatı: ");
		String newUnitPrice = scanner.nextLine();
		
		System.out.print("Notebook markası: ");
		String newBrand = scanner.nextLine();
		
		System.out.print("Notebook hafızası(GB): ");
		int newMemory = scanner.nextInt();
		
		System.out.print("Notebook ekran boyutu(inç): ");
		double newScreenSize = scanner.nextDouble();
		
		System.out.print("Notebook ram'i(GB): ");
		int newRam = scanner.nextInt();
		
		System.out.print("Notebook stok miktarı: ");
		int newStock = scanner.nextInt();
		
		System.out.print("Notebook indirimi: ");
		int newDiscount = scanner.nextInt();
		
		this.getNotebookList().put(this.getNotebookList().lastKey()+1, new Notebook(neWname, newUnitPrice, newDiscount, newStock, newBrand, newRam, newMemory, newScreenSize));
		System.out.println("Notebook listeye başarıyla eklendi.");
	}
	
	public void deleteNotebook() {
		
		for(Map.Entry<Integer, Notebook> entry : this.getNotebookList().entrySet()) {
			int k = entry.getKey();                      //Eğer kullanıcının seçmiş olduğu ID listede bulunuyorsa 
			Notebook v = entry.getValue();				//Ürünü listeden kaldırıyoruz
			System.out.println("ID: " + k + " " + v.getName());
		}
		
		System.out.print("Listeden silmek istediğiniz ürün ID'sini giriniz: ");
		int selectedId = scanner.nextInt();
		
		if(this.getNotebookList().containsKey(selectedId)) {
			this.getNotebookList().remove(selectedId);
			System.out.println("Notebook listeden başarıyla kaldırıldı.");
			
		}else {
			System.out.println("Bu ID'ye kayıtlı notebook bulunamadı.");
		}
	}
	
	public void notebookOperations() {
		
		String operations = "Lütfen yapmak istediğiniz notebook işlemini seçiniz\n"
							+"1. Notebook listesini görüntüle\n"
							+"2. Notebook ekle\n"
							+"3. Notebook sil\n"
							+"4. Ana menüye dön";
		System.out.println(operations);
		int selection = scanner.nextInt();
		scanner.nextLine();
		
		switch(selection) {
		case 1:
			this.printNotebooks();
			this.notebookOperations();
			break;
		
		case 2:
			this.addNotebook();
			this.notebookOperations();
			break;
			
		case 3:
			this.deleteNotebook();
			this.notebookOperations();
			break;
		case 4:
			PatikaStore store = new PatikaStore();
			store.storeOperations();
			break;
		}
	}
}
