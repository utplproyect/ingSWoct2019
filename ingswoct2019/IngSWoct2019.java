package ingswoct2019;

public class IngSWoct2019 {
    private static String sms;
    
    public static void enviaMensaje(String sms){
        IngSWoct20191.sms = sms;
    }
    
    public static void recibirMensaje(){
        System.out.println("Mensaje:"+ IngSWoct20191.sms);
    }
    
    public static void main(String[] args) {
     
        String sms= "Te estoy enviando un mensaje";
        
        IngSWoct20191.enviaMensaje(sms);
        
        IngSWoct20191.recibirMensaje();
        
        
        
    }
    
}
