package GUI;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class Flight implements ObservableList {	
private String airline;	
private int flightNum;
private int flightCap;
private int seatsAvailable;
private int seatsTaken;
private String startingCity;
private String arrivalCity;
private Time departureTime;
private Time arrivalTime;
private Date departureDate;
private Date arrivalDate;
private boolean isFull;
private Timestamp time;
 
public Flight(){
	
}

public Flight(String airline, int flightNum, String startingCity, String arrivalCity) {
	super();
	this.airline = airline;
	this.flightNum = flightNum;
	this.startingCity = startingCity;
	this.arrivalCity = arrivalCity;
}

public Flight( int flightNum,String airline, String startingCity, String arrivalCity, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime,int seatsAvailable, Timestamp time) {
	super();
	this.airline = airline;
	this.flightNum = flightNum;
	this.startingCity = startingCity;
	this.arrivalCity = arrivalCity;
	this.departureDate = departureDate;
	this.departureTime = departureTime;
	this.arrivalDate = arrivalDate;
	this.arrivalTime = arrivalTime;
	this.seatsAvailable = seatsAvailable;
	this.time = time;
}
public Flight( int flightNum,String airline, String startingCity, String arrivalCity, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime,int seatsAvailable) {
	super();
	this.airline = airline;
	this.flightNum = flightNum;
	this.startingCity = startingCity;
	this.arrivalCity = arrivalCity;
	this.departureDate = departureDate;
	this.departureTime = departureTime;
	this.arrivalDate = arrivalDate;
	this.arrivalTime = arrivalTime;
	this.seatsAvailable = seatsAvailable;
}


public Flight( int flightNum,String airline, String startingCity, String arrivalCity, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime) {
	super();
	this.airline = airline;
	this.flightNum = flightNum;
	this.startingCity = startingCity;
	this.arrivalCity = arrivalCity;
	this.departureDate = departureDate;
	this.departureTime = departureTime;
	this.arrivalDate = arrivalDate;
	this.arrivalTime = arrivalTime;

}

public String getAirline() {
	return airline;
}

public void setAirline(String airline) {
	this.airline = airline;
}

public int getFlightNumber() {
	return flightNum;
}

public void setFlightNumber(int flightNum) {
	this.flightNum = flightNum;
}

public int getFlightCapacity() {
	return flightCap;
}

public void setFlightCapacity(int flightCap) {
	this.flightCap = flightCap;
}

public int getSeatsAvailable() {
	return seatsAvailable;
}

public void setSeatsAvailable(int seatsAvailable) {
	this.seatsAvailable = seatsAvailable;
}

public int getSeatsOccupied() {
	return seatsTaken;
}

public void setSeatsOccupied(int seatsTaken) {
	this.seatsTaken = seatsTaken;
}

public String getOriginCity() {
	return startingCity;
}

public void setOriginCity(String startingCity) {
	this.startingCity = startingCity;
}

public String getDestinationCity() {
	return arrivalCity;
}

public void setDestinationCity(String arrivalCity) {
	this.arrivalCity = arrivalCity;
}

public Time getDepartureTime() {
	return departureTime;
}

public void setDepartureTime(Time departureTime) {
	this.departureTime = departureTime;
}

public Time getArrivalTime() {
	return arrivalTime;
}

public void setArrivalTime(Time arrivalTime) {
	this.arrivalTime = arrivalTime;
}

public Date getDepartureDate() {
	return departureDate;
}

public void setDepartureDate(Date departureDate) {
	this.departureDate = departureDate;
}

public Date getArrivalDate() {
	return arrivalDate;
}

public void setArrivalDate(Date arrivalDate) {
	this.arrivalDate = arrivalDate;
}

public boolean isFull() {
	return isFull;
}

public void setFull(boolean isFull) {
	this.isFull = isFull;
}

@Override
public String toString() {
	return "Flight [airline=" + airline + ", flightNum=" + flightNum + ", flightCap=" + flightCap
			+ ", seatsAvailable=" + seatsAvailable + ", seatsTaken=" + seatsTaken + ", startingCity=" + startingCity
			+ ", arrivalCity=" + arrivalCity + ", departureTime=" + departureTime + ", arrivalTime="
			+ arrivalTime + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate + ", isFull=" + isFull
			+ "]";
}

@Override
public boolean add(Object e) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void add(int index, Object element) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean addAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean addAll(int index, Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public boolean contains(Object o) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Object get(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int indexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterator iterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int lastIndexOf(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public ListIterator listIterator() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ListIterator listIterator(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean remove(Object o) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Object remove(int index) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean removeAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean retainAll(Collection c) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Object set(int index, Object element) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public List subList(int fromIndex, int toIndex) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object[] toArray(Object[] a) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void addListener(InvalidationListener arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void removeListener(InvalidationListener arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean addAll(Object... arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void addListener(ListChangeListener arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void remove(int arg0, int arg1) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean removeAll(Object... arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void removeListener(ListChangeListener arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean retainAll(Object... arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean setAll(Object... arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean setAll(Collection arg0) {
	// TODO Auto-generated method stub
	return false;
}



}