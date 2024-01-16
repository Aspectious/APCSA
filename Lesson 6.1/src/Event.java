
public class Event {
	private String eventName, location, vis;
	private int participants;
	private boolean notify;

	public Event() {
		eventName= "";
		location = "";
		participants = 0;
	}
	
	public Event(String name, String initLocation, int initParticipants, String initVisibility, boolean initnotify) {
		eventName = name;
		location = initLocation;
		participants = initParticipants;
		vis = initVisibility;
		notify = initnotify;
		
		if (name.trim().equals("")) {
			eventName = "Unknown Event";
		}
		if (initVisibility.trim().equals("")) {
			vis = "Unknown";
		}
		 
	}
	
	public String toString() {
		return "[ " + vis + " Event ] " + eventName + " - " + location + " - " + participants + " Participants - Ring " + notify;
	}
	public Object[] toObj() {
		Object[] out = {eventName,location,participants,vis,notify};
		return out;
	}
	
	public String getName () {
		return eventName;
	}
	public String getLocation() {
		return location;
	}
	public int getParticipants () {
		return participants;
	}
	public String getVisibility() {
		return vis;
	}
	public boolean getDoNotify() {
		return notify;
	}
}
