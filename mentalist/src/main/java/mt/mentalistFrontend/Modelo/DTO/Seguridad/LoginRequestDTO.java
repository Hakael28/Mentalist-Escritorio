package mt.mentalistFrontend.Modelo.DTO.Seguridad;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class LoginRequestDTO {
    @NotBlank
    private String usuario;

    @NotBlank
    private String contrasena;
}
