/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enigmav2;

/**
 *
 * @author Daniel
 */
class Rotor {
    private char[] wiring;
    private int position;
    private char[] notch;
    private boolean turnover;

    public Rotor(char[] wiring, int position) {
        this.wiring = wiring;
        this.position = position;
        turnover = false;
    }
    
    public void setInputPosition(char inputLetter){
        position = inputLetter -'A';
    }
    public void setOutputPosition(char outputLetter){
        int desiredPosition = outputLetter -'A';
        
        for (int i=0; i<wiring.length; i++){
            if(wiring[i]==desiredPosition){
                position =i;
                break;
            }
        }
    }

    public void rotate(){
        if(position == wiring.length-1){
            position=0;
        }else{
            position++;
        }
    }

    public char encryptForward(char input){
        return (char)(wiring[charToIndex(input)]);
    }
    public char encryptBackward(char input){
        for(int i=0; i<wiring.length;i++){
            if(wiring[i]==input){
                return(char)(indexToChar(i));
            }
        }
        return '?';
    }

    public int charToIndex(char letter){
        return letter-65;
    }
    public char indexToChar(int index){
        return (char) (index+65);
    }
    
    public char getCurrentLetter(){
        return (char) (position+'A');
    }
    
    
    

    
}
