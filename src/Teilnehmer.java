public class Teilnehmer {
    public String name;
    public String vorname;
    public int geburtsjahr;
    public int kursnummer;
    public String adresse;

    // Diese Klasse braucht einen Standard Konstruktor !!
    public Teilnehmer(String teilnehmerName,
                      String teilnehmerVorname,
                      int teilnehmerGeburtsjahr,
                      int teilnehmerKursnummer,
                      String teilnehmerAdresse) {
        name = teilnehmerName;
        vorname = teilnehmerVorname;
        geburtsjahr = teilnehmerGeburtsjahr;
        kursnummer = teilnehmerKursnummer;
        adresse = teilnehmerAdresse;
    }

    public void anmelden() {
        System.out.println(vorname + " " + name +
                " hat sich angemeldet");
    }

    public void abmelden() {
        System.out.println(vorname + " " + name +
                " hat sich abgemeldet");
    }

    public boolean ummelden(int neuerKurs) {
        if (kursIstSchonVoll(neuerKurs))
            return false;
        kursnummer = neuerKurs;
        return true;
    }

    private boolean kursIstSchonVoll(int neuerKurs) {
        // nur ein Dummy zum Testen
        return false;
    }

    public double notenErmitteln() {
        return Math.round( 10*(Math.random() * 5 + 1)) / 10.0;
    }
}
