package ingswoct2019;

import java.util.Random;

public class IngSWoct2019 {
    private static String sms;
    
    public static void enviaMensaje(String sms){
        IngSWoct2019.sms = sms;
    }
    
    public static void recibirMensaje(){
        System.out.println("Mensaje:"+ IngSWoct2019.sms);
    }
    
    public static void main(String[] args) {
        
        Random v =new Random();
        int op;
        String sms="";
        
        op = v.nextInt(3);
     
        if(op==2){
            sms= "Te estoy llamando a tu telefono, por favor atiende";
        }else{
            sms= "Te estoy enviando un mensaje";
        }
        
        IngSWoct2019.enviaMensaje(sms);
        
        IngSWoct2019.recibirMensaje();
        
        
        
    }
    
}
