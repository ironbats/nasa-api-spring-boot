package br.com.adtech.br.com.adtech.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaEtimatedDiameter {

    private NasaEstimatedPerUnit kilometers;
    private NasaEstimatedPerUnit meters;
    private NasaEstimatedPerUnit miles;
    private NasaEstimatedPerUnit feet;

    @JsonProperty("meters")
    public void setMeters(NasaEstimatedPerUnit meters) {
        this.meters = meters;
    }

    @JsonProperty("feet")
    public void setFeet(NasaEstimatedPerUnit feet) {
        this.feet = feet;
    }

    @JsonProperty("kilometers")
    public void setKilometers(NasaEstimatedPerUnit kilometers) {
        this.kilometers = kilometers;
    }


    @JsonProperty("miles")
    public void setMiles(NasaEstimatedPerUnit miles) {
        this.miles = miles;
    }

    public NasaEstimatedPerUnit getKilometers() {
        return kilometers;
    }

    public NasaEstimatedPerUnit getMeters() {
        return meters;
    }

    public NasaEstimatedPerUnit getMiles() {
        return miles;
    }

    public NasaEstimatedPerUnit getFeet() {
        return feet;
    }
}
