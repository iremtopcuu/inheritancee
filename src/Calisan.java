public class Calisan {
protected String name,eposta;
protected int telefon;

Calisan(String name,String eposta,int telefon){
    this.name=name;
    this.eposta=eposta;
    this.telefon=telefon;
}

public String getName(){
    return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String giris(){
     return this.name + "adlı çalışan giriş yaptı";
}










}
