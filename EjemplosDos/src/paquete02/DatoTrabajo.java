/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    public static String obtenerTrabajo() {
        Scanner entrada = new Scanner(System.in);
        String acumulador;
        // método que permita preguntar al usuario el nombre de la empresa
        System.out.println("Ingrese nombre de la empresa");
        String nombreEmpresa = entrada.nextLine();
        // método que permita preguntar al usuario la dirección de la empresa
        System.out.println("Ingrese la dirección de la empresa");
        String direccionTrabajo = entrada.nextLine();
        acumulador = String.format("Nombre de la empresa es: %s\nDirección"
                + " de la empresa es: %s",
                nombreEmpresa,
                direccionTrabajo);
        return acumulador;
    }
}
