package io.neha.show_event.Repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import io.neha.show_event.Model.Show;
import io.neha.show_event.Model.Venue;

@Repository
public class ShowRepository {
ArrayList<Show> showList = new ArrayList<Show>();

	public ArrayList<Show> getAll(){
		Venue v1 = new Venue("2","Collier-Wisoky Stadium", "Las Vegas", "NV", "91807-1012");
		Show s1 = new Show("2","Ben and Jerry Exotic World Tour 2019", v1);
		showList.add(s1);
		return showList;
		
	}

	 
		 
	
}
