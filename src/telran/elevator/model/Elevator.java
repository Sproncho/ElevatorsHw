package telran.elevator.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Elevator {
	String name;
	int currentVolume;
//	AtomicInteger currentVolume = new AtomicInteger(0);

	public Elevator(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentVolume() {
		return currentVolume;
//		return currentVolume.get();
	}
	
	public void add(int portion) {
		currentVolume = currentVolume + portion;
//		currentVolume.addAndGet(portion);
	}

}
