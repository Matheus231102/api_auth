package matheus.github.apiAuth.controllers;

import matheus.github.apiAuth.dtos.UsuarioDTO;
import matheus.github.apiAuth.services.servicesInterfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

     @Autowired
     private UsuarioService usuarioService;

     @PostMapping
     private UsuarioDTO salvar(@RequestBody UsuarioDTO usuarioDTO) {
          return usuarioService.salvar(usuarioDTO);
     }



}
