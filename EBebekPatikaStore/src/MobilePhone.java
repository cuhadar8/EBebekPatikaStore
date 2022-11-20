import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MobilePhone extends Product{
	
	private int camera;
	private double battery;
	private String colour;
	
	private TreeMap<Integer, MobilePhone> phoneList = new TreeMap<Integer, MobilePhone>();  //Objelerimizi key sırasına göre ekrana yazdırmak
	Scanner scanner = new Scanner(System.in);                                               //istediğim için TreeMap kullandım.
	
	public MobilePhone() {
		
	}
	
	public MobilePhone(String name, String unitPrice, int discount, int stock, String brand, int ram, int memory,
			double screenSize, int camera, double battery, String colour) {
		super(name, unitPrice, discount, stock, brand, ram, memory, screenSize);
		// TODO Auto-generated constructor stub
		this.camera = camera;
		this.battery = battery;
		this.colour = colour;
	}
	

	public int getCamera() {
		return camera;
	}


	public void setCamera(int camera) {
		this.camera = camera;
	}


	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public TreeMap<Integer, MobilePhone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(TreeMap<Integer, MobilePhone> phoneList) {
		this.phoneList = phoneList;
	}
	
	public void inMemoryPhoneList() {   //Database kullanmadığımız için, bu methodla listemize objelerimizi gönderdim.
		this.getPhoneList().put(1, new MobilePhone("SAMSUNG GALAXY A51", "3199.0 TL", 0, 500, "Samsung", 6, 128, 6.5, 32, 4000.0,"Siyah"));
		this.getPhoneList().put(2, new MobilePhone("iPhone 11 64 GB", "7379.0 TL", 0, 100, "Apple", 6, 64, 6.1, 5, 3046.0, "Mavi"));
		this.getPhoneList().put(3, new MobilePhone("Redmi Note 10 Pro 8GB", "4012.0 TL", 0, 130, "Xiaomi", 12, 128, 6.5, 35, 4000.0, "Beyaz"));
	}
	
	public void printPhoneList() {
		System.out.println("Cep Telefonu Listesi");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		
		for(Map.Entry<Integer, MobilePhone> entry : phoneList.entrySet()) {  //Map'i doğrudan yazdıramadığımız için, entrySet
			int k = entry.getKey();                                           //methoduyla map'i set'e çeviriyoruz. Key ve value değerlerini ayrı ayrı alıyoruz.
			MobilePhone v = entry.getValue();
			System.out.printf("|%2d  | %-30s| %-10s| %-10s| %-10d| %-10.1f| %-10d| %-10.1f| %-10d| %-10s|\n",k,v.getName(),v.getUnitPrice(),v.getBrand(),v.getMemory(),v.getScreenSize(),v.getCamera(),v.getBattery(),v.getRam(),v.getColour());
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

	}
	
	public void addPhone() {
		System.out.print("Cep telefonu marka ve modeli: ");
		String newName = scanner.nextLine();
		
		System.out.print("Cep telefonu fiyatı: ");
		String newUnitPrice = scanner.nextLine();
		
		System.out.print("Cep telefonu markası: ");
		String newBrand = scanner.nextLine();
		
		System.out.print("Cep telefonu hafızası(GB): ");
		int newMemory = scanner.nextInt();
		
		System.out.print("Cep telefonu ekran boyutu(inç): ");
		double newScreenSize = scanner.nextDouble();
		
		System.out.print("Cep telefonu kamera çözünürlüğü(MP): ");
		int newCamera = scanner.nextInt();
		
		System.out.print("Cep telefonu pil kapasitesi(mAh): ");
		double newBattery = scanner.nextDouble();
		
		System.out.print("Cep telefonu ram'i(GB): ");
		int newRam = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Cep telefonu rengi: ");
		String newColour = scanner.nextLine();
		
		System.out.print("Cep telefonu stok miktarı: ");
		int newStock = scanner.nextInt();
		
		System.out.print("Cep telefonu indirimi: ");
		int newDiscount = scanner.nextInt();
		
		this.getPhoneList().put(this.getPhoneList().lastKey()+1, new MobilePhone(newName, newUnitPrice, newDiscount, newStock, newBrand, newRam, newMemory, newScreenSize, newCamera, newBattery, newColour));
		System.out.println("Cep telefonu listeye başarıyla eklendi.");
	}
	
	public void deletePhone() {
		for(Map.Entry<Integer, MobilePhone> entry : this.getPhoneList().entrySet()) {
			int k = entry.getKey();             //Kullanıcı hangi ürünü silmek istediğini ekrandan seçebilsin diye, key ve value
			MobilePhone v = entry.getValue();	//değerlerini ayrı ayrı alıp, ID ve Ürün isimlerini kullanıcıya gösteriyoruz
			System.out.println("ID: " + k + " " + v.getName());
		}
		
		System.out.println("Listeden silmek istediğiniz ürün ID'sini giriniz: ");
		int selectedId = scanner.nextInt();
		
		if(this.getPhoneList().containsKey(selectedId)) {     //Eğer kullanıcının seçmiş olduğu ID listede bulunuyorsa 
			this.getPhoneList().remove(selectedId);				//Ürünü listeden kaldırıyoruz
			System.out.println("Cep telefonu listeden başarıyla kaldırıldı.");
			
		}else {
			System.out.println("Bu ID'ye kayıtlı cep telefonu bulunamadı.");
		}
		
	}
	
	public void phoneOperations() {
		
		String operations ="Lütfen yapmak istediğiniz cep telefonu işlemini seçiniz\n"
							+"1. Cep telefonu listesini görüntüle\n"
							+"2. Cep telefonu ekle\n"
							+"3. Cep telefonu sil\n"
							+"4. Ana menüye dön";
		System.out.println(operations);
		int selection = scanner.nextInt();
		scanner.nextLine();
		
		switch(selection) {
		case 1:
			this.printPhoneList();
			this.phoneOperations();
			break;
			
		case 2:
			this.addPhone();
			this.phoneOperations();
			break;
			
		case 3:
			this.deletePhone();
			this.phoneOperations();
			break;
			
		case 4:
			PatikaStore store = new PatikaStore();
			store.storeOperations();
			break;
		}
	}
}
