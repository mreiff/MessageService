/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messagemanager;

/**
 *
 * @author Chris
 */
public class MemoryOutput implements MessageOutput{
    
    private Memory memory;

    public MemoryOutput(Memory memory) {
        this.memory = memory;
    }
    
    @Override
    public void writeMessage(String message){
        memory.setMemory(message);
        System.out.println("WROTE: " + message);
    }
}
