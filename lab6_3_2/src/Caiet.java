public class Caiet extends Rechizita {
    String getNume() {
        return super.getNume() + "Caiet";
    }

    @Override
    public String toString() {
        return this.getNume();
    }
}
