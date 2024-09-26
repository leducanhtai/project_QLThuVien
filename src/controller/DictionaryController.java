package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DictionaryView;

public class DictionaryController implements ActionListener{
    private DictionaryView dictionaryView;


    public DictionaryController(DictionaryView dictionaryView) {
        this.dictionaryView = dictionaryView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String src = e.getActionCommand();
        if(src.equals("Exit")) {
            System.exit(0);
        }else if(src.equals("Borrow")) {
            this.dictionaryView.selectBorrow();
            System.out.println("đã ấn borrow");
        }else if(src.equals("Return")) {
            this.dictionaryView.selectReturn();
            System.out.println("đã ấn return");
        }else if(src.equals("Home")) {
            this.dictionaryView.selectHome();
            System.out.println("đã ấn home");
        }else if(src.equals("Help")) {
            this.dictionaryView.selectHelp();
            System.out.println("đã ấn help");
        }else if(src.equals("Admin")) {
            this.dictionaryView.selectAdmin();
            System.out.println("đã ấn admin");
        }


    }

}