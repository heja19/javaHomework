public class Aine {

    public String kood;
    public String nimetus;
    private int ainepunktideArv;

    public Aine(String kood, String nimetus, Integer ainepunktigeArv){
        this.kood = kood;
        this.nimetus = nimetus;
        this.ainepunktideArv = ainepunktigeArv;
    }

    public String getKood() {
        return kood;
    }

    public void setKood(String kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public Integer getAinepunktideArv() {
        return ainepunktideArv;
    }

    public void setAinepunktideArv(Integer ainepunktideArv) {
        this.ainepunktideArv = ainepunktideArv;
    }

    @Override //kõrgema klassi asendab (laps teab kõike oma vanema kohta aga vanem lapse kohta midagi ei tea)
    public String toString() {
        return "Aine{" +
                "kood='" + kood + '\'' +
                ", nimetus='" + nimetus + '\'' +
                ", ainepunktideArv=" + ainepunktideArv +
                '}';
    }

    public int labimine(){
        return ainepunktideArv * 8;

    }

} //end of Aine