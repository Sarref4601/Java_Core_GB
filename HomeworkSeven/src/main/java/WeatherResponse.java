import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @JsonProperty("LocalObservationDateTime")
    private String localObservationDateTime;
    @JsonProperty
    private Integer epochTime;
    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty
    private String link;
    @JsonIgnore
    private String city;

    @JsonProperty("LocalObservationDateTime")
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    @JsonProperty("LocalObservationDateTime")
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    @JsonProperty
    public Integer getEpochTime() {
        return epochTime;
    }

    @JsonProperty
    public void setEpochTime(Integer epochTime) {
        this.epochTime = epochTime;
    }

    @JsonProperty("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }

    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty
    public String getLink() {
        return link;
    }

    @JsonProperty
    public void setLink(String link) {
        this.link = link;
    }

    @JsonIgnore
    public String getCity() {
        return city;
    }

    @JsonIgnore
    public void setCity(String city) {
        this.city = city;
    }

   public WeatherResponse(){

    }
}

