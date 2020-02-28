package movieticket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import bean.*
;public class AdminMain {

	public static void main(String[] args) 
	{
			try 
			{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n;
			System.out.println("enter the adminId");
			String adminId=br.readLine();
			System.out.println("enter the admin Name");
			String admin_name=br.readLine();
			System.out.println("enter the admin Password");
			String pass=br.readLine();
			System.out.println("enter the admin contact");
			int num=Integer.parseInt(br.readLine());
			//System.out.println("enter the admin dob");
			LocalDate date = LocalDate.now(); 
			
			Movie movie=new Movie();
			movie.setAdminId(adminId);
			movie.setAdminName(admin_name);
			movie.setAdminPassword(pass);
			movie.setDateOfBirth(date);
			movie.setAdminContact(num);
			
			System.out.println("-----------------------------Admin Details entered Successfully!!!-------------------------------------");
			System.out.println("--------------------Welcome Admin------------------------------");
			do {
			System.out.println("\tONLINE MOVIE TICKET SYSTEM");
			System.out.println("Menu-");
			System.out.println("1. Add Theater");
			System.out.println("2. Delete Theater");
			System.out.println("3. Add Movie");
			System.out.println("4. Delete Movie");
			System.out.println("5. Add Screen");
			System.out.println("6. Delete Screen");
			System.out.println("7. Add Show");
			System.out.println("8. Delete Show");
			System.out.println("Enter your choice (1-8):");
			n=Integer.parseInt(br.readLine());
			
			switch(n)
			{
			case 1:
				
				AdminInterfaceImplementation obj1=new AdminInterfaceImplementation();
				obj1.addTheater();
				break;
				
			case 2:
				AdminInterfaceImplementation obj2=new AdminInterfaceImplementation();
				
				System.out.println("Enter theater to be deleted");
				String t_name=br.readLine();
				boolean flag1=obj2.deleteTheater(t_name);
				if(flag1==true)
				{
					System.out.println("Theater deleted succesfull!");
				}
				else
					System.out.println("Theater not found!");
				break;
				
			case 3:
				AdminInterfaceImplementation obj3=new AdminInterfaceImplementation();
				obj3.addMovie();
				break;
		    
			case 4:
				AdminInterfaceImplementation obj4=new AdminInterfaceImplementation();
				System.out.println("Enter movie to be deleted");
				String m_name=br.readLine();
				boolean flag2=obj4.deleteMovie(m_name);
				if(flag2==true)
				{
					System.out.println("movie deleted succesfull!");
				}
				else
					System.out.println("Movie not found!");
				break;
				
			case 5:
				AdminInterfaceImplementation obj5=new AdminInterfaceImplementation();
				obj5.addScreen();
				break;
		    
			case 6:
				AdminInterfaceImplementation obj6=new AdminInterfaceImplementation();
				System.out.println("Enter screen to be deleted");
				String sc_name=br.readLine();
				boolean flag3=obj6.deleteScreen(sc_name);
				if(flag3==true)
				{
					System.out.println("Screen deleted succesfully!");
				}
				else
					System.out.println("Screen not Found!");
				break;
		    
			case 7:
				AdminInterfaceImplementation obj7=new AdminInterfaceImplementation();
				obj7.addShow();
				break;
		    
			case 8:
				AdminInterfaceImplementation obj8=new AdminInterfaceImplementation();
				System.out.println("Enter Show to be deleted");
				String sh_name=br.readLine();
				boolean flag4=obj8.deleteShow(sh_name);
				if(flag4==true)
				{
					System.out.println("Show deleted succesfull!");
				}
				else
					System.out.println("Show not Found!");
				break;
		    
				default:
				System.out.println("Invalid choice!!");
			}
			}
			while(n<=8);
			
			}
		catch(Exception e)
			{
			e.printStackTrace();
			}
	}

}
