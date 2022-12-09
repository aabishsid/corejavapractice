package test.package1;

public class StudentDemo {
	
	private String name;
	private int age;
	private String adddress;
	
	public StudentDemo(String name,
			        int age,
			         String address) {
		this.name = name;
		this.age = age;
		this.adddress = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.adddress = address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return adddress;
	}
	
	@Override
	public String toString() {
		return ("Student name is" + this.getName() +", age is: " + this.getAge() +" and address is: "+ this.getAddress());
	}
	
	public static void main(String[] args) {
		Student john = new Student ("John", 25, "23 East California");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
	}

	}


