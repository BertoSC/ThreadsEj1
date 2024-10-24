package org.example;

/*
* Crear una clase Java queimplemente la interfaz Runnable
* y cuyo método run() haga lo siguiente:
* Crear una clase Java ejecutable que lance dos hilos creados con la clase anterior.
* El hilo principal espera a que los otros dos hilos terminen
* y muestra un mensaje indicando que ha terminado.
*
Mostrar un mensaje de bienvenida con el nombre del hilo actual.
Repetir cinco veces
Obtener un número aleatorio entre 10 y 500 (utilizar java.util.Random)
Pausar la ejecución del hilo actual durante el número de milisegundos igual al número aleatorio obtenido anteriormente.
Mostrar un mensaje de despedida con el nombre del hilo actual

Traducción realizada con la versión gratuita del traductor DeepL.com
* */


public class Main {
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        Thread hilo1 = new Thread(run);
        Thread hilo2 = new Thread(run);
        hilo1.start();
        hilo2.start();

        try {

            // con join estamos indicado que el proceso principal espere a que termine el hilo en el que especificas la llamada a join()
            // por ejemplo, aquí le decimos al principal que no acabe hasta que finalicen hilo1 e hilo2
            hilo1.join();
            hilo2.join();
            System.out.println("El hilo principal ha terminado");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}