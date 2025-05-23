package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "fld_cotton")

public class FldCotton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String soilType;
    private Double area;
    private Double yield;
    private Double spacing;
    private Double production;
    private String sowingTime;
    private String harvestingTime;
    private Double productivity;
    private Double waterRequirement;
    private Double fertilizerRequirement;
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
	public String getSowingTime() {
		return sowingTime;
	}
	public void setSowingTime(String sowingTime) {
		this.sowingTime = sowingTime;
	}
	public String getHarvestingTime() {
		return harvestingTime;
	}
	public void setHarvestingTime(String harvestingTime) {
		this.harvestingTime = harvestingTime;
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
