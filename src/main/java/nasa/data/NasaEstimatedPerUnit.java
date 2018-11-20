package nasa.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaEstimatedPerUnit {

    private String estimated_diameter_min;
    private String estimated_diameter_max;

    @JsonProperty("estimated_diameter_min")
    public void setestimated_diameter_min(String estimated_diameter_min) {
        this.estimated_diameter_min = estimated_diameter_min;
    }


    @JsonProperty("estimated_diameter_max")
    public void setestimated_diameter_max(String estimated_diameter_max) {
        this.estimated_diameter_max = estimated_diameter_max;
    }

    public String getEstimated_diameter_max() {
        return estimated_diameter_max;
    }

    public String getEstimated_diameter_min() {
        return estimated_diameter_min;
    }
}
