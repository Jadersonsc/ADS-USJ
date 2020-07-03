package br.edu.usj.ads.lpii.perfialaluminio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientesController {
    
    @Autowired
    ClientesRepository clientesRepository;
    
    @GetMapping(value="/deleteAndAlterCliente")
    public ModelAndView getClientes() {
        List<Clientes> listarClientes = clientesRepository.findAll();
        
        ModelAndView modelAndView = new ModelAndView("deleteAndAlterCliente");
        modelAndView.addObject("listarClientes", listarClientes);
        return modelAndView;
    }

    @GetMapping(value="/mostrarCliente/{id}")
    public ModelAndView getMostrarClientes(@PathVariable Long id) {
        Clientes clientes = clientesRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("mostrarCliente");
        modelAndView.addObject("clientes", clientes);
        return modelAndView;
    }

    @GetMapping(value="/cadastrarCliente")
    public ModelAndView getCadastraClientes() {
        Clientes clientes = new Clientes();
        ModelAndView modelAndView = new ModelAndView("cadastrarCliente");
        modelAndView.addObject("clientes", clientes);
        return modelAndView;
    }
    
    @PostMapping(value="/cadastrarCliente")
    public ModelAndView postInserirClientes(Clientes clientes) {
        Clientes cadastrar = clientesRepository.save(clientes);

        ModelAndView modelAndView = new ModelAndView("cadastrarCliente");
        modelAndView.addObject("clientes", cadastrar);
        return modelAndView;
    }

    @GetMapping(value="/deleteAndAlterCliente/{id}")
    public String getDeletarClientes(@PathVariable Long id) {
        clientesRepository.deleteById(id);    
        return "redirect:/deleteAndAlterCliente";
    }

    @GetMapping(value="/cadastrarCliente/{id}")
    public ModelAndView getEditarClientes(@PathVariable Long id) {
        Clientes clientes = clientesRepository.findById(id).get();
        ModelAndView modelAndView = new ModelAndView("cadastrarCliente");
        modelAndView.addObject("clientes", clientes);
        return modelAndView;
    }
    
}