package io.neha.show_event.Model;

public class Show {

	private String id;
	private String name;
	private Venue venue;
	
	
	public Show(String id, String name, Venue venue) {
		super();
		this.id = id;
		this.name = name;
		this.venue = venue;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	} 

}

	  