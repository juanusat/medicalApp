package adaptador;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import pe.edu.usat.medicalapp.Especialidad;
import pe.edu.usat.medicalapp.databinding.ItemEspecialidadBinding;

public class EspecialidadAdaptador extends  RecyclerView.Adapter<EspecialidadAdaptador.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
