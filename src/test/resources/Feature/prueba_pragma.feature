# Author: Juan Camilo Alvarez Barrios

@pruebaTecnicaPragma
Feature: Juan Camilo Desea Automatizar la pagina y realizar una compra

  Background:
    Given Juan Camilo ingresa al sitio automationpractice


  Rule: Se automatice la prueba tecnica

    @escenarioUno
    Scenario: Realiza el primer ingreso al carrito
      Given Juan Camilo Selecciona ropa para mujer
      When Agrega el producto al carrito
      Then el visualiza el total de "$18.51"

    @escenarioDos
    Scenario: Juan Camilo agrega dos productos al carrito
      Given Juan Camilo ingresa a la seccion Dresses
      When selecciona y agrega todos los pructos al carrito
      Then Juan Camilo observa un total de "$78.99"

    @escenarioTres
    Scenario: Juan Camilo agrega 3 productos al carrito
      Given Juan Camilo ingresa a la seccion de TShirt
      When En la seccion Women selecciona un producto y agrega dos unidades
      Then Juan Camilo visualiza un precio total de "$51.53"

    @escenarioCuatro
    Scenario: Juan Camilo agrega 4 productos al carrito
      Given Juan Camilo Ingresa a la seccion Women
      When Agrega un producto con dos unidades
      Given Juan Camilo da clic en la opcion Dress
      When Selecciona un producto y agrega dos unidades
      Then Juan Camilo puede ver un precio total de "$157.98"

    @escenarioCinco
    Scenario: Juan Camilo agrega 5 productos al carrito
      Given Juan Camilo da clic en Women
      When selecciona un producto agregandole cinco unidades
      Then Visualiza el valor total compra "$137.00"

    @escenarioSeis
    Scenario: Juan Camilo agrega 6 productos al carrito
      Given Juan Camilo ingresa clic en la opcion Dresses
      When ingresa un producto con seis unidades al carrito
      Then Visualiza el valor total compra "$307.94"