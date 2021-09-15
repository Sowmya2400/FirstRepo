package com.lti.model;

<<<<<<< HEAD
public class Flight {
	int flightId;
	String start;
	String destination;
	public Flight(int flightId, String start, String destination) {
		super();
		this.flightId = flightId;
		this.start = start;
		this.destination = destination;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
=======
public class Flight implements Comparable<Flight> {
	private int flightID;
	private String source;
	private String destination;
	
	public Flight(int flightID, String source, String destination) {
		
		this.flightID = flightID;
		this.source = source;
		this.destination = destination;
	}

	public int getFlightID() {
		return flightID;
	}

	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int compareTo(Flight o) {
		
		if(this.flightID>o.flightID)
			return 1;
		else if(this.flightID<o.flightID)
			return -1;
		else
			return 0;
		
	}
	
	
>>>>>>> branch 'master' of https://github.com/sharathchitt/FirstMavenProject.git
	
}
