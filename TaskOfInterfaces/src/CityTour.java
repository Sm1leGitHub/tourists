
public class CityTour implements Tour {
    private String tourName;
    private float tourPrice;
    private String city;

    public CityTour(String tourName, float tourPrice, String city) {
        this.tourName = tourName;
        this.tourPrice = tourPrice;
        this.city = city;
    }

    @Override
    public String getTourName() {
        return tourName;
    }

    @Override
    public Object getTourPrice() {
        return tourPrice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
