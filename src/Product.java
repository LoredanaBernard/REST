
public class Product {
	
	private int id;
	private String  name;
	private String description;
	private int stock;
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Product() {}
	
	public Product(int id, String n, String desc, int st) {
		this.id = id;
		this.name = n;
		this.stock = st;
		this.description = desc;
	}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
