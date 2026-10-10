package Persoane.Persoana;



import java.util.ArrayList;
import java.util.List;

public class ListaPersoanelor implements ListaPersoane{
    private List<Persoana> persoane;

    public ListaPersoanelor() {
        this.persoane= new ArrayList<>();
    }
    @Override
    public List<Persoana> getPersoane() {
        return persoane;
    }
}
