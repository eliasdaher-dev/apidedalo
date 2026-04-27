package com.senai.backend.api_dedalo.Models;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class ImoveisModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel")
    private Integer id_imovel;



    @Column(name = "bairro imovel")
    private String bairro_imovel;


    @Column(name = "valor imovel")
    private Double valor_imovel;

    @OneToMany
    @JoinColumn(name = "proprietario")
    private List<ClientesModel> proprietario;

    public ImoveisModel() {
    }

    public Integer getId_imovel() {
        return id_imovel;
    }

    public void setId_imovel(Integer id_imovel) {
        this.id_imovel = id_imovel;
    }

    public String getBairro_imovel() {
        return bairro_imovel;
    }

    public void setBairro_imovel(String bairro_imovel) {
        this.bairro_imovel = bairro_imovel;
    }

    public Double getValor_imovel() {
        return valor_imovel;
    }

    public void setValor_imovel(Double valor_imovel) {
        this.valor_imovel = valor_imovel;
    }

    public List<ClientesModel> getProprietario() {
        return proprietario;
    }

    public void setProprietario(List<ClientesModel> proprietario) {
        this.proprietario = proprietario;
    }
    

}

