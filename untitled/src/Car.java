/**
 * Created by Nixan on 01.03.2018.
 */
public class Car {
    private Coordonate coordonate;
    private int rides;
    private String ridesString;

    public Car(Coordonate coordonate, int rides, String ridesString) {
        this.coordonate = coordonate;
        this.rides = rides;
        this.ridesString = ridesString;
    }

    public Coordonate getCoordonate() {
        return coordonate;
    }

    public void setCoordonate(Coordonate coordonate) {
        this.coordonate = coordonate;
    }

    public int getRides() {
        return rides;
    }

    public void setRides(int rides) {
        this.rides = rides;
    }

    public String getRidesString() {
        return ridesString;
    }

    public void setRidesString(String ridesString) {
        this.ridesString = ridesString;
    }
}
