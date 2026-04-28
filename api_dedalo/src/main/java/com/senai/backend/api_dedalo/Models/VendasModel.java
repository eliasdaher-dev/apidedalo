package com.senai.backend.api_dedalo.Models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class VendasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Integer id_venda;

    @OneToMany
    @JoinColumn(name = "imovel")
    private List<ClientesModel> imovel;

    @OneToMany
    @JoinColumn(name = "comprador")
    private List<ClientesModel> comprador;

    @OneToMany
    @JoinColumn(name = "corretor")
    private List<ClientesModel> corretor;

    @Column(name = "data_venda")
    private LocalDate data_venda;

    public Integer getId_venda() {
        return id_venda;
    }

    public void setId_venda(Integer id_venda) {
        this.id_venda = id_venda;
    }

    public List<ClientesModel> getImovel() {
        return imovel;
    }

    public void setImovel(List<ClientesModel> imovel) {
        this.imovel = imovel;
    }

    public List<ClientesModel> getComprador() {
        return comprador;
    }

    public void setComprador(List<ClientesModel> comprador) {
        this.comprador = comprador;
    }

    public List<ClientesModel> getCorretor() {
        return corretor;
    }

    public void setCorretor(List<ClientesModel> corretor) {
        this.corretor = corretor;
    }

    public LocalDate getData_venda() {
        return data_venda;
    }

    public void setData_venda(LocalDate data_venda) {
        this.data_venda = data_venda;
    }
}
