package Admin.InscriereEvaluare;

import Admin.Cautare.CautareCurs;

public class EvaluareaStudentului implements EvaluareStudent{
    CautareCurs curs;

    public EvaluareaStudentului(CautareCurs curs) {
        this.curs = curs;
    }
    @Override
    public void evaluare(String numeCurs,String numeStudent,double nota,int credite)
    {
        if(curs.cautare(numeCurs)!=null)
        {
            curs.cautare(numeCurs).getEvaluare().evaluare(numeStudent,nota,credite);
        }
        else {
            System.out.println("Cursul nu exista");
        }
    }
}
