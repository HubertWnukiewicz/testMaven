import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PurchaseList {

    private Event event;
    private ArrayList<Product> products;
    private ArrayList<Product> avaiableProducts;
    private int toddlers;
    private int kids;
    private int adults;

    public PurchaseList(Event event, int toddlers, int kids, int adults) {
        this.event = event;
        this.toddlers = toddlers;
        this.kids = kids;
        this.adults = adults;
        products=new ArrayList<Product>();
        avaiableProducts=new ArrayList<Product>();
    }

    public Event getEvent() {
        return event;
    }

    public ArrayList<Product> getAvaiableProducts() {
        return avaiableProducts;
    }

    public void setAvaiableProducts(ArrayList<Product> avaiableProducts) {
        this.avaiableProducts = avaiableProducts;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getToddlers() {
        return toddlers;
    }

    public void setToddlers(int toddlers) {
        this.toddlers = toddlers;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public ArrayList<Product> generateList() {
        if(this.event.equals(Event.Kolacja)){
            products.add(new Product("Ser", (0.1*toddlers+0.1*kids+0.6*adults+0.1),(0.1*toddlers+0.1*kids+0.2*adults+0.1)*7.15));
            products.add(new Product("Wedlina",0.1*toddlers+0.2*kids+0.3*adults+0.1,(0.1*toddlers+0.2*kids+0.3*adults+0.1)*5.17));
            products.add(new Product("Bulki",(int)(2+toddlers+0.5*kids+0.6*adults),(int)(2*toddlers+0.5*kids+0.6*adults+0.7)*0.99));
            products.add(new Product("Parowki(4-sztuki)",(int)(1+(toddlers+kids)*0.2+0.3*adults),(int)(1+(toddlers+kids)*0.2+0.3*adults)*2.87));
            products.add(new Product("Sok grejfrutowy",(int)(1+(toddlers+kids)*0.3+0.15*adults),(int)(1+(toddlers+kids)*0.3+0.15*adults)*4.87));
        }else if(this.event.equals(Event.Obiad)){
            products.add(new Product("Ziemniaki", 0.2*toddlers+0.3*kids+0.4*adults+0.3,(0.2*toddlers+0.3*kids+0.4*adults+0.3)*1.79));
            products.add(new Product("Ogorki",0.1*toddlers+0.2*kids+0.4*adults+0.15,(0.1*toddlers+0.2*kids+0.4*adults+0.15)*6.29));
            products.add(new Product("Schab",(0.2+toddlers*0.1+0.15*kids+0.25*adults),(0.2+toddlers*0.1+0.15*kids+0.25*adults)*15.23));
            products.add(new Product("Cebula",(0.1+toddlers*0.15+0.18*kids+0.23*adults),(0.1+toddlers*0.15+0.18*kids+0.23*adults)*3.23));
            products.add(new Product("Smietana",(int)(1+(toddlers+kids+adults)*0.2),(int)(1+(toddlers+kids+adults)*0.2)*4.05));
        }else if(this.event.equals(Event.Rodzinne_Przyjecie)){
            products.add(new Product("Paluszki", (int)(1+0.1*toddlers+0.12*kids+0.25*adults),(int)(1+0.1*toddlers+0.12*kids+0.25*adults)*3.99));
            products.add(new Product("Ciastka",0.3+0.2*kids+0.2*adults,(0.3+0.2*kids+0.2*adults)*3.45));
            products.add(new Product("Owoce",(0.5+0.2*toddlers+0.35*kids+0.40*adults),(0.5+0.2*toddlers+0.35*kids+0.40*adults)*4.99));
            products.add(new Product("Cola",(int)(1+kids*0.4+0.3*adults),(int)(1+kids*0.4+0.3*adults)*5.00));
            products.add(new Product("Sok pomaranczowy",(int)(1+toddlers*0.3+0.2*adults),(int)(1+toddlers*0.3+0.2*adults*6.12)));
        }else if(this.event.equals(Event.Uroczysta_kolacja)){
            products.add(new Product("Wino", (int)(1+0.6*adults),(int)(1+0.6*adults)*39.99));
            products.add(new Product("Wolowina",0.1*toddlers+0.2*kids+0.3*adults+0.1,(0.1*toddlers+0.2*kids+0.3*adults+0.1)*5.17));
            products.add(new Product("Pieczarki",(0.2*toddlers+0.1*kids+0.2*adults+0.3),(0.2*toddlers+0.1*kids+0.2*adults+0.3)*1.99));
            products.add(new Product("Makaron",(int)(1+0.3*toddlers+kids*0.4+0.7*adults),(int)(1+0.3*toddlers+kids*0.4+0.7*adults)*3.28));
            products.add(new Product("Sok jablkowy",(int)(1+toddlers*0.35+0.55*kids),(int)(1+toddlers*0.35+0.55*kids)*3.99));
        }else if(this.event.equals(Event.Sniadanie)){
            products.add(new Product("Jajka", (int)(0.5*toddlers+kids+1.5*adults+2),(int)(0.5*toddlers+kids+1.5*adults+2)*0.89));
            products.add(new Product("Chleb",(int)(1+0.15*adults+(kids+toddlers)*0.10),(int)(1+0.15*adults+(kids+toddlers)*0.10)*3.38));
            products.add(new Product("Cebula",(0.1+toddlers*0.15+0.18*kids+0.23*adults),(0.1+toddlers*0.15+0.18*kids+0.23*adults)*3.23));
            products.add(new Product("Pomidor",(0.25+toddlers*0.1+0.2*kids+0.3*adults),(0.25+toddlers*0.1+0.2*kids+0.3*adults)*2.18));
            products.add(new Product("Boczek",(0.28+toddlers*0.10+0.18*kids+0.21*adults),(0.28+toddlers*0.10+0.18*kids+0.21*adults)*6.74));
        }

        return products;
    }
    public void addProductToCatalog(Product product){
        avaiableProducts.add(product);
    }
    public void readProductsFromFile(String path) throws IOException {

        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String name="";
        double weight=0;
        double value=0;
        String line;

        int i = 0;
        int id = 0;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            if (i % 3 == 0) {
                name = line;
                i++;
            } else if (i % 3 == 1) {
                weight = Double.parseDouble(line);
                i++;
            } else if (i % 3 == 2) {
                value = Double.parseDouble(line);
                i++;
            }

            if (!name.trim().equals("") && weight>0 && value>0 ) {
                System.out.println("x");
                Product product = new Product(name,weight,value);
                addProductToCatalog(product);
                name = "";
                weight=0;
                value =0;

            }

        }

    }
    public void printAllproducts(){
        for(Product x:products)
        {
            System.out.println(x.toString());
        }
    }
    public void printAllAvaiableProducts(){
        for(Product x:avaiableProducts)
        {
            System.out.println(x.toString());
        }
    }
}
