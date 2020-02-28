package movieticket;

import java.util.ArrayList;

public interface AdminInterface 
{
	public void addTheater(); 
	public Boolean deleteTheater(String del_theater);
	public void addMovie();
	public Boolean deleteMovie(String mov);
	public void addScreen();
	public Boolean deleteScreen(String screen);
	public void addShow();
	public Boolean deleteShow(String show);
}