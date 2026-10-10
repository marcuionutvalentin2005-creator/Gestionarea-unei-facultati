package Persoane.Persoana;

public abstract class Persoana {
    private String nume;
    private String CNP;
    private String mail;
    private int identificationNumber;

    public Persoana(String nume, int identificationNumber, String mail, String CNP) {
        this.nume = nume;
        this.identificationNumber = identificationNumber;
        this.mail = mail;
        this.CNP = CNP;
    }

    public String getNume() {
        return nume;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public String getMail() {
        return mail;
    }

    public String getCNP() {
        return CNP;
    }
}
