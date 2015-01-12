package ticgame;

import javax.swing.*;
import java.awt.*;

public class PanMain1 extends JPanel // panel definition
{

    PanMenu panMenu = new PanMenu();
    PanButton panButton = new PanButton();
    PanGame panGame = new PanGame();
    public static JButton Jstart = new JButton("Start");              //Create start/reset buttons for game
    public static JButton Jreset = new JButton("Reset");

    public PanMain1() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        //Add two panels to the main container panel             
        add(panButton, BorderLayout.SOUTH);
        add(panGame, BorderLayout.NORTH);
        add(Jstart, BorderLayout.WEST);                //Add both start/reset buttons to menu container panel
        add(Jreset, BorderLayout.EAST);

       
    }
}
