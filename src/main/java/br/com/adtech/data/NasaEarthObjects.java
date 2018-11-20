package br.com.adtech.data;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public final class NasaEarthObjects {

    private int element_count;
    private Map<String, List<NasaFields>> near_earth_objects;

    @JsonProperty("element_count")
    public void setElement_count(int element_count) {
        this.element_count = element_count;
    }

    @JsonProperty("near_earth_objects")
    public void setNear_earth_objects(Map<String, List<NasaFields>> near_earth_objects) {
        this.near_earth_objects = near_earth_objects;
    }

    public int getElement_count() {
        return element_count;
    }

    public Map<String, List<NasaFields>> getNear_earth_objects() {
        return near_earth_objects;
    }
}



