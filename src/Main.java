public class Main {
    public static void main(String[] args) {
Akademisyen a= new Akademisyen("İREM","i@gmail",55555,"software","student","seng211");
Memurlar m= new Memurlar("ceren","i@gmail",5555,"software");
Guvenlik g= new Guvenlik("aysel","i@gmail",5555,"software",8);
System.out.println(a.getName()+ " " + a.getTelefon() );
System.out.println(g.giris());
System.out.println(a.giris());
a.dersegir();
    }
}