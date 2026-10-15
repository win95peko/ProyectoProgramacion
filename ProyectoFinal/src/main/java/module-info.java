module esi.unoMI.ProyectoFinal {
    requires javafx.controls;
    requires javafx.fxml;
    
	requires bcrypt;

    opens esi.unoMI.ProyectoFinal to javafx.fxml;
    exports esi.unoMI.ProyectoFinal;
}
