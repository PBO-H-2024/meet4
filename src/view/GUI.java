/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Person;

/**
 *
 * @author Lenovo
 */
public class GUI extends JFrame {
    // text field
    JLabel lname = new JLabel("Full Name :");
    JTextField fname = new JTextField();
    
    // radio button
    JLabel lgender = new JLabel("Gender :");
    JRadioButton rman = new JRadioButton("Man");
    JRadioButton rwoman = new JRadioButton("Woman");
    
    // dropdown
    JLabel lpet = new JLabel("Pet :");
    String[] pet = {"Cat","Dog","Rabbit","Horse"};
    JComboBox cpet = new JComboBox(pet);
    
    // checkbox
    JLabel lhobby = new JLabel("Hobby :");
    JCheckBox cbfootball = new JCheckBox("Football");
    JCheckBox cbbasketball = new JCheckBox("Basketball");
    
    // button
    public JButton bsubmit = new JButton("Submit");
    
    // constructor
    public GUI(){
        setTitle("This is Title");
        setSize(500,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Group the components of Radio Button
        ButtonGroup group = new ButtonGroup();
        group.add(rman);
        group.add(rwoman);
        
        add(lname);
        add(fname);
        add(lgender);
        add(rman);
        add(rwoman);
        add(lpet);
        add(cpet);
        add(lhobby);
        add(cbfootball);
        add(cbbasketball);
        add(bsubmit);
        
        lname.setBounds(10, 10, 120, 20);
        fname.setBounds(130, 10, 150, 20);
        lgender.setBounds(10, 35, 120, 20);
        rman.setBounds(130, 35, 100, 20);
        rwoman.setBounds(230, 35, 100, 20);
        lpet.setBounds(10, 60, 150, 20);
        cpet.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbfootball.setBounds(130, 85, 100, 20);
        cbbasketball.setBounds(230, 85, 150, 20);
        bsubmit.setBounds(100,130,120,20);
    }

    public JLabel getLname() {
        return lname;
    }

    public void setLname(JLabel lname) {
        this.lname = lname;
    }

    public JTextField getFname() {
        return fname;
    }

    public void setFname(JTextField fname) {
        this.fname = fname;
    }

    public JLabel getLgender() {
        return lgender;
    }

    public void setLgender(JLabel lgender) {
        this.lgender = lgender;
    }

    public JRadioButton getRman() {
        return rman;
    }

    public void setRman(JRadioButton rman) {
        this.rman = rman;
    }

    public JRadioButton getRwoman() {
        return rwoman;
    }

    public void setRwoman(JRadioButton rwoman) {
        this.rwoman = rwoman;
    }

    public JLabel getLpet() {
        return lpet;
    }

    public void setLpet(JLabel lpet) {
        this.lpet = lpet;
    }

    public String[] getPet() {
        return pet;
    }

    public void setPet(String[] pet) {
        this.pet = pet;
    }

    public JComboBox getCpet() {
        return cpet;
    }

    public void setCpet(JComboBox cpet) {
        this.cpet = cpet;
    }

    public JLabel getLhobby() {
        return lhobby;
    }

    public void setLhobby(JLabel lhobby) {
        this.lhobby = lhobby;
    }

    public JCheckBox getCbfootball() {
        return cbfootball;
    }

    public void setCbfootball(JCheckBox cbfootball) {
        this.cbfootball = cbfootball;
    }

    public JCheckBox getCbbasketball() {
        return cbbasketball;
    }

    public void setCbbasketball(JCheckBox cbbasketball) {
        this.cbbasketball = cbbasketball;
    }

    public JButton getBsubmit() {
        return bsubmit;
    }

    public void setBsubmit(JButton bsubmit) {
        this.bsubmit = bsubmit;
    }
    
    
}
