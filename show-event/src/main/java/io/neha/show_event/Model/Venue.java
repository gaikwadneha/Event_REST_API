package io.neha.show_event.Model;

public class Venue {

	private String id;
	private String name;
	private String city;
	private String state;
	private String zip;
	
	public Venue(String id, String name, String city, String state, String zip) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}

