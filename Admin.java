package mangohotel;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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
		System.out.println(" ");
		System.out.println(" ");
		
	}
}




public class Admin {

	private static boolean MainMenu = true;
    private static boolean SubMenu = true;
    
	
	static
	{
		System.out.println(" ");
		System.out.println("                                                                             Mango Hotel");
	
		System.out.println("🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴🌴");
	    System.out.println("➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻➻");
	}
	
	
	public static void main(String[] args) throws IOException {
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
		
		System.out.println(" ");
		
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
	
		Scanner input = new Scanner(System.in);
        Room[] myHotel = new Room[10];
        myHotel[0] = new Room();
        myHotel[1] = new Room();
        myHotel[2] = new Room();
        myHotel[3] = new Room();
        myHotel[4] = new Room();
        myHotel[5] = new Room();
        myHotel[6] = new Room();
        myHotel[7] = new Room();
        myHotel[8] = new Room();
        myHotel[9] = new Room();
       
        int roomNum = 0;
        initialise(myHotel);
        while (MainMenu) 
        {
            while (SubMenu) 
            {
                System.out.println(" ");
                System.out.println("                                                      Welcome to our Mango Hotel Program");
                System.out.println("🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏🙏");
                System.out.println("Select the options.");
                System.out.println("A: Book A New Room ");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺  ");
                System.out.println("E: Display Empty Rooms ");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺   ");
                System.out.println("V: View all Rooms.");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺  ");
                System.out.println("D: Delete customer from room.");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺  ");
                System.out.println("F: Find room from customer name.");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺");
                System.out.println("S: Store program data in to file.");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺  ");
                System.out.println("L: Load program data from file.");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺  ");
                System.out.println("O: View rooms Ordered alphabetically by name.");
                System.out.println("🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺🌺  ");
                System.out.println("  ");
                System.out.println("  ");
                String Selection = input.next();
                Selection = Selection.toUpperCase();
                switch (Selection) 
                {
                    case "A":
                        BookARoom(myHotel, roomNum);
                        break;
                    case "E":
                        CheckIfEmpty(myHotel);
                        break;
                    case "V":
                        ViewAllRooms(myHotel);
                        break;
                    case "D":
                        DeleteCustomerFromRoom(myHotel, roomNum);
                        break;
                    case "F":
                        FindRoomFromCustomerName(myHotel);
                        break;
                    case "S":
                    	StoreProgramDataInToFile(myHotel);
                        break;
                    case "L":
                        LoadProgramDataFromFile(myHotel);
                        break;
                    case "O":
                        ViewRoomsOrderedAlphabeticallyByName(myHotel);
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        break;
                        
            }
        
                System.out.println("👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉");
                System.out.println("    ");
                System.out.println("Would you like to Select another Option\n1 ) Yes\n2 ) No");
                System.out.println("---------------------------------------------------------");
                System.out.println("__________________________________________________________");
                if (input.nextInt() == 1) 
                {
                    SubMenu = true;
                } else 
                {
                    SubMenu = false;
                }
            }
            SubMenu = true;
            System.out.println("👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉");
            System.out.println("  ");
            System.out.println("Would You Like To Continue With The Program\n1 ) Yes\n2 ) No");
            System.out.println("-------------------------------------------------------------");
            System.out.println("______________________________________________________________");
            if (input.nextInt() == 1) 
            {
                MainMenu = true;
            } else 
            {
                System.out.println("");
                System.exit(0);

            }
        }

    }

	
                private static void initialise(Room[] myHotel) 
                {
                    for (int x = 0; x < myHotel.length; x++) 
                    {
                        myHotel[x].setName("nobody");
                    }
                }

                private static void CheckIfEmpty(Room[] myHotel) {
                    for (int x = 0; x < myHotel.length; x++) 
                    {
                        if (myHotel[x].getName().equals("nobody")) {
                            System.out.println("room " + (x + 1) + " is empty");
                        }
                    }
                }

                private static void BookARoom(Room[] myHotel, int roomNum) 
                {
                    String roomName;
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter room number (1-10):");
                    roomNum = input.nextInt() - 1;
                    System.out.println("Enter name for room " + (roomNum + 1) + " :");
                    roomName = input.next();
                    myHotel[roomNum].setName(roomName);
                }

                private static void ViewAllRooms(Room[] myHotel) 
                {
                    for (int x = 0; x < myHotel.length; x++)
                    {
                        System.out.println("room " + (x + 1) + " occupied by " + myHotel[x].getName());
                    }
                }

                private static void DeleteCustomerFromRoom(Room[] myHotel, int roomNum) 
                {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter room number to delete(1-10):");
                    roomNum = input.nextInt() - 1;
                    myHotel[roomNum].setName("nobody");
                    System.out.println("Entery Deleted :)");
                }

                private static void FindRoomFromCustomerName(Room[] myHotel) 
                {
                    Scanner input = new Scanner(System.in);
                    String roomName;
                    System.out.println("Enter name to Search for:");
                    roomName = input.next();
                    int x;
                    boolean Checker = false;
                    for (x = 0; x < myHotel.length; x++)
                    {
                        if (roomName.equals(myHotel[x].getName())) 
                        {
                            System.out.println("The Account That Matches That name is Account number " + x);
                            Checker = true;
                        }
                    }
                    if (Checker == false)
                    {
                        System.out.println("There are no Rooms Booked with that name\n(make sure you've used the correct CAP's)");
                    }
                }
                private static void StoreProgramDataInToFile(Room[] myHotel) throws IOException 
                {
                    try (PrintWriter out = new PrintWriter(new FileWriter(""))) {
                        int x;
                        for (x = 0; x < myHotel.length; x++) {
                            out.println("Name and Room number is: " + myHotel[x].getName() + "at: " + x);
                        }

                    }
                    System.out.println("All Room Names have been Saved.");
                }

                private static void LoadProgramDataFromFile(Room[] myHotel) throws IOException 
                {
                    FileInputStream fs = new FileInputStream(" ");
                    BufferedReader br = new BufferedReader(new InputStreamReader(fs));
                    for (int i = 0; i < myHotel.length; i++) {
                        myHotel[i].setName(br.readLine());
                    }
                }

                private static void ViewRoomsOrderedAlphabeticallyByName(Room[] myHotel) 
                {
                    String[] myStrArray = new String[myHotel.length];
                    for (int i = 0; i < myHotel.length; i++) 
                    {
                        myStrArray[i] = myHotel[1].getName();
                    }

                    Arrays.sort(myStrArray);
                    for (int a = 0; a < myStrArray.length; a++) 
                    {
                        System.out.println(myStrArray[a]);
                    }

                }


                public static class Room 
                {

                    //protected String mainName;
                    private String mainName;
                    int guestsInRoom;

                    public Room() 
                    {
                        mainName = "k";

                    }

                    public void setName(String aName) 
                    {
                        //  System.out.println("add name class method ");
                        mainName = aName;
                    }

                    public String getName() 
                    {
                        return mainName;
                    }
                }
	
	
	
		
	}
