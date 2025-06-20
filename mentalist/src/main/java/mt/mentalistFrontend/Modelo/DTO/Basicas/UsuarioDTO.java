package mt.mentalistFrontend.Modelo.DTO.Basicas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import mt.mentalistFrontend.Modelo.Enum.Rol;

@Data
public class UsuarioDTO {

    private Integer idUsuario;

    @NotBlank(message = "El nombre del profesional es obligatorio")
    @Size(max = 100, message = "El nombre no debe superar los 100 caracteres")
    private String nombre;

    @NotBlank(message = "El nombre de usuario es obligatorio")
    @Size(max = 100, message = "El nombre de usuario no debe superar los 100 caracteres")
    private String usuario;

    @NotNull(message = "El rol del usuario es obligatorio")
    private Rol rol;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, max = 100, message = "La contraseña debe tener entre 6 y 100 caracteres")
    private transient String contrasena;

    @NotBlank(message = "El correo del usuario es obligatorio")
    private String correo;

    @NotNull(message = "El telefono del usuario es obligatorio")
    private String telefono;
}
