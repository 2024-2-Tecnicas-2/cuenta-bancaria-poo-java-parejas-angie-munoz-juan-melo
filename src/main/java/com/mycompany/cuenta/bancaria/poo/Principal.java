package com.mycompany.cuenta.bancaria.poo;

public class Principal {
    public static void main(String[] args) {
        // TODO: Adiciona aquí el código que deseas para la Cuenta Bancaria.
        CuentaBancaria cuenta = new CuentaBancaria("Sam","25683149", 1500.0);
        
        System.out.println("Prueba Titular: " + cuenta.getTitular().equals("Sam"));
        
        cuenta.setTitular("Lulu");
        System.out.println("Prueba Titular: " + cuenta.getTitular().equals("Lulu"));
        
        System.out.println("Prueba Numero de Cuenta: " + cuenta.getNumeroCuenta().equals("25685149"));
        
        System.out.println("Prueba Saldo: "+ (cuenta.getSaldo() == 1500.0));
        
        cuenta.ingresar(200);
        System.out.println("Prueba ingresar: " + (cuenta.getSaldo() == 1700.0));
        
        cuenta.ingresar(-200);
        System.out.println("Prueba ingresar: " + (cuenta.getSaldo() == 1700.0));
        
        cuenta.retirar(300);
        System.out.println("Prueba retirar: " + (cuenta.getSaldo() == 1400.0));
        
        cuenta.retirar(2000);
        System.out.println("Prueba retirar: " + (cuenta.getSaldo() == 1400.0));
        
        System.out.println("Calcular interes: " + (cuenta.calcularInteres() == 1421.0));
        
        cuenta.setTipoInteres(5.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1470.0));
        
        cuenta.setTipoInteres(-2.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1470.0));
        
        cuenta.setTipoInteres(12.0);
        System.out.println("Prueba interes: " + (cuenta.calcularInteres() == 1470.0));
    }
}
