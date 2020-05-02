public class Main {

    public static void main(String[] args) {
        //Get
        Aine oop = new Aine("RT – 016", "Objektorienteeritud programmeerimine", 5);
        System.out.println(oop.getKood());
        System.out.println(oop.getNimetus());
        System.out.println(oop.getAinepunktideArv());

        System.out.println(String.format("Õppeaine Java objektorienteeritud programmeermine läbimiseks kulub %d tundi.", oop.labimine()));

        System.out.println();

        //Set
        //Suhtlemispsühholoogia
        oop.setKood("RT-004");
        oop.setNimetus("Suhtlemispsühholoogia");
        oop.setAinepunktideArv(4);
        System.out.println(String.format("Õppeaine on muudetud: " + oop));
        System.out.println(String.format("Selle aine läbimiseks kulub: %d", oop.labimine()));


        //Konstruktori ja meetodite kasutamine test-klassis
        //Koostöömudelid
        Aine Koostoomudelid = new Aine("RT-003", "Koostöömudelid", 2);
        Aine[] RTained = {Koostoomudelid, oop};
        Oppekava robootikaTarkvara = new Oppekava("RT - VIL", RTained);
        System.out.println(robootikaTarkvara.toString());


    }
} // end of Main
