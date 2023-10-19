Feature: Login Newman
  Scenario Outline: Pruebas de logins
    Given Usuario ingresase al portal de login de newman he ingresa credenciales "<user>" y "<password>"
    When Usuario hace clic en el botón Acceder
    Then Ingresa al portal de newman.
    Examples:
      | user                        |password   |
      | joaquinedgar.alcon@unir.net | 1234567   |
      | PruebasFallida@mail.com     | 1234567   |