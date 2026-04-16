package pe.edu.usat.medicalapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pe.edu.usat.medicalapp.databinding.ItemEspecialidadBinding;

public class EspecialidadAdaptador extends RecyclerView.Adapter<EspecialidadAdaptador.ViewHolder> {
    private ArrayList<Especialidad> listaEspecidad;

    public EspecialidadAdaptador(ArrayList<Especialidad> listaEspecialidad) {
        this.listaEspecidad = listaEspecidad;
    }

    public void actualizarListaEspecialidad(ArrayList<Especialidad> listaEspecidad) {
        this.listaEspecidad = listaEspecidad;
        // Con la fainalidad de que el recycler se refresque, aplicamos notifyDataSetChanged
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Permite vincular el pe.edu.usat.medicalapp.adaptador con el archivo que contiene la plantilla MaterialCardView
        ItemEspecialidadBinding binding = ItemEspecialidadBinding.inflate
                (
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false
                );

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Permite gestionar la impresiòn de los pe.edu.usat.medicalapp.datos en la plantilla
        Especialidad especialidad = listaEspecidad.get(position);
        holder.mostrarDatos(especialidad);
    }

    @Override
    public int getItemCount() {
        return listaEspecidad.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemEspecialidadBinding binding;

        public ViewHolder(ItemEspecialidadBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void mostrarDatos(Especialidad especialidad) {
            binding.imgEspecialidad.setImageResource(especialidad.getImagen());
            binding.txtEspecialidad.setText(especialidad.getNombre());
            binding.txtDescripcionEspecialidad.setText(especialidad.getDescripcion());
        }
    }
}
