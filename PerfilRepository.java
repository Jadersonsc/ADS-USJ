package br.edu.usj.ads.lpii.perfialaluminio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PerfilRepository extends CrudRepository <Perfil, Long>{

    List<Perfil> findAll();
    
}