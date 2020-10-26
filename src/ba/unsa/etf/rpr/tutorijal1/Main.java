package ba.unsa.etf.rpr.tutorijal1;

public class Main {

    public static void main(String[] args) {
    Sat vrijeme = new Sat(15, 30, 45);
    vrijeme.ispisi();
    vrijeme.sljedeci();
    vrijeme.ispisi();
    vrijeme.pomjeriZa(-48);
    vrijeme.ispisi();
    vrijeme.postavi(0,0,0);
    vrijeme.ispisi();
    }
}
