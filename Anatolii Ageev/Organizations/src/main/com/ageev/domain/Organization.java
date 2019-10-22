package main.com.ageev.domain;

import java.util.Objects;

public class Organization extends LongID {
    private String organizationName;
    private String phoneNumber;
    private String adress;
    private Regions region;
    private String country;
    private String city;
    private Boolean isActive;
    private String Specialization;

    public Organization(String organizationName, String phoneNumber, String adress, Regions region, String country, String city, Boolean isActive, String specialization) {
        this.organizationName = organizationName;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.region = region;
        this.country = country;
        this.city = city;
        this.isActive = isActive;
        Specialization = specialization;
    }

    public Organization(Long o, String organizationName, String phoneNumber, String adress, Regions region, String country, String city, Boolean isActive, String specialization) {
        super(o);
        this.organizationName = organizationName;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.region = region;
        this.country = country;
        this.city = city;
        this.isActive = isActive;
        Specialization = specialization;
    }

    public Organization(Long o, String organizationName, String phoneNumber, String adress, String country, String city, Boolean isActive, String specialization) {
        super(o);
        this.organizationName = organizationName;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.country = country;
        this.city = city;
        this.isActive = isActive;
        Specialization = specialization;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Regions getRegion() {
        return region;
    }

    public void setRegion(Regions region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(organizationName, that.organizationName) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(adress, that.adress) &&
                region == that.region &&
                Objects.equals(country, that.country) &&
                Objects.equals(city, that.city) &&
                Objects.equals(isActive, that.isActive) &&
                Objects.equals(Specialization, that.Specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationName, phoneNumber, adress, region, country, city, isActive, Specialization);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "organizationName='" + organizationName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", region=" + region +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", isActive=" + isActive +
                ", Specialization='" + Specialization + '\'' +
                ", id=" + id +
                '}';
    }
}
