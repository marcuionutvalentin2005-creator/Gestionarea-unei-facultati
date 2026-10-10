package Note;

public class NotaInfo implements Nota {
    private double nota;

    public NotaInfo(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
