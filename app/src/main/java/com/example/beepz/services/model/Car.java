package com.example.beepz.services.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car {
    @SerializedName("carId")
    @Expose
    private Integer carId;
    @SerializedName("vehicleBrandId")
    @Expose
    private Integer vehicleBrandId;
    @SerializedName("vehicleModelId")
    @Expose
    private Integer vehicleModelId;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("vehicleNickName")
    @Expose
    private String vehicleNickName;
    @SerializedName("customerId")
    @Expose
    private Integer customerId;
    @SerializedName("emirateId")
    @Expose
    private Integer emirateId;
    @SerializedName("plateNumber")
    @Expose
    private String plateNumber;
    @SerializedName("insuranceType")
    @Expose
    private String insuranceType;
    @SerializedName("insuranceNumber")
    @Expose
    private String insuranceNumber;
    @SerializedName("assistanceNo")
    @Expose
    private String assistanceNo;
    @SerializedName("insuranceExpireDate")
    @Expose
    private String insuranceExpireDate;
    @SerializedName("vehicleYearId")
    @Expose
    private Integer vehicleYearId;


    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getVehicleBrandId() {
        return vehicleBrandId;
    }

    public void setVehicleBrandId(Integer vehicleBrandId) {
        this.vehicleBrandId = vehicleBrandId;
    }

    public Integer getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(Integer vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getVehicleNickName() {
        return vehicleNickName;
    }

    public void setVehicleNickName(String vehicleNickName) {
        this.vehicleNickName = vehicleNickName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getEmirateId() {
        return emirateId;
    }

    public void setEmirateId(Integer emirateId) {
        this.emirateId = emirateId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getAssistanceNo() {
        return assistanceNo;
    }

    public void setAssistanceNo(String assistanceNo) {
        this.assistanceNo = assistanceNo;
    }

    public String getInsuranceExpireDate() {
        return insuranceExpireDate;
    }

    public void setInsuranceExpireDate(String insuranceExpireDate) {
        this.insuranceExpireDate = insuranceExpireDate;
    }

    public Integer getVehicleYearId() {
        return vehicleYearId;
    }

    public void setVehicleYearId(Integer vehicleYearId) {
        this.vehicleYearId = vehicleYearId;
    }
}
