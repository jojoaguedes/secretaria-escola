package com.secretaria.controladores;

import com.secretaria.servicos.MatriculaService;
import com.secretaria.servicos.PreMatriculaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prematricula")
public class PreMatriculaController {
    private PreMatriculaService prematriculaService;

    public PreMatriculaController(PreMatriculaService prematriculaService) {
        this.prematriculaService = prematriculaService;
    }

    @GetMapping
    public ResponseEntity lista() {
        return ResponseEntity.status(HttpStatus.OK).body(prematriculaService.listar());
    }

    @PostMapping("/{id}")
    public ResponseEntity lista(@PathVariable("id") int id) {
        prematriculaService.listar(id) ;
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
