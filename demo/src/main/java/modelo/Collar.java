package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Collar {
    private String material;
    private double longitudCm;
    private boolean tieneCierre;
    private String piedraPrincipal;
    private BigDecimal precio;
    private LocalDate fechaFabricacion;

    // Constructor vacío (por defecto)
    public Collar() {
        this.material = "Acero quirúrgico";
        this.longitudCm = 45.0;
        this.tieneCierre = true;
        this.piedraPrincipal = "Ninguna";
        this.precio = new BigDecimal("19.99");
        this.fechaFabricacion = LocalDate.now().minusMonths(1);
    }

    // Constructor con parámetros
    public Collar(String material, double longitudCm, boolean tieneCierre,
                  String piedraPrincipal, BigDecimal precio, LocalDate fechaFabricacion) {
        setMaterial(material);
        setLongitudCm(longitudCm);
        setTieneCierre(tieneCierre);
        setPiedraPrincipal(piedraPrincipal);
        setPrecio(precio);
        setFechaFabricacion(fechaFabricacion);
    }

    // Getters y Setters con validaciones
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("El material no puede estar vacío.");
        }
        this.material = material;
    }

    public double getLongitudCm() {
        return longitudCm;
    }

    public void setLongitudCm(double longitudCm) {
        if (longitudCm <= 0 || longitudCm > 200) {
            throw new IllegalArgumentException("La longitud debe estar entre 0 y 200 cm.");
        }
        this.longitudCm = longitudCm;
    }

    public boolean isTieneCierre() {
        return tieneCierre;
    }

    public void setTieneCierre(boolean tieneCierre) {
        this.tieneCierre = tieneCierre;
    }

    public String getPiedraPrincipal() {
        return piedraPrincipal;
    }

    public void setPiedraPrincipal(String piedraPrincipal) {
        this.piedraPrincipal = piedraPrincipal;
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

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        if (fechaFabricacion.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de fabricación no puede ser futura.");
        }
        if (fechaFabricacion.isBefore(LocalDate.of(2010, 1, 1))) {
            throw new IllegalArgumentException("La fecha no puede ser anterior a 2010.");
        }
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "Collar{" +
                "material='" + material + '\'' +
                ", longitudCm=" + longitudCm +
                ", tieneCierre=" + tieneCierre +
                ", piedraPrincipal='" + piedraPrincipal + '\'' +
                ", precio=" + precio +
                ", fechaFabricacion=" + fechaFabricacion +
                '}';
    }
}
