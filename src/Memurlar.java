public class Memurlar extends Calisan {
    protected String department;

    Memurlar(String name,String eposta,int telefon,String department){
        super(name, eposta, telefon);
        this.department=department;

    } public String giris() {
        return this.name + " adlı çalısan A kapısından giriş yapmıştır";
    }
public String getDepartment(){
        return department;
}
public void setDepartment(String department){
        this.department=department;
}
}
