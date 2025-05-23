package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Pigeon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String soilType;
    private Double area; // in acres
    private Double yield; // kg/acre
    private Double spacing; // in cm
    private Double production; // in kg
    private Integer harvestingTime; // in months
    private Integer sowingTime; // in months
    private Double productivity; // in kg/ha
    private Double waterRequirement; // in liters
    private Double fertilizerRequirement; // in kg
    private String weedingAndPestControl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSoilType() {
		return soilType;
	}
	public void setSoilType(String soilType) {
		this.soilType = soilType;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Double getYield() {
		return yield;
	}
	public void setYield(Double yield) {
		this.yield = yield;
	}
	public Double getSpacing() {
		return spacing;
	}
	public void setSpacing(Double spacing) {
		this.spacing = spacing;
	}
	public Double getProduction() {
		return production;
	}
	public void setProduction(Double production) {
		this.production = production;
	}
	public Integer getHarvestingTime() {
		return harvestingTime;
	}
	public void setHarvestingTime(Integer harvestingTime) {
		this.harvestingTime = harvestingTime;
	}
	public Integer getSowingTime() {
		return sowingTime;
	}
	public void setSowingTime(Integer sowingTime) {
		this.sowingTime = sowingTime;
	}
	public Double getProductivity() {
		return productivity;
	}
	public void setProductivity(Double productivity) {
		this.productivity = productivity;
	}
	public Double getWaterRequirement() {
		return waterRequirement;
	}
	public void setWaterRequirement(Double waterRequirement) {
		this.waterRequirement = waterRequirement;
	}
	public Double getFertilizerRequirement() {
		return fertilizerRequirement;
	}
	public void setFertilizerRequirement(Double fertilizerRequirement) {
		this.fertilizerRequirement = fertilizerRequirement;
	}
	public String getWeedingAndPestControl() {
		return weedingAndPestControl;
	}
	public void setWeedingAndPestControl(String weedingAndPestControl) {
		this.weedingAndPestControl = weedingAndPestControl;
	}
    
     
}
