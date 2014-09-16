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
public class MemoryInput implements MessageInput{
    
    private Memory memory;

    public MemoryInput(Memory memory) {
        this.memory = memory;
    }
    
    @Override
    public String readMessage(){
        return memory.getMemory();
    }
}
