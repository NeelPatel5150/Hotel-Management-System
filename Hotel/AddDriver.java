import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AddDriver extends JFrame implements ActionListener{
   
    JButton add,cancel;
    JTextField tfname , tfcompany,tfage,tfmodel,tflocation;
    JComboBox typecombo , availablecombo,agecombo,gendercombo;
    AddDriver()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Add Drivers");
        heading.setFont(new Font("Tahoma",Font.BOLD,18));
        heading.setBounds(194,10,120,22);
        add(heading);

        JLabel lblroomno = new JLabel("Name");
        lblroomno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblroomno.setBounds(64,70,102,22);
        add(lblroomno);

         tfname = new JTextField();
        tfname.setBounds(174,70,156,20);
        add(tfname);

        JLabel lblage = new JLabel("Age");
        lblage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblage.setBounds(64,110,102,22);
        add(lblage);

        tfage = new JTextField();
        tfage.setBounds(174,110,156,20);
        add(tfage);

        JLabel lblclean = new JLabel("Gender");
        lblclean.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblclean.setBounds(64,150,102,22);
        add(lblclean);

        String ageOptions[] = {"Male","Female"};
         gendercombo = new JComboBox<>(ageOptions);
         gendercombo.setBounds(176,150,154,20);
         gendercombo.setBackground(Color.white);
        add(gendercombo);

        JLabel lblprice = new JLabel("Car Company");
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblprice.setBounds(64,190,102,22);
        add(lblprice);

         tfcompany = new JTextField();
        tfcompany.setBounds(174,190,156,20);
        add(tfcompany);

        JLabel lbltype = new JLabel("Car Model");
        lbltype.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbltype.setBounds(64,230,102,22);
        add(lbltype);

        tfmodel = new JTextField();
        tfmodel.setBounds(174,230,156,20);
        add(tfmodel);

        JLabel lblavailable = new JLabel("Available");
        lblavailable.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblavailable.setBounds(64,270,102,22);
        add(lblavailable);

        String driverOptions[] = {"Available","Busy"};
        availablecombo = new JComboBox<>(driverOptions);
        availablecombo.setBounds(176,270,154,20);
        availablecombo.setBackground(Color.white);
       add(availablecombo);

       JLabel lbllocation = new JLabel("Location");
       lbllocation.setFont(new Font("Tahoma",Font.PLAIN,16));
       lbllocation.setBounds(64,310,102,22);
        add(lbllocation);

        tflocation = new JTextField();
        tflocation.setBounds(174,310,156,20);
        add(tflocation);

         add= new JButton("Add Driver");
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.setBounds(60,370,130,30);
        add.addActionListener(this);
        add(add);

         cancel= new JButton("Cancel");
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        cancel.setBounds(220,370,130,30);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,30,500,300);
        add(image);

        setBounds(300,200,980,470);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     if(ae.getSource() == add)
     {
        String name =tfname.getText();
        String age = tfage.getText();
        String gender = (String) gendercombo.getSelectedItem();
        String company = tfcompany.getText();
        String brand = tfmodel.getText();
        String available = (String) availablecombo.getSelectedItem();
        String location = tflocation.getText();

        try{
            Conn conn = new Conn();
            String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";

            conn.s.executeUpdate(str);

            JOptionPane.showMessageDialog(null, "New Driver Added Succesfully");

            setVisible(false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }  
     else{
        setVisible(false);
     }
    }

    public static void main(String[] args) {
        new AddDriver();
    }

   
    
}
