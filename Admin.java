package mangohotel;

import java.util.Scanner;

class Info
{
	
	
	String fname;
	String lname;
	String sex;
	String place;
	int    age;
	int days;
	String book;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	
	
	
	
}


class Setting
{	
	void display(Info f)
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("First Name: "+f.getFname());
		System.out.println("Last Name: "+f.getLname());
		System.out.println("Sex: "+f.getSex());
		System.out.println("Place: "+f.getPlace());
		System.out.println("Age: "+f.getAge());
		System.out.println("Days: "+f.getDays());
		System.out.println("Confirmation:"+f.getBook());
	}
}




public class Admin {

	static
	{
		System.out.println(" ");
		System.out.println("                                          Mango Hotel");
	
		System.out.println("🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻🌻");
	    System.out.println("➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.print("Enter First Name: ");
		String fname=sc.nextLine();
		
		System.out.println(" ");
		
		System.out.print("Enter Your Last Name: ");
		String lname=sc.nextLine();
		
		System.out.println(" ");
		
		System.out.print("Enter Your Gender: ");
		String sex=sc.next();
		
		System.out.println(" ");
		
		System.out.print("Enter Your Place: ");
		String place=sc.next();
		
		System.out.println(" ");
		
		System.out.print("Enter your Age: ");
		int age=sc.nextInt();
		
		System.out.println(" ");
		
		System.out.print("Total Booking Days: ");
		int days=sc.nextInt();
		
		System.out.print("Booking Confirmation:  ");
		String book=sc.next();
		
		Info f=new Info();
		f.setFname(fname);
		f.setLname(lname);
		f.setSex(sex);
		f.setPlace(place);
		f.setAge(age);
		f.setDays(days);
		f.setBook(book);
		Setting s=new Setting();
		s.display(f);
		
		
		
	}

}
