package com.mycompany.enigmav2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        char[] rotorWiring = {'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'};
        Rotor rotor = new Rotor(rotorWiring,0);
        
        System.out.println(rotor.encryptForward('A'));
        System.out.println(rotor.encryptBackward('E'));
        System.out.println(rotor.encryptForward('Z'));
        System.out.println(rotor.encryptBackward('0'));
        
        /*
        //char[] wiring = {'E','N','K','Q','A','U','Y','W','J','I','C','O','P','B','L','M','D','X','Z','V','F','T','H','R','G','S'};
        //Reflector reflector = new Reflector(wiring);
        
        System.out.println(reflector.encrypt('A'));
        System.out.println(reflector.encrypt('Z'));
        */
        /*
        Plugboard unit tests
        
        Plugboard plugboard = new Plugboard();
        
        plugboard.addConnection('A', 'B');
        plugboard.addConnection('C', 'D');
        plugboard.addConnection('E', 'F');
        plugboard.addConnection('E', 'F');
        
        
        System.out.println(plugboard.encrypt('B'));
        System.out.println(plugboard.encrypt('E'));
        System.out.println(plugboard.encrypt('D'));
        System.out.println(plugboard.encrypt('Z'));
        System.out.println(plugboard.encrypt('1'));
        */
        
        /*
        Alphabet Unit Test
        
        Alphabet alpha = new Alphabet();
       
        System.out.println(alpha.charToIndex('A'));
        System.out.println(alpha.charToIndex('Z'));
        System.out.println(alpha.indexToChar(0));
        System.out.println(alpha.indexToChar(25));
        */
    }
    
    
}
