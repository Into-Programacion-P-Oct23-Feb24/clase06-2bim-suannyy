/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String trabajo;
        String acumulador;
        double[] misNotas;
        double promedio;
        String notas = "";
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        trabajo = DatoTrabajo.obtenerTrabajo();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);

        for (int i = 0; i < misNotas.length; i++) {
            notas = String.format("%s\nNota %s: %.2f",
                    notas,
                    i + 1,
                    misNotas[i]);
        }
        acumulador = String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "%s"
                + "%s\n"
                + "Promedio: %.2f\n",
                nombre,
                apellidoRetornado,
                ciudad,
                trabajo,
                notas,
                promedio);
        System.out.println(acumulador);

    }
}
