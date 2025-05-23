package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Oftonion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String soil;
	private String area;
	private String yield;
	private String climate;
	private String spacing;
	private String wedding;
	private String maturity;
	private String irrigation;
	private String harvesting;
	private String sowingTime;
	private String fertilization;
	private String propagation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoil() {
		return soil;
	}

	public void setSoil(String soil) {
		this.soil = soil;
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

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getSpacing() {
		return spacing;
	}

	public void setSpacing(String spacing) {
		this.spacing = spacing;
	}

	public String getWedding() {
		return wedding;
	}

	public void setWedding(String wedding) {
		this.wedding = wedding;
	}

	public String getMaturity() {
		return maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	public String getIrrigation() {
		return irrigation;
	}

	public void setIrrigation(String irrigation) {
		this.irrigation = irrigation;
	}

	public String getHarvesting() {
		return harvesting;
	}

	public void setHarvesting(String harvesting) {
		this.harvesting = harvesting;
	}

	public String getSowingTime() {
		return sowingTime;
	}

	public void setSowingTime(String sowingTime) {
		this.sowingTime = sowingTime;
	}

	public String getFertilization() {
		return fertilization;
	}

	public void setFertilization(String fertilization) {
		this.fertilization = fertilization;
	}

	public String getPropagation() {
		return propagation;
	}

	public void setPropagation(String propagation) {
		this.propagation = propagation;
	}

	// Getters and Setters
	// (You can use Lombok @Data for cleaner code)

}
