package com.java.lambda.sort;

public class HolidayDTO {
    private Long holidayId;
    private String description;
    private String status;
    private boolean isActive;
    
    public Long getHolidayId() {
        return holidayId;
    }
    public void setHolidayId(Long holidayId) {
        this.holidayId = holidayId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }


    @Override
    public String toString() {
        return "HolidayId: "+ holidayId +", Description: "+ description +", Status: "+ status +", IsActive"+ isActive;
    }
}
