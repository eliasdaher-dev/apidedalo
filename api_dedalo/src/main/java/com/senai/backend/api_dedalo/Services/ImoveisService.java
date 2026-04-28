package com.senai.backend.api_dedalo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.senai.backend.api_dedalo.Models.CorretoresModel;
import com.senai.backend.api_dedalo.Models.ImoveisModel;
import com.senai.backend.api_dedalo.Repositories.CorretoresRepository;
import com.senai.backend.api_dedalo.Repositories.ImoveisRepository;

public class ImoveisService {
    @Autowired
    private ImoveisRepository imoveisRepository;

    public Long contarImoveisLong() {
        return imoveisRepository.count();
    }

    public ImoveisModel buscarImovel(Integer id) {
        return imoveisRepository.findById(id).get();

    }

    public List<ImoveisModel> listarImoveis() {
        return imoveisRepository.findAll();
    }

    public Boolean deletarImovel(Integer id) {
        if (imoveisRepository.existsById(id)) {
            imoveisRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public ImoveisModel cadastrarImovel(ImoveisModel imovel) {
        return imoveisRepository.save(imovel);
    }

 public ImoveisModel atualizarImoveis (Integer id,ImoveisModel imovel){
    ImoveisModel ImoveisRecuperados = buscarImovel(id);
    if (ImoveisRecuperados != null){
        ImoveisRecuperados.setId_imovel(id);
        if (imovel.getBairro_imovel() !=null){
            ImoveisRecuperados.setBairro_imovel(imovel.getBairro_imovel());
        }
        if (imovel.getProprietario() != null) {
                ImoveisRecuperados.setProprietario(imovel.getProprietario());
        }
        if (imovel.getValor_imovel() != null) {
            ImoveisRecuperados.setValor_imovel(imovel.getValor_imovel());
        }
        return imoveisRepository.save(ImoveisRecuperados);
    }
    return null;
    }

}
