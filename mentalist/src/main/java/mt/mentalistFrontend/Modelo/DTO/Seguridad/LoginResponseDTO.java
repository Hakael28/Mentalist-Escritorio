package mt.mentalistFrontend.Modelo.DTO.Seguridad;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginResponseDTO {
    private String token;
    private String rol;
    private Integer idUsuario;
}
