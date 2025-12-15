public class Akademisyen extends Calisan {
    String bolum,gorev,ders;

    Akademisyen(String name,String eposta,int telefon,String bolum,String gorev,String ders){
        super(name, eposta, telefon);
        this.bolum=bolum;
        this.gorev=gorev;
        this.ders=ders;
    }
    public String getBolum(){
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGorev(){
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
public String getDers(){
        return ders;
}

    public void setDers(String ders) {
        this.ders = ders;
    }

    public void dersegir() {
        {
            System.out.println("derse girildi");
        }
    }



}
