import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {

        Product ziemniaki=new Product("ziemniaki",2.5,15.99);
        System.out.println(ziemniaki.toString());
        Person person=new Person(Status.Dorosły);
        person.printStatus();
        System.out.print("Hello World");
        ArrayList<Product> products=new ArrayList<Product>();

        PurchaseList pl=new PurchaseList(Event.Kolacja,10,15,2);
        pl.generateList();
        PurchaseList px=new PurchaseList(Event.Obiad,10,15,2);
        px.generateList();
        PurchaseList pa=new PurchaseList(Event.Sniadanie,10,15,2);
        pa.generateList();
        PurchaseList py=new PurchaseList(Event.Uroczysta_kolacja,10,15,2);
        py.generateList();
        PurchaseList pe=new PurchaseList(Event.Rodzinne_Przyjecie,10,15,2);
        pe.generateList();
        pe.readProductsFromFile("C:\\Users\\Admin\\Desktop\\kanpasack.txt");
        pe.printAllAvaiableProducts();

    }
}
