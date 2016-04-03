public class TheMotivator {
	public void thoughtForTheDay() {
		syso("On the other hand, you have different fingers")
	}

public void createEvents() {
		events.add("We're going to a movie on Saturday");
		events.add("Study session on Sunday - Jim's house");
	}


public void upcomingEvents() {
		syso("Upcoming Events")
for (String event : events)	
			System.out.println(event);
	
}
              

	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
                sc.createEvents();
	}
}

