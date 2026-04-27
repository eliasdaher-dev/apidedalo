package com.senai.backend.api_dedalo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.api_dedalo.Models.CorretoresModel;


@Repository
public interface CorretoresRepository extends JpaRepository <CorretoresModel, Integer>{

    
    
}