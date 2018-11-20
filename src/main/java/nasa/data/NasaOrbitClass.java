package nasa.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaOrbitClass {

    private String orbit_class_type;
    private String orbit_class_range;
    private String orbit_class_description;


    @JsonProperty("orbit_class_description")
    public void setOrbit_class_description(String orbit_class_description) {
        this.orbit_class_description = orbit_class_description;
    }

    @JsonProperty("orbit_class_range")
    public void setOrbit_class_range(String orbit_class_range) {
        this.orbit_class_range = orbit_class_range;
    }

    @JsonProperty("orbit_class_type")
    public void setOrbit_class_type(String orbit_class_type) {
        this.orbit_class_type = orbit_class_type;
    }

    public String getOrbit_class_description() {
        return orbit_class_description;
    }

    public String getOrbit_class_range() {
        return orbit_class_range;
    }

    public String getOrbit_class_type() {
        return orbit_class_type;
    }
}
