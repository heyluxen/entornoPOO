# entornoPOO

## Descripción
Este proyecto implementa tres objetos del entorno real como clases Java completamente encapsuladas, siguiendo los principios de Programación Orientada a Objetos (POO).

## Objetivo
Demostrar la capacidad de modelar objetos del mundo real en clases Java con encapsulamiento, validaciones y métodos apropiados.

## Clases Implementadas

### 1. **Collar**
Representa un collar con sus características principales:
- **Atributos:** material, longitudCm, tieneCierre, piedraPrincipal, precio, fechaFabricacion
- **Validaciones:** precio (0-10,000), fecha (≥2010), longitud (0-200cm)

### 2. **Cuadro**
Representa una obra artística enmarcada:
- **Atributos:** titulo, autor, anchoCm, altoCm, tecnica, precio, fechaCreacion
- **Validaciones:** precio (0-10,000), fecha (≥2010), dimensiones (1-300cm)

### 3. **Plato**
Representa un plato de cocina:
- **Atributos:** material, diametroCm, esHondo, color, precio, fechaAdquisicion
- **Validaciones:** precio (0-10,000), fecha (≥2010), diámetro (1-100cm)

- ## Características Implementadas

### Para cada clase:
- 6 atributos de tipos variados (String, primitivos, boolean, BigDecimal, LocalDate)
- Encapsulamiento completo (atributos private)
- Constructor vacío con valores por defecto razonables
- Constructor con parámetros que usa setters para validaciones
- Getters y setters con validaciones
- Método `toString()` sobrescrito
- Validaciones en setters (rangos, no nulos, fechas)

### Validaciones comunes:
- **Precio:** Mayor que 0 y menor que 10,000
- **Fechas:** No futuras y no anteriores a 2010
- **Strings:** No nulos ni vacíos
- **Valores numéricos:** Rangos específicos por atributo
