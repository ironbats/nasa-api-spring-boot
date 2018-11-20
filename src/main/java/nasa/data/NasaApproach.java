package nasa.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NasaApproach {

    private String close_approach_date;
    private long epoch_date_close_approach;
    private NasaVelocity relative_velocity;
    private NasaDistance miss_distance;
    private String orbiting_body;

    @JsonProperty("relative_velocity")
    public void setrelative_velocity(NasaVelocity relative_velocity) {
        this.relative_velocity = relative_velocity;
    }

    @JsonProperty("orbiting_body")
    public void setorbiting_body(String orbiting_body) {
        this.orbiting_body = orbiting_body;
    }

    @JsonProperty("miss_distance")
    public void setmiss_distance(NasaDistance miss_distance) {
        this.miss_distance = miss_distance;
    }

    @JsonProperty("epoch_date_close_approach")
    public void setepoch_date_close_approach(long epoch_date_close_approach) {
        this.epoch_date_close_approach = epoch_date_close_approach;
    }

    @JsonProperty("close_approach_date")
    public void setclose_approach_date(String close_approach_date) {
        this.close_approach_date = close_approach_date;
    }

    public long getEpoch_date_close_approach() {
        return epoch_date_close_approach;
    }

    public NasaDistance getMiss_distance() {
        return miss_distance;
    }

    public NasaVelocity getRelative_velocity() {
        return relative_velocity;
    }

    public String getClose_approach_date() {
        return close_approach_date;
    }

    public String getOrbiting_body() {
        return orbiting_body;
    }

}
