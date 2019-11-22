package BXhomework;

public class Employee {
	private String ID;
	private String name;
	private double height;
	private double weight;

	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void display(){
		System.out.println("Employee [no=" + ID + ", name=" + name + ", height=" + height + ", weight=" + weight + "]";);
	}
	
}

