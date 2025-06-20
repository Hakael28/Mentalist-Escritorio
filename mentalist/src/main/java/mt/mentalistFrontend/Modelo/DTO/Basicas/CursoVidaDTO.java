package mt.mentalistFrontend.Modelo.DTO.Basicas;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import mt.mentalistFrontend.Modelo.Enum.Etapa;

@Data
public class CursoVidaDTO {

    private Integer idCursoVida;

    @NotNull
    private Etapa etapa;
}
