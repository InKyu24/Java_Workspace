package common.entity;

public class ProductDTO {
	private String prodCode;
	private String prodName;
	private int price;
	
	public ProductDTO() {
		super();
	}
	public ProductDTO(String prodCode) {
		setProdCode(prodCode);
	}
	public ProductDTO(String prodCode, String prodName, int price) {
		this(prodCode);
		setProdName(prodName);
		setPrice(price);
	}
	

	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		if(prodCode!=null) {
			this.prodCode = prodCode;
		}else {
			System.out.println("상품코드는 null이 될 수 없습니다");
		}
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		if(prodName!=null) {
			this.prodName = prodName;
		}else {
			System.out.println("상품이름는 null이 될 수 없습니다");
		}
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price >0) {
			this.price = price;
		}
	}
}
