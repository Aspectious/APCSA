
public class Event {
	private String eventName, location;
	private int participants;

	public Event() {
		eventName= "";
		location = "";
		participants = 0;
	}
	
	public Event(String name, String initLocation, int initParticipants) {
		eventName = name;
		location = initLocation;
		participants = initParticipants;
	}
}
