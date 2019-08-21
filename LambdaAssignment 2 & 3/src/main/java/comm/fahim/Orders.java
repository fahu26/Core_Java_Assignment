package comm.fahim;

public class Orders {
private String name;
private int price;
private String status;
@Override
public String toString() {
	return "Orders [name=" + name + ", price=" + price + ", status=" + status + "]";
}
public Orders(String name, int price, String status) {
	super();
	this.name = name;
	this.price = price;
	this.status = status;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
