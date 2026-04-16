package pe.edu.usat.medicalapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import pe.edu.usat.medicalapp.databinding.ActivityMenuBinding;
import com.google.android.material.navigation.NavigationView;

public class MenuActivity extends AppCompatActivity {

    //Configuración de la barra superior
    private AppBarConfiguration mAppBarConfiguration;

    //Referencia al binding para enlazar a los controles
    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //Inicializar el binding
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Configurar el toolBar
        setSupportActionBar(binding.appBarMenu.toolbar);

        //Referenciar al contenedor del menú y a la vista de navegación
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        //Configurar la barra de navegación
        mAppBarConfiguration = new AppBarConfiguration.Builder
                (
                        R.id.nav_inicio,
                        R.id.nav_especialidades,
                        R.id.nav_medicos,
                        R.id.nav_registrar_cita,
                        R.id.nav_calendar_edit,
                        R.id.nav_calificacion,
                        R.id.nav_acerca_de
                ).setOpenableLayout(drawer).build();

        //Gestionar el intercambio de items del menú: Al cambiar de item, cambia de fragment
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_menu);

        //Vincular el toolbar con el NavController y la configuración del drawer
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);

        //Vincular el menú lateral (navigationView) con el NavControler para que al hacer clic en el item quede seleccionado
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        //Este evento se ejecuta cuando el usuario hace click en el menú de la esquina superior izquierda
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_menu);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}