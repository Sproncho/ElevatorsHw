package telran.elevator.task;

import telran.elevator.model.Elevator;

public class Truck implements Runnable {
	private static Object mutex = new Object();
	int nRaces;
	int capacity;
	Elevator[] elevators;

	public Truck(int nRaces, int capacity, Elevator... elevators) {
		this.nRaces = nRaces;
		this.capacity = capacity;
		this.elevators = elevators;
	}

	@Override
	public void run() {
		for (int i = 0; i < nRaces; i++) {
			for (int j = 0; j < elevators.length; j++) {
				synchronized (mutex) {
					elevators[j].add(capacity/elevators.length);
				}
			}

//			elevator.add(capacity);
		}

	}

}
