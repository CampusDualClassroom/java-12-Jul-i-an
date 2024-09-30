package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public static final int MAX_WHEELS_ANGLE = 45;
    public static final int MIN_WHEELS_ANGLE = -45;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(){
    }

    public Car(String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public boolean isTachometerGreaterThanZero(){
        return (this.tachometer > 0);
    }

    public boolean  isTachometerEqualToZero(){
        return (this.tachometer == 0);
    }

    public void start(){
        if (this.speedometer==0){
            this.tachometer=1000;
            System.out.println("El vehículo encendido.");
        } else{
            System.out.println("El vehículo ya está encendido.");
        }
    }
    public void stop(){
        if (this.speedometer==0){
            this.tachometer=0;
            System.out.println("Vehículo apagado.");
        } else{
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido.");
        }
    }
    public void accelerate(){
        if (this.speedometer < MAX_SPEED)
            this.speedometer+=5;
        else
            System.out.println("No se puede superar la velocidad máxima del vehículo: " + MAX_SPEED);
    }
    public void brake(){
        if (0 < this.speedometer )
            this.speedometer-=5;
        else
            System.out.println("La velocidad del vehículo no puede ser negativa. ");

    }
    public void turnAngleOfWheels(int angle){
        int contador = 0;
        if (angle > 0) {
            while (((this.wheelsAngle) < MAX_WHEELS_ANGLE) && (contador < angle)){
                this.wheelsAngle++;
                contador++;
            }
        } else{
            while ((MIN_WHEELS_ANGLE < (this.wheelsAngle)) && (angle < contador)){
                this.wheelsAngle--;
                contador --;
            }
        }

    }
    public void setReverse(boolean reverse){
        if((this.speedometer > 0) && (this.gear.equals("N"))){
            System.out.println("No se puede poner la marcha atrás con el vehículo en movimiento");
        } else {
                this.gear = "R";
        }
    }
    public void setNormal(boolean reverse){
        if((this.speedometer > 0) && (this.gear.equals("R"))){
            System.out.println("No se puede poner la marcha normal con el vehículo en movimiento");
        } else {
            this.gear = "N";
        }
    }

}
