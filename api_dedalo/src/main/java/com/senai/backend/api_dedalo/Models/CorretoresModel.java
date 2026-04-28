package com.senai.backend.api_dedalo.Models;




import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CorretoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_corretor")
    private Integer id_corretor;

    @Column(name = "nome_corretor")
    private String nome_corretor;

    public CorretoresModel() {

    }

    public Integer getId_corretor() {
        return id_corretor;
    }

    public void setId_corretor(Integer id_corretor) {
        this.id_corretor = id_corretor;
    }

    public String getNome_corretor() {
        return nome_corretor;
    }

    public void setNome_corretor(String nome_corretor) {
        this.nome_corretor = nome_corretor;

        
    }

}
