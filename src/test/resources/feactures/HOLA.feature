# language: es

Característica: Realizar compra de articulo
  como un nuevo cliente
  quiero ingresar a la pagina www.abc.com
  para realizar la compra de un articulo


  @EscenarioSinValor
  Escenario: agregar articulo al carrito de compra
    Dado  que un cliente accede a la web de compras
    Cuando el agrega x unidades  de  Microfono  al carrito
    Entonces el ve los productos en el carrito de compras


  @EscenarioConValor
  Esquema del escenario: agregar producto al carrito de compras
    Dado  que un cliente accede a la web de compras
    Cuando  el agrega un producto al carrito audifono
      |<nombreProducto>|
    Entonces el ve los productos en el carrito de compras


    Ejemplos:
      |nombreProducto|
      |Microfono     |