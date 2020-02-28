package movieticket;
import bean.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class AdminInterfaceImplementation implements AdminInterface
{
	static ArrayList<Theater> mov=new ArrayList<Theater>();
	static Theater th=new Theater();
	static ArrayList<Screen> screen=new ArrayList<Screen>();
	static Screen s=new Screen();
	static ArrayList<Show> sh=new ArrayList<Show>();
	static Show show=new Show();
	static ArrayList<MovieName> mn=new ArrayList<MovieName>();
	static MovieName movie=new MovieName();

	
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	@Override
	public void addTheater() {
		// TODO Auto-generated method stub
		try {
		System.out.println("enter the theater name");
		th.setTheater_Name(br.readLine());
		mov.add(th);
		System.out.println("theater added successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		

	@Override
	public Boolean deleteTheater(String del_theater) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Iterator<Theater> it=mov.iterator();
		while(it.hasNext())
		{
			Theater t=(Theater)it.next();
			if(del_theater.equals(t.getTheater_Name()))
			{
				it.remove();
				flag=true;

			}
		}
		return flag;
	}

	@Override
	public void addMovie( ) {
		// TODO Auto-generated method stub
		try {
			System.out.println("enter the movie name");
			movie.setMovie_Name(br.readLine());
			mn.add(movie);
			System.out.println("screen added successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

	@Override
	public Boolean deleteMovie(String del_mov) {
		boolean flag=false;
		Iterator it=mn.iterator();
		while(it.hasNext())
		{
			MovieName t=(MovieName)it.next();
			if(del_mov.equals(t.getMovie_Name()))
			{
				it.remove();
				flag=true;
			}
		}
		return flag;
	}

	@Override
	public void addScreen() {
		// TODO Auto-generated method stub
		try {
			System.out.println("enter the screen name");
			s.setScreen_Name(br.readLine());
			screen.add(s);
			System.out.println("screen added successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

	@Override
	public Boolean deleteScreen(String del_screen) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Iterator it=screen.iterator();
		while(it.hasNext())
		{
			Screen t=(Screen)it.next();
			if(del_screen.equals(t.getScreen_Name()))
			{
				it.remove();
				flag=true;

			}
		}
		return flag;
	}

	@Override
	public void addShow() {
		// TODO Auto-generated method stub
		try {
			System.out.println("enter the show name");
			show.setShow_Name(br.readLine());
			sh.add(show);
			System.out.println("show added successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

	@Override
	public Boolean deleteShow(String del_show) {
		boolean flag=false;
		Iterator<Show> it=sh.iterator();
		while(it.hasNext())
		{
			Show t=(Show)it.next();
			if(del_show.equals(t.getShow_Name()))
			{
				it.remove();
				flag=true;

			}
		}
		return flag;
	}
	
}
