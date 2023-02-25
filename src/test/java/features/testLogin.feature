Feature: Test Mercado libre Login
  Scenario: Introduccion de correo invalido
  Given Usuario este en la pagina de Ecomerce
  When Usuario intenta iniciar session
    And Hace click en Ingresar
    And Pagina solicita correo
    And Usuario ingresa correo invalido "pruebas@sss"
  Then Pagina muestra mensaje de validacion de correo invalido

  Scenario: Inicio session completo
  Given Usuario este en la pagina de Ecomerce
  When Usuario intenta iniciar session
    And Hace click en Ingresar
    And Pagina solicita correo
    And Usuario introduce correo electronico valido "Joaquinear21@gmail.com"
    And Hace click en continuar
    And Ingresa password "DiplomadiTest2022"
    And Usuario hace click en Ingresa
  Then Pagina mercado libre carga pagina principal con nombre del usuario al lado izquiero de Mis compras
