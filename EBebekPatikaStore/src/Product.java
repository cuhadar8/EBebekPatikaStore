
public abstract class Product {
	
	private String name;           //Notebook ve telefona ait ortak özellikleri ve getter setter metotlarını abstract sınıfta tanımladım.
	private String unitPrice;
	private int discount;
	private int stock;
	private String brand;
	private int ram;
	private int memory;	
	private double screenSize;
	
	public Product() {     //Parametresiz bu yapıcı bloğu diğer sınıflarda nesne oluşturmak için tanımladım.
	}
	
	public Product(String name, String unitPrice, int discount, int stock, String brand, int ram, int memory,
			double screenSize) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.stock = stock;
		this.brand = brand;
		this.ram = ram;
		this.memory = memory;
		this.screenSize = screenSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
}
