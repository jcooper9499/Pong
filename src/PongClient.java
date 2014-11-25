/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import pong.PongGUI;      // import PongGUI to creage a PongGUI object
import java.awt.Graphics;

/**
 *
 * @author Jordan, Garfield, Jacob
 */
public class PongClient
{
    private int canvasWidth, canvasHeight;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        PongGUI pong = new PongGUI();
        pong.setVisible(true);
    }
}
