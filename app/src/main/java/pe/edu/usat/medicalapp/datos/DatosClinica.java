package pe.edu.usat.medicalapp.datos;

import java.util.ArrayList;

import pe.edu.usat.medicalapp.Especialidad;
import pe.edu.usat.medicalapp.R;

public class DatosClinica {
    public static ArrayList<Especialidad> listaEspecialidades = new ArrayList<>();

    // Lista para gestionar los médicos
    // Lista para gestionar las citas médicas

    public static void cargarDAtosInicilesEspecialidad() {
        if (listaEspecialidades.isEmpty()) {
            listaEspecialidades.add(
                    new Especialidad(
                            "Pediatría",
                            "Atención médica especializada para niños y adolescentes",
                            R.drawable.pediatria)
            );
            listaEspecialidades.add(
                    new Especialidad(
                            "Cardiología",
                            "Diagnóstico y trantamiento de enfermedades del corazón",
                            R.drawable.cardiologia)
            );
            listaEspecialidades.add(
                    new Especialidad(
                            "Dermatología",
                            "Atención integral en enfermedades y cuidados de la piel",
                            R.drawable.dermatologia)
            );
        }
    }

}
