Feature: Test Mercado libre seleccion de Item
  Scenario Outline: Seleccionando un item verificando los precios
    Given Usuario este en la pagina de Ecomerce
    When Usuario escriba lo que desea comprar en el buscador: <articulo>
    And Cliente selecciona primer articulo
    And Pagina carga pre visualizacion del articulo
    And Se verifica que el precio sea el mismo que del item seleccionado previamente
    And Cliente hace click en comprar ahora
    Examples:
      | articulo         |
      | Nintendo         |
      | Playstation5     |
      | Iphone           |