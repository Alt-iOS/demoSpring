package com.desarrollo.demospring.controllers;

import com.desarrollo.demospring.entities.ChangePassRequest;
import com.desarrollo.demospring.entities.Login;
import com.desarrollo.demospring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioRESTController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/loginrest")
    public ResponseEntity<String> login(@RequestBody Login login){
        if(usuarioService.login(login.getUsername(), login.getPassword())){
            return new ResponseEntity<String>("Inicio de sesion", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("No encontrado", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/changepassrest")
    public ResponseEntity<String> changePassword(@RequestBody ChangePassRequest changePassRequest){
        if(usuarioService.changePassword(changePassRequest.getUsername(), changePassRequest.getOldPass(), changePassRequest.getNewPass())){
            return new ResponseEntity<String>("Cambio exitoso", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("Cambio fallido, datos erroneous", HttpStatus.NOT_FOUND);
        }
    }

}
