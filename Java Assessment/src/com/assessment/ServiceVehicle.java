package com.assessment;

public class ServiceVehicle extends Vehicle implements ServiceOperations{
	private String centerName;
	private String serviceCategory;
	
	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String centerName,
			String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.centerName = centerName;
		this.serviceCategory = serviceCategory;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getServiceCategory() {
		return serviceCategory;
	}

	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	@Override
	public void displayProfile() {
		System.out.println("Vehicle Profile Created Successfully");
		System.out.println();
		System.out.println("Vehicle Details");
		System.out.println("---------------------------");
		System.out.println("Owner Name: " + getOwnerName());
		System.out.println("Vehicle Number: " + getVehicleNumber());
		System.out.println("Vehicle Type: " + getVehicleType());
		System.out.println("Service Center: " + getCenterName());
		System.out.println("Service Category: " + getServiceCategory());
	}
	@Override 
	public void updateServiceCategory(String serviceCategory) {
		if(serviceCategory == null & serviceCategory.isEmpty()) {
            System.out.println("Invalid Service Category");
		}
		this.serviceCategory=serviceCategory;
		System.out.println("Updated successfully ");
	}	
	@Override
	public void updateServiceCenter(String centerName) {
		if(centerName == null & centerName.isEmpty()) {
            System.out.println("Invalid Service Category");
		}
		this.centerName=centerName;
		System.out.println("Updated successfully ");
	}

}
