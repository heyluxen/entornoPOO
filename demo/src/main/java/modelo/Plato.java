package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Plato {
    private String material;
    private int diametroCm;
    private boolean esHondo;
    private String color;
    private BigDecimal precio;
    private LocalDate fechaAdquisicion;

    // Constructor vacío
    public Plato() {
        this.material = "Cerámica";
        this.diametroCm = 25;
        this.esHondo = false;
        this.color = "Blanco";
        this.precio = new BigDecimal("12.50");
        this.fechaAdquisicion = LocalDate.now();
    }

    // Constructor con parámetros
    public Plato(String material, int diametroCm, boolean esHondo,
                 String color, BigDecimal precio, LocalDate fechaAdquisicion) {
        setMaterial(material);
        setDiametroCm(diametroCm);
        setEsHondo(esHondo);
        setColor(color);
        setPrecio(precio);
        setFechaAdquisicion(fechaAdquisicion);
    }

    // Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("El material no puede estar vacío.");
        }
        this.material = material;
    }

    public int getDiametroCm() {
        return diametroCm;
    }

    public void setDiametroCm(int diametroCm) {
        if (diametroCm <= 0 || diametroCm > 100) {
            throw new IllegalArgumentException("El diámetro debe estar entre 1 y 100 cm.");
        }
        this.diametroCm = diametroCm;
    }

    public boolean isEsHondo() {
        return esHondo;
    }

    public void setEsHondo(boolean esHondo) {
        this.esHondo = esHondo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("El color no puede estar vacío.");
        }
        this.color = color;
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

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        if (fechaAdquisicion.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de adquisición no puede ser futura.");
        }
        if (fechaAdquisicion.isBefore(LocalDate.of(2010, 1, 1))) {
            throw new IllegalArgumentException("La fecha no puede ser anterior a 2010.");
        }
        this.fechaAdquisicion = fechaAdquisicion;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "material='" + material + '\'' +
                ", diametroCm=" + diametroCm +
                ", esHondo=" + esHondo +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", fechaAdquisicion=" + fechaAdquisicion +
                '}';
    }
}