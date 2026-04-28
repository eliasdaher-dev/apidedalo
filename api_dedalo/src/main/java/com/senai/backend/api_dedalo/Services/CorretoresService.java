package com.senai.backend.api_dedalo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.senai.backend.api_dedalo.Models.CorretoresModel;
import com.senai.backend.api_dedalo.Repositories.CorretoresRepository;


public class CorretoresService {
    @Autowired private CorretoresRepository corretoresRepository;
   public Long contarCorretoresLong(){
        return corretoresRepository.count();
     }

     public CorretoresModel buscarCorretor (Integer id){
        return corretoresRepository.findById(id).get();

     }

     public List <CorretoresModel> listarCorretores(){
        return corretoresRepository.findAll();
     }


public Boolean deletarCorretor (Integer id){
    if (corretoresRepository.existsById(id)) {
        corretoresRepository.deleteById(id);
        return true;
    }
    return false;
}
public CorretoresModel cadastrarCorretor (CorretoresModel corretor) {
    return corretoresRepository.save(corretor);
}
 public CorretoresModel atualizarCorretores (Integer id,CorretoresModel corretor){
    CorretoresModel CorretoresRecuperados = buscarCorretor(id);
    if (CorretoresRecuperados != null){
        CorretoresRecuperados.setId_corretor(id);
        if (corretor.getNome_corretor() !=null){
            CorretoresRecuperados.setNome_corretor(corretor.getNome_corretor());
        }
        return corretoresRepository.save(CorretoresRecuperados);
    }
    return null;
}

    }
    
