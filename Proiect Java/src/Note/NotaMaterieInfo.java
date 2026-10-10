package Note;

public class NotaMaterieInfo implements NotaMaterie {
    Nota nota;
    Credite credite;
    public NotaMaterieInfo() {
        this.nota = null;
        this.credite=null;
    }

    @Override
    public Nota getNota() {
        return nota;
    }
@Override
    public Credite getCredite() {
        return credite;
    }

    @Override
    public void setNota(Nota nota) {
        this.nota = nota;
    }
@Override
    public void setCredite(Credite credite) {
        this.credite = credite;
    }
}
