package sn.atos.gastro_and_me.dto;

import sn.atos.gastro_and_me.entities.enums.Speciality;

public class RestaurantDTO {
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;
    private Speciality speciality;

    public RestaurantDTO() {
    }

    public RestaurantDTO(Long id, String name, String phoneNumber, String address, Speciality speciality) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.speciality = speciality;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
