package com.secretaria.repositorios;

import com.secretaria.dominios.PreMatricula;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PreMatriculaRepository {

    private List<PreMatricula> preMatriculas = new ArrayList<PreMatricula>();
    private int id = 0;
    public PreMatricula save(PreMatricula preMatricula) {
        int teste = id++;
        preMatriculas.add(teste,preMatricula);
        return preMatricula;
    }

    public List<PreMatricula> getPreMatriculas() {
        return preMatriculas;
    }

    public void getPreMatriculas(int id) {
        System.out.println(preMatriculas.get(id));
        preMatriculas.get(id).setAvaliado(Boolean.TRUE);
    }
}
