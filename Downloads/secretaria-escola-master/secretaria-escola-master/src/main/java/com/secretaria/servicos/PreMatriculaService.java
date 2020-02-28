package com.secretaria.servicos;

import com.secretaria.dominios.Candidato;
import com.secretaria.dominios.PreMatricula;
import com.secretaria.repositorios.CandidatoRepository;
import com.secretaria.repositorios.PreMatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PreMatriculaService {

    private PreMatriculaRepository preMatriculaRepository;

    public PreMatriculaService(PreMatriculaRepository preMatriculaRepository) {
        this.preMatriculaRepository = preMatriculaRepository;
    }

    public List<PreMatricula> listar(){
        return preMatriculaRepository.getPreMatriculas();
    }

    public void listar(int id){
        preMatriculaRepository.getPreMatriculas(id);
    }
}
