package com.example;

import modelo.Collar;
import modelo.Cuadro;
import modelo.Plato;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROYECTO ENTORNO POO ===\n");
        
        // 1. COLLAR - Dos objetos
        System.out.println("=== COLLARES ===");
        Collar collar1 = new Collar();
        System.out.println("Collar 1 (constructor vacío):");
        System.out.println(collar1);
        
        Collar collar2 = new Collar(
                "Oro 18k",
                50.5,
                true,
                "Zafiro",
                new BigDecimal("1200.00"),
                LocalDate.of(2023, 5, 10)
        );
        System.out.println("\nCollar 2 (constructor con parámetros):");
        System.out.println(collar2);
        
        // 2. CUADRO - Dos objetos
        System.out.println("\n\n=== CUADROS ===");
        Cuadro cuadro1 = new Cuadro();
        System.out.println("Cuadro 1 (constructor vacío):");
        System.out.println(cuadro1);
        
        Cuadro cuadro2 = new Cuadro(
                "Noche estrellada",
                "Vincent van Gogh",
                73,
                92,
                "Óleo sobre lienzo",
                new BigDecimal("9500.00"),
                LocalDate.of(2020, 6, 1)
        );
        System.out.println("\nCuadro 2 (constructor con parámetros):");
        System.out.println(cuadro2);
        
        // 3. PLATO - Dos objetos
        System.out.println("\n\n=== PLATOS ===");
        Plato plato1 = new Plato();
        System.out.println("Plato 1 (constructor vacío):");
        System.out.println(plato1);
        
        Plato plato2 = new Plato(
                "Porcelana",
                30,
                true,
                "Azul y blanco",
                new BigDecimal("45.99"),
                LocalDate.of(2024, 1, 15)
        );
        System.out.println("\nPlato 2 (constructor con parámetros):");
        System.out.println(plato2);
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}