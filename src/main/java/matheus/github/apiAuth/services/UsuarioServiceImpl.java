package matheus.github.apiAuth.services;

import matheus.github.apiAuth.dtos.UsuarioDTO;
import matheus.github.apiAuth.dtos.mapper.UsuarioMapper;
import matheus.github.apiAuth.models.UsuarioEntity;
import matheus.github.apiAuth.repositories.UsuarioRepository;
import matheus.github.apiAuth.services.servicesInterfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

     @Autowired
     private UsuarioRepository usuarioRepository;

     @Autowired
     private UsuarioMapper usuarioMapper;

     @Override
     public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {

          UsuarioEntity usuarioJaExiste = usuarioRepository.findByLogin(usuarioDTO.getLogin());
          if (usuarioJaExiste != null) {
               throw new RuntimeException("Usuario já existe");
          }

          UsuarioEntity usuarioEntity = usuarioMapper.toEntity(usuarioDTO);
          return usuarioMapper.toDTO(usuarioRepository.save(usuarioEntity));
     }



}
