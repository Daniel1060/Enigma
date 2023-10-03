/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enigmav2;

/**
 *
 * @author Daniel
 */
class Alphabet {
    private char[] letters;

    public Alphabet() {
        char[] letters ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    }
    
    
    public int charToIndex(char letter){
        return letter-65;
    }
    public char indexToChar(int index){
        return (char) (index+65);
    }
    
}
