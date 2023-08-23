/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enigma;

/**
 *
 * @author Daniel
 */
class Reflector {
    private char[] wiring;

    public Reflector(char[] wiring) {
        this.wiring = wiring.clone();
    }
    
    public char encrypt(char input){
        int index = input -'A'; 
        return wiring[index];
    }
}
