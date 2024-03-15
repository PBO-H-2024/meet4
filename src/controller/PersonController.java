/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Person;
import view.GUI;

/**
 *
 * @author Lenovo
 */
public class PersonController {
    GUI personview;
    
    public PersonController (GUI personview){
        this.personview = personview;
        
        personview.bsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullName = personview.getFname().getText();
                String gender = personview.getRman().isSelected() ? "Man" : "Woman";
//                if(rman.isSelected()){
//                    String gender = "Man";
//                }else{
//                    String gender = "Woman";
//                }
                String petSelect = (String) personview.getCpet().getSelectedItem();
                boolean footballSelect = personview.getCbfootball().isSelected();
                boolean basketballSelect = personview.getCbbasketball().isSelected();
                
                Person person = new Person(fullName, gender, petSelect, footballSelect, basketballSelect);
            }
        });
    }
}
