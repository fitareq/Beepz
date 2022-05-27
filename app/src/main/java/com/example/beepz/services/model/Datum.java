package com.example.beepz.services.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {
    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("customerId")
    @Expose
    private Integer customerId;
    @SerializedName("carId")
    @Expose
    private Integer carId;
    @SerializedName("car")
    @Expose
    private Car car;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("serviceId")
    @Expose
    private Integer serviceId;
    @SerializedName("companyWiseServiceId")
    @Expose
    private Integer companyWiseServiceId;
    @SerializedName("numberOfBids")
    @Expose
    private Integer numberOfBids;
    @SerializedName("bidId")
    @Expose
    private Integer bidId;
    @SerializedName("bid")
    @Expose
    private Object bid;
    @SerializedName("companyId")
    @Expose
    private Integer companyId;
    @SerializedName("orderImages")
    @Expose
    private Object orderImages;
    @SerializedName("carLatitude")
    @Expose
    private String carLatitude;
    @SerializedName("carLongitude")
    @Expose
    private String carLongitude;
    @SerializedName("readableOrderNo")
    @Expose
    private String readableOrderNo;
    @SerializedName("qrCodeImage")
    @Expose
    private String qrCodeImage;
    @SerializedName("bookingDate")
    @Expose
    private String bookingDate;
    @SerializedName("bookingTime")
    @Expose
    private String bookingTime;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("orderTrackId")
    @Expose
    private Integer orderTrackId;
    @SerializedName("orderTrack")
    @Expose
    private OrderTrack orderTrack;
    @SerializedName("couponId")
    @Expose
    private Integer couponId;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("vat")
    @Expose
    private Integer vat;
    @SerializedName("serviceCharge")
    @Expose
    private Integer serviceCharge;
    @SerializedName("subTotal")
    @Expose
    private Integer subTotal;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("grandTotal")
    @Expose
    private Integer grandTotal;
    @SerializedName("totalRecord")
    @Expose
    private Integer totalRecord;
    @SerializedName("driverId")
    @Expose
    private Integer driverId;
    @SerializedName("driver")
    @Expose
    private Object driver;
    @SerializedName("orderPaypageUrl")
    @Expose
    private Object orderPaypageUrl;
    @SerializedName("orderReference")
    @Expose
    private Object orderReference;
    @SerializedName("gatewayResponse")
    @Expose
    private Object gatewayResponse;
    @SerializedName("accidentClaimTrackId")
    @Expose
    private Integer accidentClaimTrackId;
    @SerializedName("accidentClaimTrack")
    @Expose
    private Object accidentClaimTrack;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("emailMessage")
    @Expose
    private Object emailMessage;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getCompanyWiseServiceId() {
        return companyWiseServiceId;
    }

    public void setCompanyWiseServiceId(Integer companyWiseServiceId) {
        this.companyWiseServiceId = companyWiseServiceId;
    }

    public Integer getNumberOfBids() {
        return numberOfBids;
    }

    public void setNumberOfBids(Integer numberOfBids) {
        this.numberOfBids = numberOfBids;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Object getBid() {
        return bid;
    }

    public void setBid(Object bid) {
        this.bid = bid;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Object getOrderImages() {
        return orderImages;
    }

    public void setOrderImages(Object orderImages) {
        this.orderImages = orderImages;
    }

    public String getCarLatitude() {
        return carLatitude;
    }

    public void setCarLatitude(String carLatitude) {
        this.carLatitude = carLatitude;
    }

    public String getCarLongitude() {
        return carLongitude;
    }

    public void setCarLongitude(String carLongitude) {
        this.carLongitude = carLongitude;
    }

    public String getReadableOrderNo() {
        return readableOrderNo;
    }

    public void setReadableOrderNo(String readableOrderNo) {
        this.readableOrderNo = readableOrderNo;
    }

    public String getQrCodeImage() {
        return qrCodeImage;
    }

    public void setQrCodeImage(String qrCodeImage) {
        this.qrCodeImage = qrCodeImage;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getOrderTrackId() {
        return orderTrackId;
    }

    public void setOrderTrackId(Integer orderTrackId) {
        this.orderTrackId = orderTrackId;
    }

    public OrderTrack getOrderTrack() {
        return orderTrack;
    }

    public void setOrderTrack(OrderTrack orderTrack) {
        this.orderTrack = orderTrack;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Integer grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Object getDriver() {
        return driver;
    }

    public void setDriver(Object driver) {
        this.driver = driver;
    }

    public Object getOrderPaypageUrl() {
        return orderPaypageUrl;
    }

    public void setOrderPaypageUrl(Object orderPaypageUrl) {
        this.orderPaypageUrl = orderPaypageUrl;
    }

    public Object getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(Object orderReference) {
        this.orderReference = orderReference;
    }

    public Object getGatewayResponse() {
        return gatewayResponse;
    }

    public void setGatewayResponse(Object gatewayResponse) {
        this.gatewayResponse = gatewayResponse;
    }

    public Integer getAccidentClaimTrackId() {
        return accidentClaimTrackId;
    }

    public void setAccidentClaimTrackId(Integer accidentClaimTrackId) {
        this.accidentClaimTrackId = accidentClaimTrackId;
    }

    public Object getAccidentClaimTrack() {
        return accidentClaimTrack;
    }

    public void setAccidentClaimTrack(Object accidentClaimTrack) {
        this.accidentClaimTrack = accidentClaimTrack;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(Object emailMessage) {
        this.emailMessage = emailMessage;
    }
}
