/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Random;

/**
 *
 * @author kumara krishnan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min = 0;
        int max = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * (max - min + 1)) + min);
        }
    }
}
