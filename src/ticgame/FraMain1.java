/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticgame;

import javax.swing.JFrame;

public class FraMain1 extends JFrame {

    FraMain1() {
        PanMain1 panMain1 = new PanMain1();
        setSize(800, 800);
        setTitle("X&O's");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain1);
        setVisible(true);

    }
}