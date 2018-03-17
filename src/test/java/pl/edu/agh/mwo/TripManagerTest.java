package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void testAddTrip() {
		TripManager trip = new TripManager();
		assertEquals("Trip added: trip1",trip.addTrip("trip1"));
	}
}
