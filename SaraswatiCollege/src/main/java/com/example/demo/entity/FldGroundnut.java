package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fld_groundnut")
public class FldGroundnut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String soilType;

    private Double areaInAcres;

    private Double yieldPerAcre;

    private Double spacingInCm;

    private Double productionKg;

    private Integer harvestingTimeMonths;

    private Integer sowingTimeMonths;

    private Double productivityKgPerHa;

    private Double waterRequirementLiters;

    private Double fertilizerRequirementKg;

    @Column(length = 1000)
    private String weedingAndPestControl;

    // Constructors
    public FldGroundnut() {}

    public FldGroundnut(String soilType, Double areaInAcres, Double yieldPerAcre, Double spacingInCm,
                        Double productionKg, Integer harvestingTimeMonths, Integer sowingTimeMonths,
                        Double productivityKgPerHa, Double waterRequirementLiters, Double fertilizerRequirementKg,
                        String weedingAndPestControl) {
        this.soilType = soilType;
        this.areaInAcres = areaInAcres;
        this.yieldPerAcre = yieldPerAcre;
        this.spacingInCm = spacingInCm;
        this.productionKg = productionKg;
        this.harvestingTimeMonths = harvestingTimeMonths;
        this.sowingTimeMonths = sowingTimeMonths;
        this.productivityKgPerHa = productivityKgPerHa;
        this.waterRequirementLiters = waterRequirementLiters;
        this.fertilizerRequirementKg = fertilizerRequirementKg;
        this.weedingAndPestControl = weedingAndPestControl;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSoilType() { return soilType; }
    public void setSoilType(String soilType) { this.soilType = soilType; }

    public Double getAreaInAcres() { return areaInAcres; }
    public void setAreaInAcres(Double areaInAcres) { this.areaInAcres = areaInAcres; }

    public Double getYieldPerAcre() { return yieldPerAcre; }
    public void setYieldPerAcre(Double yieldPerAcre) { this.yieldPerAcre = yieldPerAcre; }

    public Double getSpacingInCm() { return spacingInCm; }
    public void setSpacingInCm(Double spacingInCm) { this.spacingInCm = spacingInCm; }

    public Double getProductionKg() { return productionKg; }
    public void setProductionKg(Double productionKg) { this.productionKg = productionKg; }

    public Integer getHarvestingTimeMonths() { return harvestingTimeMonths; }
    public void setHarvestingTimeMonths(Integer harvestingTimeMonths) { this.harvestingTimeMonths = harvestingTimeMonths; }

    public Integer getSowingTimeMonths() { return sowingTimeMonths; }
    public void setSowingTimeMonths(Integer sowingTimeMonths) { this.sowingTimeMonths = sowingTimeMonths; }

    public Double getProductivityKgPerHa() { return productivityKgPerHa; }
    public void setProductivityKgPerHa(Double productivityKgPerHa) { this.productivityKgPerHa = productivityKgPerHa; }

    public Double getWaterRequirementLiters() { return waterRequirementLiters; }
    public void setWaterRequirementLiters(Double waterRequirementLiters) { this.waterRequirementLiters = waterRequirementLiters; }

    public Double getFertilizerRequirementKg() { return fertilizerRequirementKg; }
    public void setFertilizerRequirementKg(Double fertilizerRequirementKg) { this.fertilizerRequirementKg = fertilizerRequirementKg; }

    public String getWeedingAndPestControl() { return weedingAndPestControl; }
    public void setWeedingAndPestControl(String weedingAndPestControl) { this.weedingAndPestControl = weedingAndPestControl; }
}
