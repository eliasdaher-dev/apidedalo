package com.senai.backend.api_dedalo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.api_dedalo.Models.ClientesModel;
import com.senai.backend.api_dedalo.Repositories.ClientesRepository;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;
     public Long contarClientesLong(){
        return clientesRepository.count();
     }

     public ClientesModel buscarClientes (Integer id){
        return clientesRepository.findById(id).get();

     }

     public List <ClientesModel> listarClientes(){
        return clientesRepository.findAll();
     }


public Boolean deletarClientes (Integer id){
    if (clientesRepository.existsById(id)) {
        clientesRepository.deleteById(id);
        return true;
    }
    return false;
}
public ClientesModel cadastrarClientes (ClientesModel cliente) {
    return clientesRepository.save(cliente);
}
 public ClientesModel atualizarClientes (Integer id,ClientesModel cliente){
    ClientesModel ClientesRecuperados = buscarClientes(id);
    if (ClientesRecuperados != null){
        ClientesRecuperados.setId_cliente(id);
        if (cliente.getNome_cliente() !=null){
            ClientesRecuperados.setNome_cliente(cliente.getNome_cliente());
        }
        return clientesRepository.save(ClientesRecuperados);
    }
    return null;
 }
}
