package org.example;

import java.util.Random;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Este es el mensaje de bienvenida de :"+ Thread.currentThread().getName());
        Random rm = new Random();
        for (int i=0; i<5; i++){
            int espera = rm.nextInt(10, 500);
            try {
                System.out.println("Estoy en el hilo: "+Thread.currentThread().getName()+ " -- Tiempo de espera actual: " +espera);
                Thread.sleep(espera);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Este es el mensaje de despedida de :"+ Thread.currentThread().getName());
    }
}
