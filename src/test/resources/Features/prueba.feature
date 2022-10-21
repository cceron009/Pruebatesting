# language: es

  @TodosScenarios
  Característica: Agregar varios productos al carrito
  Como usuario deseo agregar varios productos al carrito

  Antecedentes:
    Dados los datos del ambiente y usuarios del sistema

  @AgregarNuevoProductCarritoCompras
  Escenario: Adicionar productos al carrito y realizo Checkout de los productos
    Dado inicio sesion en saucedemo
    Cuando ingreso las credenciales correctas del usuario "standard_user"
    Y ingreso correctamente contraseña "secret_sauce"
    Entonces puedo ingresar al aplicativo

    Dado Que tengo productos para agregar al carro
    Cuando Agrego un producto al carrito de compras
    Y Selecciono carrito de compras
    Entonces Puedo ver productos seleccionados en el carrito

    Dado Los productos para realizar Checkout
    Cuando Realizo Checkout
    Y ingreso primer nombre "Cristian" y apellido "Ceron"
    Y codigo postal "11111100"
    Entonces Puedo Ver el Checkout
    Dado Que puedo ver descripcion del producto a comprar

    Cuando Finalizamos la compra
    Y puedo ver la confirmacion de la compra
    Entonces Retorno al Home page del portal