import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainPanel extends JDialog{
    private JTextField kids;
    private JLabel KidsNum;
    private JTextField teens;
    private JTextField adults;
    private JLabel TeenNum;
    private JLabel AdultsNum;
    private JComboBox comboBox1;
    private JLabel EventName;
    private JButton generateButton;
    private JList listProducts;
    private JPanel panel1;
    private JList list1;
    private JButton dodajDoProduktówButton;
    private PurchaseList purchaselist;
    private Event event=Event.Kolacja;
    private DefaultListModel model;
    private DefaultListModel model2;


    public MainPanel() throws IOException {
        init();
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int Nkids=Integer.parseInt(kids.getText());
                int Nteens=Integer.parseInt(teens.getText());
                int Nadults=Integer.parseInt(adults.getText());
                if(comboBox1.getSelectedIndex()==0)
                    event=Event.Rodzinne_Przyjecie;
                else if(comboBox1.getSelectedIndex()==1)
                    event=Event.Kolacja;
                else if(comboBox1.getSelectedIndex()==2)
                    event=Event.Obiad;
                else if(comboBox1.getSelectedIndex()==3)
                    event=Event.Sniadanie;
                else if(comboBox1.getSelectedIndex()==4)
                    event=Event.Uroczysta_kolacja;

                purchaselist=new PurchaseList(event,Nkids,Nteens,Nadults);

                purchaselist.generateList();
                purchaselist.printAllproducts();
                DefaultListModel model = new DefaultListModel();
                for(int i=0;i<purchaselist.getProducts().size();i++)
                    model.addElement(purchaselist.getProducts().get(i).toString());
                listProducts.setModel(model);
                listProducts.updateUI();

            }
        });

        dodajDoProduktówButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("aaaaa");
                String itemtoAdd=list1.getSelectedValue().toString();
                System.out.println(list1.getSelectedIndex());
                //purchaselist.getProducts().add(itemtoAdd);
                //model.addElement(itemtoAdd);
                model.addElement(itemtoAdd);
                listProducts.setModel(model);
                listProducts.updateUI();


            }
        });

        setContentPane(panel1);
        setModal(true);
        this.pack();
        this.setVisible(true);
    }
    private void init() throws IOException {
        purchaselist=new PurchaseList(Event.Rodzinne_Przyjecie,0,0,0);
        purchaselist.readProductsFromFile("C:\\Users\\Admin\\Desktop\\kanpasack.txt");
        model2 = new DefaultListModel();
        model = new DefaultListModel();
        for(int i=0;i<purchaselist.getAvaiableProducts().size();i++)
            model2.addElement(purchaselist.getAvaiableProducts().get(i).toString());
        list1.setModel(model2);

        comboBox1.addItem(Event.Rodzinne_Przyjecie);
        comboBox1.addItem(Event.Kolacja);
        comboBox1.addItem(Event.Obiad);
        comboBox1.addItem(Event.Sniadanie);
        comboBox1.addItem(Event.Uroczysta_kolacja);
        listProducts.setModel(model);

    }

}
