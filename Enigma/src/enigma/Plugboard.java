/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enigma;

import java.util.*;

/**
 *
 * @author Daniel
 */
class Plugboard {
    private Map<Character, Character> connections = new HashMap();
    private int maxSize;
    private int currentSize;
    
    public Plugboard(){
        maxSize=13;
        currentSize=0;
    }
    
    
    // Input letters get added to hashmap as keys with their opposite as values
    public void addConnection(char letter1, char letter2){
        if(connections.containsKey(letter1)){
            System.out.println(letter1 +" and "+letter2 +" are already connected!");
            return;
        }
        if(currentSize<maxSize){
            connections.put(letter1, letter2);
            connections.put(letter2, letter1);            
        }

        currentSize++;
    }
    
    // Checks if input is connected to another value and if so returns that value, otherwise returns original input
    public char encrypt(char input){
        return connections.getOrDefault(input, input);
    }
}
