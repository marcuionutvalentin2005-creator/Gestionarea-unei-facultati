package Note;

public class Creditele implements Credite{
    private int credite;

    public Creditele(int credite) {
        this.credite = credite;
    }
@Override
    public int getCredite() {
        return credite;
    }
@Override
    public void setCredite(int credite) {
        this.credite = credite;
    }
}
