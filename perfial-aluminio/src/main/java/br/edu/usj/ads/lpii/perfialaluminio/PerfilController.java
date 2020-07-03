package br.edu.usj.ads.lpii.perfialaluminio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class PerfilController {

    @Autowired
    PerfilRepository perfilRepository;

    @GetMapping(value="/")
    public ModelAndView getListar() {
        // listar todos os perfis
        List<Perfil> lista = perfilRepository.findAll(); 

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("lista", lista);
        return modelAndView;
    }

    @GetMapping(value="/mostrar/{id}")
    public ModelAndView getMostrar(@PathVariable Long id ) {
        // mostra o perfil referente ao ID
        return null;
    }

    @GetMapping(value="/cadastrar")
    public ModelAndView getCadastrar() {
        // retorna o formulário para o usuário preencher
        return null;
    }
    
    @PostMapping(value="/cadastrar")
    public ModelAndView postCadastrar(@RequestParam String nome) {
        // recebe o perfil preenchido no formulário e manda gravar no banco
        return null;
    }

    @GetMapping(value="/deletar/{id}")
    public ModelAndView getDeletar(@PathVariable Long id) {
        // deleta perfil referente ao ID
        return null;
    }
    
    @GetMapping(value="/editar/{id}")
    public ModelAndView getEditar(@PathVariable Long id) {
        // retorna o formulário de cadastro, mas com o perfil "id" preenchido
        return null;
    }
    
    
    

}