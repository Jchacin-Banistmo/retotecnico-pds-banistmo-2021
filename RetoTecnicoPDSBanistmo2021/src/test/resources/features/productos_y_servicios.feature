# language: es
# autor: Jonathan Chacin

@VisualizacioProductosYServicios
Característica: realizar la visualizacion de los productos y servicios de Banistmo
  Yo como cliente
  Quiero realizar visualizacion de los productos y servicios en el sitio web de Banistmo
  Para Para obtener informacion detallada de los productos y servicios

  @DescargarPDFProhibicionesDePrestamoAuto
  Escenario: Realizar la descarga del contrato de prohibiciones de prestamo de auto
    Dado que ingreso a la pagina de Banistmo
    Cuando ingreso a la seccion de productos y servicios
    Entonces verifico que se muestre el pdf de prestamos y servicios
