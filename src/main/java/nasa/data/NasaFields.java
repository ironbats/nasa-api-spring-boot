package nasa.data;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public final class NasaFields {

    private String neo_reference_id;
    private String name;
    private String nasa_jpl_url;
    private double absolute_magnitude_h;
    private NasaEstimatedPerUnit estimated_diameter;
    private boolean is_potentially_hazardous_asteroid;
    private List<NasaApproach> close_approach_data;
    private List<NasaOrbitData> orbital_data;


    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("absolute_magnitude_h")
    public void setabsolute_magnitude_h(double absolute_magnitude_h) {
        this.absolute_magnitude_h = absolute_magnitude_h;
    }

    @JsonProperty("close_approach_data")
    public void setCloseApproachData(List<NasaApproach> close_approach_data) {
        this.close_approach_data = close_approach_data;
    }

    @JsonProperty("estimated_diameter")
    public void setestimated_diameter(NasaEstimatedPerUnit estimated_diameter) {
        this.estimated_diameter = estimated_diameter;
    }

    @JsonProperty("nasa_jpl_url")
    public void setnasa_jpl_url(String nasa_jpl_url) {
        this.nasa_jpl_url = nasa_jpl_url;
    }

    @JsonProperty("neo_reference_id")
    public void setNeoReferenceid(String neo_reference_id) {
        this.neo_reference_id = neo_reference_id;
    }

    @JsonProperty("orbital_data")
    public void setOrbital_data(List<NasaOrbitData> orbital_data) {
        this.orbital_data = orbital_data;
    }

    @JsonProperty("is_potentially_hazardous_asteroid")
    public void is_potentially_hazardous_asteroid(boolean is_potentially_hazardous_asteroid) {
        this.is_potentially_hazardous_asteroid = is_potentially_hazardous_asteroid;
    }

    public double getAbsolute_magnitude_h() {
        return absolute_magnitude_h;
    }

    public String getName() {
        return name;
    }

    public String getNasa_jpl_url() {
        return nasa_jpl_url;
    }

    public String getNeo_reference_id() {
        return neo_reference_id;
    }

    public NasaEstimatedPerUnit getEstimated_diameter() {
        return estimated_diameter;
    }

    public List<NasaApproach> getClose_approach_data() {
        return close_approach_data;
    }

    public List<NasaOrbitData> getOrbital_data() {
        return orbital_data;
    }


    public boolean isIs_potentially_hazardous_asteroid() {
        return is_potentially_hazardous_asteroid;
    }
}

