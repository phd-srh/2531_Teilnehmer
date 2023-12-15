public class Test {
    public static void main(String[] args) {
        Teilnehmer t1 = new Teilnehmer(
                                "Müller", "Heinz", 1994, 2531,
                                "Gartenstraße 17, 69001 Sonnenschein");
        Teilnehmer t2 = new Teilnehmer(
                                "Meyer", "Luise", 1992, 2522,
                                "Blumenstraße 12, 68002 Regenbogen");

        t1.anmelden();
        t2.ummelden(2531);
        System.out.println( t2.notenErmitteln() );
    }
}
