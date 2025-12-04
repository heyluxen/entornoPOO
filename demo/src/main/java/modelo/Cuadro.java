package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cuadro {
    private String titulo;
    private String autor;
    private int anchoCm;
    private int altoCm;
    private String tecnica;
    private BigDecimal precio;
    private LocalDate fechaCreacion;

    // Constructor vacío
    public Cuadro() {
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.anchoCm = 40;
        this.altoCm = 30;
        this.tecnica = "Óleo";
        this.precio = new BigDecimal("150.00");
        this.fechaCreacion = LocalDate.now().minusYears(2);
    }

    // Constructor con parámetros
    public Cuadro(String titulo, String autor, int anchoCm, int altoCm,
                  String tecnica, BigDecimal precio, LocalDate fechaCreacion) {
        setTitulo(titulo);
        setAutor(autor);
        setAnchoCm(anchoCm);
        setAltoCm(altoCm);
        setTecnica(tecnica);
        setPrecio(precio);
        setFechaCreacion(fechaCreacion);
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede estar vacío.");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        }
        this.autor = autor;
    }

    public int getAnchoCm() {
        return anchoCm;
    }

    public void setAnchoCm(int anchoCm) {
        if (anchoCm <= 0 || anchoCm > 300) {
            throw new IllegalArgumentException("El ancho debe estar entre 1 y 300 cm.");
        }
        this.anchoCm = anchoCm;
    }

    public int getAltoCm() {
        return altoCm;
    }

    public void setAltoCm(int altoCm) {
        if (altoCm <= 0 || altoCm > 300) {
            throw new IllegalArgumentException("El alto debe estar entre 1 y 300 cm.");
        }
        this.altoCm = altoCm;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        if (precio.compareTo(BigDecimal.ZERO) <= 0 || precio.compareTo(new BigDecimal("10000")) > 0) {
            throw new IllegalArgumentException("El precio debe estar entre 0 y 10,000.");
        }
        this.precio = precio;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        if (fechaCreacion.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de creación no puede ser futura.");
        }
        if (fechaCreacion.isBefore(LocalDate.of(2010, 1, 1))) {
            throw new IllegalArgumentException("La fecha no puede ser anterior a 2010.");
        }
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Cuadro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anchoCm=" + anchoCm +
                ", altoCm=" + altoCm +
                ", tecnica='" + tecnica + '\'' +
                ", precio=" + precio +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}