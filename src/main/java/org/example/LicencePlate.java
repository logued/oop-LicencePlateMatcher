package org.example;
// https://en.wikipedia.org/wiki/Vehicle_registration_plates_of_the_Republic_of_Ireland


import java.util.Objects;

public class LicencePlate {

    private String yearIdentifier;      // e.g. 252  (2025, 2nd half of year)
    private String countyIdentifier;    // county/city id e.g. LH, L, D
    private String sequenceNumber;      // 0-999,999  (not needed as integer)


    public LicencePlate(String yearIdentifier, String countyIdentifier, String sequenceNumber) {
        this.yearIdentifier = yearIdentifier;
        this.countyIdentifier = countyIdentifier.toUpperCase();
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public String toString() {
        return "LicencePlate{" +
                "yearIdentifier='" + yearIdentifier + '\'' +
                ", countyIdentifier='" + countyIdentifier + '\'' +
                ", sequenceNumber='" + sequenceNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LicencePlate that = (LicencePlate) o;
        return Objects.equals(yearIdentifier, that.yearIdentifier)
                && Objects.equals(countyIdentifier, that.countyIdentifier)
                && Objects.equals(sequenceNumber, that.sequenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearIdentifier, countyIdentifier, sequenceNumber);
    }

    public String getYearIdentifier() {
        return yearIdentifier;
    }

    public void setYearIdentifier(String yearIdentifier) {
        this.yearIdentifier = yearIdentifier;
    }

    public String getCountyIdentifier() {
        return countyIdentifier;
    }

    public void setCountyIdentifier(String countyIdentifier) {
        this.countyIdentifier = countyIdentifier.toUpperCase();
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
}






