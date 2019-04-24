package sample;

public class Kontaktperson {

    private String personNavn;
    private String personNummer;
    private String personEmail;
    private String personSide;
    private String personFirma;
    private String personTekst;

    public Kontaktperson(String personNavn, String personNummer, String personEmail, String personSide, String personFirma, String personTekst) {
        this.personNavn = personNavn;
        this.personNummer = personNummer;
        this.personEmail = personEmail;
        this.personSide = personSide;
        this.personFirma = personFirma;
        this.personTekst = personTekst;
    }

    public String getPersonNavn() { return personNavn; }
    public void setPersonNavn(String personNavn) { this.personNavn = personNavn; }
    public String getPersonNummer() { return personNummer; }
    public void setPersonNummer(String personNummer) { this.personNummer = personNummer; }
    public String getPersonEmail() { return personEmail; }
    public void setPersonEmail(String personEmail) { this.personEmail = personEmail; }
    public String getPersonSide() { return personSide; }
    public void setPersonSide(String personSide) { this.personSide = personSide; }
    public String getPersonFirma() { return personFirma; }
    public void setPersonFirma(String personFirma) { this.personFirma = personFirma; }
    public String getPersonTekst() { return personTekst; }
    public void setPersonTekst(String personTekst) { this.personTekst = personTekst; }

    public String toString() {
        return getPersonNavn() + " " +
                getPersonNummer() + " " +
                getPersonEmail()+ " " +
                getPersonSide() + " " +
                getPersonFirma() + " " +
                getPersonTekst() + " " ;

    }

}