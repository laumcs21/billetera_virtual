package uniquindio.edu.poo.billetera_controller;

import java.io.IOException;
import javafx.fxml.FXML;
import uniquindio.edu.poo.billetera_app.App;

public class AdministradorController {

    @FXML
    private void GestionarUsuarios() throws IOException {
        App.setRoot("GestionUsuarios", "Gestión Usuarios");
    }

    @FXML
    private void Volver() throws IOException {
        App.setRoot("InicioSesion", "Inicio Sesion");
    }

}
