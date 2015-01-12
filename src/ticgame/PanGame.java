/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticgame;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import static ticgame.PanButton.Jbuttons;

public class PanGame extends JFrame {

    PanButton panButton;
    public static JButton Jstart;              //Create start/reset buttons for game
    public static JButton Jreset;
    public static JButton JButtons[][];
    JOptionPane turn;
    int moveCounter = 9;
    boolean gameWon = false;

    public PanGame(PanButton _panButton) {
        panButton = _panButton;
        JButtons = PanButton.Jbuttons;
        Jstart = PanMain1.Jstart;
        Jreset = PanMain1.Jreset;

    }

    PanGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //PanGame() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    private void checkWin(int row, int col) {
        if (JButtons[row][1].getText().equals(JButtons[row][2].getText()) && JButtons[row][0].getText().equals(JButtons[row][1].getText())) {
            gameWon = true;
            System.out.println(JButtons[row][0].getText() + " wins!!!");
        } else if (JButtons[row][0].getText().equals(JButtons[row][1].getText()) && JButtons[row][1].getText().equals(JButtons[row][2].getText())) {
            gameWon = true;
            System.out.println(JButtons[row][0].getText() + " wins!!!");
        }
    }

    private void compTurn(int count) {
        int randomMove = count;
        Random num = new Random();
        randomMove = num.nextInt(randomMove) + 1;

        while (gameWon == false) {
            for (int i = 0; i < 3; i++) //Create grid of buttons for tic tac toe game
            {
                for (int j = 0; j < 3; j++) {
                    if (JButtons[i][j].isEnabled() == true) {
                        randomMove--;

                        if (randomMove == 0) {
                            JButtons[i][j].setText("O");
                            JButtons[i][j].setEnabled(false);
                            moveCounter--;
                            checkWin(i, j);
                        }
                    }

                }
            }
        }
    }

    private class myActionListener implements ActionListener {      //Implementing action listener for buttons

        @Override
        public void actionPerformed(ActionEvent a) {
            //Display X's or O's on the buttons  
            if (a.getSource() == JButtons[0][0]) //Checking which button is pressed
            {
                JButtons[0][0].setText("X");
                JButtons[0][0].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(0, 0);
            } else if (a.getSource() == JButtons[0][1]) {
                JButtons[0][1].setText("X");
                JButtons[0][1].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(0, 1);
            } else if (a.getSource() == JButtons[1][0]) {
                JButtons[1][0].setText("X");
                JButtons[1][0].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(1, 0);
            } else if (a.getSource() == JButtons[1][1]) {
                JButtons[1][1].setText("X");
                JButtons[1][1].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(1, 1);
            } else if (a.getSource() == JButtons[1][2]) {
                JButtons[1][2].setText("X");
                JButtons[1][2].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(1, 2);
            } else if (a.getSource() == JButtons[2][2]) {
                JButtons[2][2].setText("X");
                JButtons[2][2].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(2, 2);
            } else if (a.getSource() == JButtons[0][2]) {
                JButtons[0][2].setText("X");
                JButtons[0][2].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(0, 2);
            } else if (a.getSource() == JButtons[2][1]) {
                JButtons[2][1].setText("X");
                JButtons[2][1].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(2, 1);
            } else if (a.getSource() == JButtons[2][0]) {
                JButtons[2][0].setText("X");
                JButtons[2][0].setEnabled(false);
                moveCounter--;
                compTurn(moveCounter);
                checkWin(2, 0);
            } else if (a.getSource() == Jstart) {
                turn = new JOptionPane("Do you want to go first?\n", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
                Jstart.setEnabled(false);
            } else if (a.getSource() == Jreset) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        Jbuttons[i][j].setText("");
                        Jbuttons[i][j].setEnabled(true);
                        gameWon = false;
                    }
                }
            }
        }
    }

}
