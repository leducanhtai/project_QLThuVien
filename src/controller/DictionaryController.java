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
        }else if(src.equals("Game")) {
            this.dictionaryView.runGame();
            System.out.println("đã ấn game");
        }else if(src.equals("Home")) {
            this.dictionaryView.selectHome();
            System.out.println("đã ấn home");
        }


    }

}