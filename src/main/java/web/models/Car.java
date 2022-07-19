package web.models;

public class Car {
    private String model;
    private String series;
    private String country;

    public Car(String model, String series, String country) {
        this.model = model;
        this.series = series;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
