public class Asistan extends Akademisyen{
    protected String yukseklisans;

    Asistan(String name,String eposta,int telefon,String bolum,String gorev,String ders,String yukseklisans){
        super(name, eposta, telefon, bolum, gorev, ders);
        this.yukseklisans=yukseklisans;
    }
public String getYukseklisans(){
        return yukseklisans;
}
public void setYukseklisans(String yukseklisans){
        this.yukseklisans=yukseklisans;
}
}
