package pe.edu.usat.medicalapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import pe.edu.usat.medicalapp.databinding.FragmentEspecialidadesBinding;
import pe.edu.usat.medicalapp.databinding.FragmentInicioBinding;
import pe.edu.usat.medicalapp.datos.DatosClinica;

public class EspecialidadesFragment extends Fragment {
    FragmentEspecialidadesBinding binding;
    ArrayList<Especialidad> listaEspecialidades;
    EspecialidadAdaptador especialidadAdaptador;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInicioBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // cargar las especialidades almacenadas en el array
        DatosClinica.cargarDAtosInicilesEspecialidad();

        listaEspecialidades =  DatosClinica.listaEspecialidades;
        especialidadAdaptador = new EspecialidadAdaptador(listaEspecialidades);

        // Configurar el recyclerview
        binding.rvEspecialides.setLayoutManager(new LinearLayoutManager(requireContext()));

        // Almacenar el adaptador al recycler
        binding.rvEspecialides.setAdapter(especialidadAdaptador);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
