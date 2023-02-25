
Feature: Test Mercado libre ordenamiento y filtros
  Scenario Outline: Ordenamiento de articulos
    Given Usuario este en la pagina de Ecomerce
    When Usuario escriba lo que desea comprar en el buscador: <articulo>
    Then Usuario verifica que los articulos esten ordenados de <relevancia>
    Examples:
      | articulo         | relevancia     |
      | Nintendo         | Mayor precio   |
      | Playstation5     | Menor precio   |
      | Iphone           |Más relevantes  |

  Scenario Outline: Ordenar Articulos de forma por defecto
    Given Usuario este en la pagina de Ecomerce
    When Usuario escriba lo que desea comprar en el buscador: <articulo>
    And Usuario escribe el precio menor <precio_bajo>
    And Usuario escribe el precio mayor <precio_mayor>
    And Usuario aplica el filtro
    Then pagina carga los articulos con esos precios mostrando etiqueta de busqueda
    Examples:
      | articulo         | precio_bajo | precio_mayor |
      | Nintendo         | 100         |300          |
      | Playstation5     | 300         |500          |
      | Iphone           |500          |1000         |