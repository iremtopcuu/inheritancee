public class Guvenlik extends Memurlar {
    protected int nobetsaati;

    Guvenlik(String name, String eposta, int telefon, String department, int nobetsaati) {
        super(name, eposta, telefon, department);
        this.nobetsaati = nobetsaati;
    }

    public int getNobetsaati() {
     return nobetsaati;
    }

    public void setNobetsaati(int nobetsaati) {
        this.nobetsaati = nobetsaati;
    }
}












