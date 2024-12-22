package com.spring.foodservice.springrestfoodservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodTruck {
	@Id
	private long locationId;
	private String applicant;
	private String facilityType;
	private long cnn;
	private String locationDescription;
	private String address;
	private long blocklot;
	private int block;
	private int lot;
	private String permit;
	private String status;
	private String foodItems;
	private double X;
	private double Y;
	private double latitude;
	private double longitude;
	private String schedule;
	private String approved;
	private long received;
	private int priorPermit;
	private String expirationDate;
	private String location;
	public FoodTruck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodTruck(long locationId, String applicant, String facilityType, long cnn, String locationDescription,
			String address, long blocklot, int block, int lot, String permit, String status, String foodItems, double x,
			double y, double latitude, double longitude, String schedule, String approved, long received,
			int priorPermit, String expirationDate, String location) {
		super();
		this.locationId = locationId;
		this.applicant = applicant;
		this.facilityType = facilityType;
		this.cnn = cnn;
		this.locationDescription = locationDescription;
		this.address = address;
		this.blocklot = blocklot;
		this.block = block;
		this.lot = lot;
		this.permit = permit;
		this.status = status;
		this.foodItems = foodItems;
		X = x;
		Y = y;
		this.latitude = latitude;
		this.longitude = longitude;
		this.schedule = schedule;
		this.approved = approved;
		this.received = received;
		this.priorPermit = priorPermit;
		this.expirationDate = expirationDate;
		this.location = location;
	}
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public long getCnn() {
		return cnn;
	}
	public void setCnn(long cnn) {
		this.cnn = cnn;
	}
	public String getLocationDescription() {
		return locationDescription;
	}
	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getBlocklot() {
		return blocklot;
	}
	public void setBlocklot(long blocklot) {
		this.blocklot = blocklot;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getLot() {
		return lot;
	}
	public void setLot(int lot) {
		this.lot = lot;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}
	public double getX() {
		return X;
	}
	public void setX(double x) {
		X = x;
	}
	public double getY() {
		return Y;
	}
	public void setY(double y) {
		Y = y;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public long getReceived() {
		return received;
	}
	public void setReceived(long received) {
		this.received = received;
	}
	public int getPriorPermit() {
		return priorPermit;
	}
	public void setPriorPermit(int priorPermit) {
		this.priorPermit = priorPermit;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "FoodTruck [locationId=" + locationId + ", applicant=" + applicant + ", facilityType=" + facilityType
				+ ", cnn=" + cnn + ", locationDescription=" + locationDescription + ", address=" + address
				+ ", blocklot=" + blocklot + ", block=" + block + ", lot=" + lot + ", permit=" + permit + ", status="
				+ status + ", foodItems=" + foodItems + ", X=" + X + ", Y=" + Y + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", schedule=" + schedule + ", approved=" + approved + ", received="
				+ received + ", priorPermit=" + priorPermit + ", expirationDate=" + expirationDate + ", location="
				+ location + "]";
	}
	
	
}
