package br.edu.usj.ads.lpii.perfialaluminio;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String nome;
    String sobrenome;
    Date nascimento;
    String cidade;
    String estado;
    int cep;
    
}