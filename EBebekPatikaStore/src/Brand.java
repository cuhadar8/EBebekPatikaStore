import java.util.ArrayList;
import java.util.Comparator;

public class Brand {
	
	private int id;
	private String name;
	private ArrayList<Brand> brandList = new ArrayList<>();
	
	public Brand() {   //Bu parametresiz yapıcı metodu, diğer sınıflarda nesne oluştururken görsel açıdan daha iyi olması için ekledim.
	}
	
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Brand> getBrandList() {
		return brandList;
	}


	public void setBrandList(ArrayList<Brand> brandList) {
		this.brandList = brandList;
	}
	
	public void inMemoryBrands() {   //Markaları bizden istendiği sırayla Arraylist'e ekliyoruz
		
		brandList.add(new Brand(1, "Samsung"));
		brandList.add(new Brand(2, "Lenovo"));
		brandList.add(new Brand(3, "Apple"));
		brandList.add(new Brand(4, "Huawei"));
		brandList.add(new Brand(5, "Casper"));
		brandList.add(new Brand(6, "Asus"));
		brandList.add(new Brand(7, "HP"));
		brandList.add(new Brand(8, "Xiaomi"));
		brandList.add(new Brand(9, "Monster"));

	}
	
	public void getBrandsAlphabetic() {    //Markaları bizden istendiği gibi alfabetik olarak burada yazdırıyoruz.
		
		this.getBrandList().sort(new Comparator<Brand>() {    //Alfabetik olarak sıralama yapmak için Comparator interface'inden anonim
			@Override										//obje oluşturuyoruz ve compare methodunu implement ediyoruz.
			public int compare(Brand o1, Brand o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("Markalarımız");
		System.out.println("--------------");
		for (Brand brand : this.brandList) {
			System.out.println("- " + brand.getName() );
		}
	}
}
