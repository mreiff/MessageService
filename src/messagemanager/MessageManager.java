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
public class MessageManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Memory memory = new Memory();
        Scanner keyboard = new Scanner(System.in);
        
        MessageInput memInput = new MemoryInput(memory);
        MessageOutput memOutput = new MemoryOutput(memory);
        
        MessageInput keyInput = new KeyboardInput(keyboard);
        MessageOutput conOutput = new ConsoleOutput();
        
        memOutput.writeMessage("This is a memory test.");
        conOutput.writeMessage(memInput.readMessage());
        
        conOutput.writeMessage("Use the keyboard.");
        
        memOutput.writeMessage(keyInput.readMessage());
        conOutput.writeMessage(memInput.readMessage());
    }
    
}
