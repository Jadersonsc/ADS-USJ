package br.edu.usj.ads.lpii.perfialaluminio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    String nome;
    String descricao;
    String fabricante;
    Double peso;
    Double tamanho;
    Double preco;
}