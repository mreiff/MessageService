/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messagemanager;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class KeyboardInput implements MessageInput{
    
    private Scanner scan;

    public KeyboardInput(Scanner scan) {
        this.scan = scan;
    }

  
    @Override
    public String readMessage() {
        return scan.nextLine();
    }
    
    
    
}
