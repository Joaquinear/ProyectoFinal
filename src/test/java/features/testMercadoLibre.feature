Feature: Test Mercado libre
  Scenario Outline: Busqueda de articulos
    Given Usuario este en la pagina de Ecomerce
    When Usuario escriba lo que desea comprar en el buscador: <articulo>
    And Usuario Verifica que el articulo tiene resultados
    Then Pagina mostrar resultados de la busqueda en la pantalla.
    Examples:
      | articulo         |
      | Nintendo         |
      | Playstation5     |

    Scenario Outline: Verificar la existencia de articulos nuevos y usados
      Given Usuario este en la pagina de Ecomerce
      When Usuario escriba lo que desea comprar en el buscador: <articulo>
      And Verifica si existen mas articulos nuevos que usados
      Then Usuario ingresa a ver los articulos nuevos

      Examples:
        | articulo         |
        | mouse            |
        | Tasas            |
        | Laptop           |

  Scenario Outline: Verificar la existencia de articulos nuevos y usados
    Given Usuario este en la pagina de Ecomerce
    When Usuario escriba lo que desea comprar en el buscador: <articulo>
    And Verifica si existen mas de dos articulos usados
    Then Usuario ingresa a ver los articulos usados

    Examples:
      | articulo         |
      | Mandos           |
      | Pokemon          |
      | bicicletas       |

  Scenario: Veficar mensaje de cuando no encuentra ningun articulo
    Given Usuario este en la pagina de Ecomerce
    When Usuario escribe un articulo que no se puede encontrar
    Then Pagina mostrara mensaje avisando que no encontro coincidencias