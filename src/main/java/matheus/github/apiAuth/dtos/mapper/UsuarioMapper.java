package matheus.github.apiAuth.dtos.mapper;

import matheus.github.apiAuth.dtos.UsuarioDTO;
import matheus.github.apiAuth.models.UsuarioEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

     @Autowired
     private ModelMapper mapper;

     public UsuarioDTO toDTO(UsuarioEntity usuarioEntity) {
          return mapper.map(usuarioEntity, UsuarioDTO.class);
     }

     public UsuarioEntity toEntity(UsuarioDTO usuarioDTO) {
          return mapper.map(usuarioDTO, UsuarioEntity.class);
     }
}
