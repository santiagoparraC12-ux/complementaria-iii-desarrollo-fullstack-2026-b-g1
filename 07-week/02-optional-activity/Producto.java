package com.urbanstyle.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String categoria; // camisetas, zapatos, vestidos, accesorios

    private String marca;

    private Double precio;

    private String imagenUrl;

    private Integer stock;

    // Constructor vacío (obligatorio para JPA)
    public Producto() {}

    public Producto(String titulo, String categoria, String marca, Double precio, String imagenUrl, Integer stock) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.marca = marca;
        this.precio = precio;
        this.imagenUrl = imagenUrl;
        this.stock = stock;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
}