package com.cebem.transformatolotu;

import java.text.MessageFormat;

import javax.print.attribute.standard.RequestingUserName;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ejercicio {

   @GetMapping("/letradni")
   public String calcularletradni(@RequestParam int dni ){
    

//validacion antes de nada 
    int x=dni;
        int count = 0;
        while (x != 0) {
            x= x / 10;
            ++count;
        }
        
        if (count==8 ){
    

       String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
       int modulo= dni % 23;
       char letra = juegoCaracteres.charAt(modulo);
       String letra2= " "+ letra;
       return letra2;
        }else{
            return "error";
        }
   
   }
    

@GetMapping("/coincidencias")
public int calcularcoincidencias(@RequestParam String palabra1, @RequestParam String palabra2 ){
int contador=0;
    if (palabra1.length()==palabra2.length()){

        for (int i=0;i<palabra1.length();i++){

            for (int f=0; f<palabra2.length();f++){

            if (palabra1.charAt(i)==palabra2.charAt(f)){
                contador++;
            }
        }
        }
    }
    
          return contador;


    

        }
        
    }


         

   
                
          
        
 
    


