package br.com.adtech.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaDistance {

    private String astronomical;
    private String lunar;
    private String kilometers;
    private String miles;

    @JsonProperty("lunar")
    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    @JsonProperty("atronomical")
    public void setAstronomical(String astronomical) {
        this.astronomical = astronomical;
    }

    @JsonProperty("kilometers")
    public void setKilometers(String kilometers) {
        this.kilometers = kilometers;
    }

    @JsonProperty("miles")
    public void setMiles(String miles) {
        this.miles = miles;
    }

    public String getAstronomical() {
        return astronomical;
    }

    public String getLunar() {
        return lunar;
    }

    public String getKilometers() {
        return kilometers;
    }

    public String getMiles() {
        return miles;
    }
}
