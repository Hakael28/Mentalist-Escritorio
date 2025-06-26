package mt.mentalistFrontend.Modelo.DTO.Seguridad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponseDTO {
    private String token;
    private String rol;
    private Integer idUsuario;
    private String nombre;
    private String correo;
    private String telefono;
    private String usuario;
}