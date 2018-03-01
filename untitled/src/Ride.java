/**
 * Created by Nixan on 01.03.2018.
 */
public class Ride {
    private Coordonate initial;
    private Coordonate cfinal;
    private int start;
    private int finish;



    public Ride(Coordonate initial, Coordonate cfinal, int start, int finish) {
        this.initial = initial;
        this.cfinal = cfinal;
        this.start = start;
        this.finish = finish;
    }

    public Coordonate getInitial() {
        return initial;
    }

    public void setInitial(Coordonate initial) {
        this.initial = initial;
    }

    public Coordonate getCfinal() {
        return cfinal;
    }

    public void setCfinal(Coordonate cfinal) {
        this.cfinal = cfinal;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }
}
