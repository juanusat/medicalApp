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
                            R.id.imgEspecialidad)
            );
        }
    }

}
