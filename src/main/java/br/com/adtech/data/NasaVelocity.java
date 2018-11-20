package br.com.adtech.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaVelocity {

    private String kilometers_per_second;
    private String kilometers_per_hour;
    private String miles_per_hour;

    public String getMiles_per_hour() {
        return miles_per_hour;
    }

    public String getKilometers_per_second() {
        return kilometers_per_second;
    }

    public String getKilometers_per_hour() {
        return kilometers_per_hour;
    }

    @JsonProperty("kilometers_per_hour")
    public void setkilometers_per_hour(String kilometers_per_hour) {
        this.kilometers_per_hour = kilometers_per_hour;
    }

    @JsonProperty("kilometers_per_second")
    public void setkilometers_per_second(String kilometers_per_second) {
        this.kilometers_per_second = kilometers_per_second;
    }

    @JsonProperty("miles_per_hour")
    public void setmiles_per_hour(String miles_per_hour) {
        this.miles_per_hour = miles_per_hour;
    }

}
