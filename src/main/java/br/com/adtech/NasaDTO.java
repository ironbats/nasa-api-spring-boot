package br.com.adtech;

import br.com.adtech.br.com.adtech.data.NasaVelocity;

public class NasaDTO {

    private String neo_reference_id;
    private String name;
    private NasaVelocity relative_velocity;
    private String kilometers_per_hour;
    private boolean is_potentially_hazardous_asteroid;
    private String orbiting_body;


    public String getOrbiting_body() {
        return orbiting_body;
    }

    public void setOrbiting_body(String orbiting_body) {
        this.orbiting_body = orbiting_body;
    }

    public void setIs_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public boolean isIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKilometers_per_hour(String kilometers_per_hour) {
        this.kilometers_per_hour = kilometers_per_hour;
    }

    public void setRelative_velocity(NasaVelocity relative_velocity) {
        this.relative_velocity = relative_velocity;
    }

    public void setNeo_reference_id(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }

    public String getKilometers_per_hour() {
        return kilometers_per_hour;
    }

    public String getNeo_reference_id() {
        return neo_reference_id;
    }

    public String getName() {
        return name;
    }

    public NasaVelocity getRelative_velocity() {
        return relative_velocity;
    }


}
