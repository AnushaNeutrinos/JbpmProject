package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class vehicleDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("year")
	private String year;

	@org.kie.api.definition.type.Label("registrationNumber")
	private java.lang.String registrationNumber;

	@org.kie.api.definition.type.Label("make")
	private java.lang.String make;

	@org.kie.api.definition.type.Label("model")
	private java.lang.String model;

	@org.kie.api.definition.type.Label(value = "colour")
	private java.lang.String colour;

	@org.kie.api.definition.type.Label(value = "riskItemCancellationDate")
	private java.lang.String riskItemCancellationDate;

	@org.kie.api.definition.type.Label(value = "riskItemInactiveReason")
	private java.lang.String riskItemInactiveReason;

	@org.kie.api.definition.type.Label(value = "riskItemInceptionDate")
	private java.lang.String riskItemInceptionDate;

	@org.kie.api.definition.type.Label(value = "carHireVehicleTypeDescription")
	private java.lang.String carHireVehicleTypeDescription;

	@org.kie.api.definition.type.Label(value = "carHireCompanyDescription")
	private java.lang.String carHireCompanyDescription;

	@org.kie.api.definition.type.Label(value = "carHireTheftDuration")
	private java.lang.String carHireTheftDuration;

	@org.kie.api.definition.type.Label(value = "carHireAccidentDuration")
	private java.lang.String carHireAccidentDuration;

	@org.kie.api.definition.type.Label(value = "carHireInactiveReason")
	private java.lang.String carHireInactiveReason;

	public vehicleDetails() {
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(java.lang.String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public java.lang.String getMake() {
		return this.make;
	}

	public void setMake(java.lang.String make) {
		this.make = make;
	}

	public java.lang.String getModel() {
		return this.model;
	}

	public void setModel(java.lang.String model) {
		this.model = model;
	}

	public java.lang.String getYear() {
		return this.year;
	}

	public void setYear(java.lang.String year) {
		this.year = year;
	}

	public java.lang.String getColour() {
		return this.colour;
	}

	public void setColour(java.lang.String colour) {
		this.colour = colour;
	}

	public java.lang.String getRiskItemCancellationDate() {
		return this.riskItemCancellationDate;
	}

	public void setRiskItemCancellationDate(
			java.lang.String riskItemCancellationDate) {
		this.riskItemCancellationDate = riskItemCancellationDate;
	}

	public java.lang.String getRiskItemInactiveReason() {
		return this.riskItemInactiveReason;
	}

	public void setRiskItemInactiveReason(
			java.lang.String riskItemInactiveReason) {
		this.riskItemInactiveReason = riskItemInactiveReason;
	}

	public java.lang.String getRiskItemInceptionDate() {
		return this.riskItemInceptionDate;
	}

	public void setRiskItemInceptionDate(java.lang.String riskItemInceptionDate) {
		this.riskItemInceptionDate = riskItemInceptionDate;
	}

	public java.lang.String getCarHireVehicleTypeDescription() {
		return this.carHireVehicleTypeDescription;
	}

	public void setCarHireVehicleTypeDescription(
			java.lang.String carHireVehicleTypeDescription) {
		this.carHireVehicleTypeDescription = carHireVehicleTypeDescription;
	}

	public java.lang.String getCarHireCompanyDescription() {
		return this.carHireCompanyDescription;
	}

	public void setCarHireCompanyDescription(
			java.lang.String carHireCompanyDescription) {
		this.carHireCompanyDescription = carHireCompanyDescription;
	}

	public java.lang.String getCarHireTheftDuration() {
		return this.carHireTheftDuration;
	}

	public void setCarHireTheftDuration(java.lang.String carHireTheftDuration) {
		this.carHireTheftDuration = carHireTheftDuration;
	}

	public java.lang.String getCarHireAccidentDuration() {
		return this.carHireAccidentDuration;
	}

	public void setCarHireAccidentDuration(
			java.lang.String carHireAccidentDuration) {
		this.carHireAccidentDuration = carHireAccidentDuration;
	}

	public java.lang.String getCarHireInactiveReason() {
		return this.carHireInactiveReason;
	}

	public void setCarHireInactiveReason(java.lang.String carHireInactiveReason) {
		this.carHireInactiveReason = carHireInactiveReason;
	}

	public vehicleDetails(java.lang.String description, java.lang.String year,
			java.lang.String registrationNumber, java.lang.String make,
			java.lang.String model, java.lang.String colour,
			java.lang.String riskItemCancellationDate,
			java.lang.String riskItemInactiveReason,
			java.lang.String riskItemInceptionDate,
			java.lang.String carHireVehicleTypeDescription,
			java.lang.String carHireCompanyDescription,
			java.lang.String carHireTheftDuration,
			java.lang.String carHireAccidentDuration,
			java.lang.String carHireInactiveReason) {
		this.description = description;
		this.year = year;
		this.registrationNumber = registrationNumber;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.riskItemCancellationDate = riskItemCancellationDate;
		this.riskItemInactiveReason = riskItemInactiveReason;
		this.riskItemInceptionDate = riskItemInceptionDate;
		this.carHireVehicleTypeDescription = carHireVehicleTypeDescription;
		this.carHireCompanyDescription = carHireCompanyDescription;
		this.carHireTheftDuration = carHireTheftDuration;
		this.carHireAccidentDuration = carHireAccidentDuration;
		this.carHireInactiveReason = carHireInactiveReason;
	}

}