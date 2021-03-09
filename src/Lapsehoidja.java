public class Lapsehoidja {
    private int firmasiseneNr;
    private String lapsehoidjaNimi;

    public Lapsehoidja(int firmasiseneNr, String lapsehoidjaNimi) {
        this.firmasiseneNr = firmasiseneNr;
        this.lapsehoidjaNimi = lapsehoidjaNimi;
    }

    public int getFirmasiseneNr() {
        return firmasiseneNr;
    }

    public String getLapsehoidjaNimi() {
        return lapsehoidjaNimi;
    }

    @Override
    public String toString() {
        return firmasiseneNr + " " + lapsehoidjaNimi + "\n";
    }
}
