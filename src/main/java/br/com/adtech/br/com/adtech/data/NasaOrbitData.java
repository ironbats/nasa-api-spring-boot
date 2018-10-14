package br.com.adtech.br.com.adtech.data;


import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaOrbitData {


    private String orbit_id;

    @JsonProperty("orbit_id")
    public void setOrbit_id(String orbit_id) {
        this.orbit_id = orbit_id;
    }

    public String getOrbit_id() {
        return orbit_id;
    }
}
