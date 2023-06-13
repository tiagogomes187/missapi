package br.dev.tiagogomes.missapp.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Long referencia;
    private String cor;
    private String nome;
    private String marca;
    @Column(unique = true)
    private Long gtin;
    private String ncm;
    private Instant data;
    private String tipo;

    public ProductModel() {
    }

    public ProductModel(UUID id, Long referencia, String cor, String nome, String marca, Long gtin, String ncm, Instant data, String tipo) {
        this.id = id;
        this.referencia = referencia;
        this.cor = cor;
        this.nome = nome;
        this.marca = marca;
        this.gtin = gtin;
        this.ncm = ncm;
        this.data = data;
        this.tipo = tipo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getReferencia() {
        return referencia;
    }

    public void setReferencia(Long referencia) {
        this.referencia = referencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getGtin() {
        return gtin;
    }

    public void setGtin(Long gtin) {
        this.gtin = gtin;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
