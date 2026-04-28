package com.senai.backend.api_dedalo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.api_dedalo.Models.ImoveisModel;


@Repository
public interface ImoveisRepository extends JpaRepository <ImoveisModel, Integer>{

    
    
}