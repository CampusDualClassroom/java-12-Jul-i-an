package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar;
        myCar = new Car("Citroën", "Xsara", "Diésel");

        // Un método booleano que verifique si el valor del tacómetro es cero
        if (myCar.isTachometerEqualToZero())
            System.out.println("Tacómetro a cero");

        // Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        myCar.start();
        System.out.println("Valor del tacómetro: " + myCar.tachometer);

        // Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        myCar.start();
        // Apagar el coche comprobando que el valor del tacómetro es correcto
        myCar.stop();
        System.out.println("Valor del tacómetro: " + myCar.tachometer);
        // Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        myCar.start();
        for (int i = 0; i <= 30; i++){
            myCar.accelerate();
        }
        myCar.stop();

        // Acelerar el coche
        System.out.println("Velocidad actual: " + myCar.speedometer);
        myCar.accelerate();
        System.out.println("Velocidad actual: " + myCar.speedometer);

        // Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        while (myCar.speedometer<120){
            myCar.accelerate();
        }
        System.out.println("Velocidad actual: " + myCar.speedometer);
        myCar.accelerate();

        // Frenar la velocidad
        System.out.println("Velocidad actual: " + myCar.speedometer);
        myCar.brake();
        System.out.println("Velocidad actual: " + myCar.speedometer);

        // Frenar hasta un valor negativo (y comprobar que no se puede)
        myCar.start();
        myCar.accelerate();
        System.out.println("Velocidad actual: " + myCar.speedometer);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". Velocidad actual: " + myCar.speedometer);
            myCar.brake();
        }
        System.out.println("Velocidad actual: " + myCar.speedometer);


        // Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);
        // Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        System.out.println("Volante en ángulo actual: " + myCar.wheelsAngle);
        myCar.turnAngleOfWheels(45);
        System.out.println("Volante en ángulo actual: " + myCar.wheelsAngle);
        myCar.turnAngleOfWheels(-45);
        System.out.println("Volante en ángulo actual: " + myCar.wheelsAngle);
        // Detener el coche y poner marcha atrás
        System.out.println("Velocidad actual: " + myCar.speedometer);
        while (myCar.speedometer>0){
            myCar.brake();
        }
        System.out.println("Velocidad actual: " + myCar.speedometer);
        myCar.setReverse(true);

        // Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        while (myCar.speedometer>0){
            myCar.brake();
        }
        myCar.setNormal(true);
        for (int i = 0; i <= 30; i++){
            myCar.accelerate();
        }
        myCar.setReverse(true);


    }

}