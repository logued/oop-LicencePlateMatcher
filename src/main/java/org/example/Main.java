package org.example;
/*

A tollbooth operator saw a suspicious car passing through the toll booth moments after a crime in the area. Strangely, they remember:

The county code contained an “L”.
The year digits (YYY) summed to 10.
The serial contained at least two 6’s in any position.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("LicencePlate Checker");

        LicencePlate plate = new LicencePlate("262","LH","1666");

        if(LicencePlateMatcher.isLicencePlateAMatch(plate)) {
            System.out.println("Licence plate "+ plate +"is match");}
        else {
            System.out.println("Licence plate "+ plate+"is not match");
        }
    }
}