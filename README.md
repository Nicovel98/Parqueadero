# 🚗 Sistema de Gestión de Parqueadero

Sistema desarrollado en **Java** para la administración eficiente de ingresos y salidas de vehículos en un estacionamiento, aplicando conceptos avanzados de **Programación Orientada a Objetos (POO)**.

## 🎯 Objetivos del Proyecto
- Implementar **Herencia** para gestionar diferentes tipos de vehículos (Automóviles, Motocicletas, Camiones).
- Aplicar **Polimorfismo** en el cálculo de tarifas diferenciadas.
- Automatizar el registro de tiempos y costos mediante la librería `java.time`.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java
- **Gestión de Tiempo:** `LocalDateTime` y `Duration`.
- **Modelado:** UML (Diagramas de Clases).
- **Control de Versiones:** Git & GitHub.

## 📐 Estructura del Sistema (UML)
El sistema utiliza una clase base abstracta `Vehiculo` de la cual heredan:
- **Automovil:** Atributo `tipoCombustible`.
- **Motocicleta:** Atributo `cilindraje`.
- **Camion:** Atributo `capacidadCarga`.

La clase `Parqueadero` actúa como gestora mediante una **Agregación** de vehículos.

## 💰 Tarifas Configuradas
El sistema calcula el costo basándose en fracciones de hora (se redondea a la hora completa):
- **Auto:** $3,000 / hora
- **Moto:** $1,500 / hora
- **Camión:** $6,000 / hora

## 🚀 Instalación y Ejecución
1. Clona el repositorio:
   ```bash
   git clone git@github.com:Nicovel98/Parqueadero.git
2. Compilación y ejecución en tu terminal:
   ```bash
   javac *.java
   java Main