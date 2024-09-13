import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Reception extends JFrame implements ActionListener{
    JButton newCustomer, rooms, department,allEmployee,ManagerInfo,customer,searchroom,update,roomstatus,pickup,checkout,logout;

    Reception()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        newCustomer = new JButton("New Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.black);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);

         rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.black);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);

        department = new JButton("Department");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.black);
        department.setForeground(Color.WHITE);
        department.addActionListener(this);
        add(department);

        allEmployee = new JButton("All Employees");
        allEmployee.setBounds(10,150,200,30);
        allEmployee.setBackground(Color.black);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.addActionListener(this);
        add(allEmployee);

         customer = new JButton("Customer Info");
        customer.setBounds(10,190,200,30);
        customer.setBackground(Color.black);
        customer.setForeground(Color.WHITE);
        customer.addActionListener(this);
        add(customer);

         ManagerInfo = new JButton("Manager Info");
        ManagerInfo.setBounds(10,230,200,30);
        ManagerInfo.setBackground(Color.black);
        ManagerInfo.setForeground(Color.WHITE);
        ManagerInfo.addActionListener(this);
        add(ManagerInfo);

        
        checkout = new JButton("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.black);
        checkout.setForeground(Color.WHITE);
        checkout.addActionListener(this);
        add(checkout);

         update = new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.black);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);


        roomstatus = new JButton("Update Room Status");
        roomstatus.setBounds(10,350,200,30);
        roomstatus.setBackground(Color.black);
        roomstatus.setForeground(Color.WHITE);
        roomstatus.addActionListener(this);
        add(roomstatus);

        
        pickup = new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.black);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);

        searchroom = new JButton("Search Room");
        searchroom.setBounds(10,430,200,30);
        searchroom.setBackground(Color.black);
        searchroom.setForeground(Color.WHITE);
        searchroom.addActionListener(this);
        add(searchroom);

         logout = new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);

        setBounds(350,200,800,570);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==newCustomer)
        {
            setVisible(false);
            new AddCustomer();
        }
        else if(ae.getSource()==rooms)
        {
            setVisible(false);
            new Room();
        }
        else if(ae.getSource()==department)
        {
            setVisible(false);
            new Department();
        }
        else if(ae.getSource()==allEmployee)
        {
            setVisible(false);
            new Employeeinfo();
        }
        else if(ae.getSource()==ManagerInfo)
        {
            setVisible(false);
            new Managerinfo();
        }
        else if(ae.getSource()==customer)
        {
            setVisible(false);
            new Customerinfo();
        }
        else if(ae.getSource()==searchroom)
        {
            setVisible(false);
            new SearchRoom();
        }
        else if(ae.getSource()==update)
        {
            setVisible(false);
            new UpdateCheck();
        }
        else if(ae.getSource()==roomstatus)
        {
            setVisible(false);
            new UpdateRoom();
        }
        else if(ae.getSource()==pickup)
        {
            setVisible(false);
            new Pickup();
        }
        else if(ae.getSource()==checkout)
        {
            setVisible(false);
            new CheckOut();
        }
        else if(ae.getSource()==logout)
        {
            setVisible(false);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        
        new Reception();
    }

   
    
}
