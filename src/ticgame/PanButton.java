package ticgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanButton extends JPanel // panel definition
{

    PanMain1 panMain1;
    public static JButton[][] Jbuttons = new JButton[3][3];
    public static JButton Jstart;              //Create start/reset buttons for game
    public static JButton Jreset;

    public PanButton(PanMain1 _panMain1) {
        ActionListener clickTestListener = new ClickTestListener();
        Jstart.addActionListener((ActionListener) clickTestListener);
        Jreset.addActionListener((ActionListener) clickTestListener);

        panMain1 = _panMain1;
        Jstart = PanMain1.Jstart;
        Jreset = PanMain1.Jreset;

        add(Jstart);
        add(Jreset);
        for (int i = 0; i < 3; i++) //Create grid of buttons for tic tac toe game
        {
            for (int j = 0; j < 3; j++) {

                Jbuttons[i][j] = new JButton();                //Instantiating buttons 
                Jbuttons[i][j].setText("HI");
                Jbuttons[i][j].setVisible(true);

                add(Jbuttons[i][j]);

                Jbuttons[i][j].addActionListener((ActionListener) clickTestListener); //Adding response event to buttons
            }
        }

    }

  

    class ClickTestListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            JButton Jreset = (JButton) event.getSource();
            JButton JStart = (JButton) event.getSource();

        }

    }

}
