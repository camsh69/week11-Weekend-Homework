import airlineEmployee.CabinCrewMember;
import airlineEmployee.Pilot;
import plane.Plane;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private  String departureAirport;
    private String departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public ArrayList<Pilot> getPilots() {
        return this.pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return this.cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void addCabinCrewMembers(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void removeCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.remove(cabinCrewMember);
    }

    public void addPilots(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void removePilots(Pilot pilot) {
        this.pilots.remove(pilot);
    }

    public int getRemainingSeats() {
        return this.plane.getPlaneType().getCapacity() - this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() < this.plane.getPlaneType().getCapacity()) {
            this.passengers.add(passenger);
        }
    }
}


