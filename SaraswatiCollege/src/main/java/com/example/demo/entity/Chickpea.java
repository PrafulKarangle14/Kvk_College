package com.example.demo.entity;



import jakarta.persistence.*;

@Entity
public class Chickpea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String soilType;
    private double areaInAcres;
    private double yieldPerAcre;
    private double spacingCm;
    private double productionKg;
    private int harvestingTimeMonths;
    private int sowingTimeMonths;
    private double productivityKgPerHa;
    private double waterRequirementLiters;
    private double fertilizerRequirementKg;
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
	public double getAreaInAcres() {
		return areaInAcres;
	}
	public void setAreaInAcres(double areaInAcres) {
		this.areaInAcres = areaInAcres;
	}
	public double getYieldPerAcre() {
		return yieldPerAcre;
	}
	public void setYieldPerAcre(double yieldPerAcre) {
		this.yieldPerAcre = yieldPerAcre;
	}
	public double getSpacingCm() {
		return spacingCm;
	}
	public void setSpacingCm(double spacingCm) {
		this.spacingCm = spacingCm;
	}
	public double getProductionKg() {
		return productionKg;
	}
	public void setProductionKg(double productionKg) {
		this.productionKg = productionKg;
	}
	public int getHarvestingTimeMonths() {
		return harvestingTimeMonths;
	}
	public void setHarvestingTimeMonths(int harvestingTimeMonths) {
		this.harvestingTimeMonths = harvestingTimeMonths;
	}
	public int getSowingTimeMonths() {
		return sowingTimeMonths;
	}
	public void setSowingTimeMonths(int sowingTimeMonths) {
		this.sowingTimeMonths = sowingTimeMonths;
	}
	public double getProductivityKgPerHa() {
		return productivityKgPerHa;
	}
	public void setProductivityKgPerHa(double productivityKgPerHa) {
		this.productivityKgPerHa = productivityKgPerHa;
	}
	public double getWaterRequirementLiters() {
		return waterRequirementLiters;
	}
	public void setWaterRequirementLiters(double waterRequirementLiters) {
		this.waterRequirementLiters = waterRequirementLiters;
	}
	public double getFertilizerRequirementKg() {
		return fertilizerRequirementKg;
	}
	public void setFertilizerRequirementKg(double fertilizerRequirementKg) {
		this.fertilizerRequirementKg = fertilizerRequirementKg;
	}
	public String getWeedingAndPestControl() {
		return weedingAndPestControl;
	}
	public void setWeedingAndPestControl(String weedingAndPestControl) {
		this.weedingAndPestControl = weedingAndPestControl;
	}

    
}
