package com.example.demo.service;



import jakarta.persistence.*;

@Entity
public class OftSoybean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId;
    private String soilType;
    private String area; // in acres
    private String yield; // kg/acre
    private String spacing; // cm
    private String production; // kg
    private String harvestingTime; // months
    private String sowingTime; // months
    private String productivity; // kg/ha
    private String waterRequirement; // liters
    private String fertilizerRequirement; // kg
    private String weedingPestControl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getSoilType() {
		return soilType;
	}
	public void setSoilType(String soilType) {
		this.soilType = soilType;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getYield() {
		return yield;
	}
	public void setYield(String yield) {
		this.yield = yield;
	}
	public String getSpacing() {
		return spacing;
	}
	public void setSpacing(String spacing) {
		this.spacing = spacing;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public String getHarvestingTime() {
		return harvestingTime;
	}
	public void setHarvestingTime(String harvestingTime) {
		this.harvestingTime = harvestingTime;
	}
	public String getSowingTime() {
		return sowingTime;
	}
	public void setSowingTime(String sowingTime) {
		this.sowingTime = sowingTime;
	}
	public String getProductivity() {
		return productivity;
	}
	public void setProductivity(String productivity) {
		this.productivity = productivity;
	}
	public String getWaterRequirement() {
		return waterRequirement;
	}
	public void setWaterRequirement(String waterRequirement) {
		this.waterRequirement = waterRequirement;
	}
	public String getFertilizerRequirement() {
		return fertilizerRequirement;
	}
	public void setFertilizerRequirement(String fertilizerRequirement) {
		this.fertilizerRequirement = fertilizerRequirement;
	}
	public String getWeedingPestControl() {
		return weedingPestControl;
	}
	public void setWeedingPestControl(String weedingPestControl) {
		this.weedingPestControl = weedingPestControl;
	}

    // Getters and Setters
    
    
}
