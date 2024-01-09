@suite
Feature: CP01 Verificar el formulario de registro

  Background: Yo como usuario quiero verificar el formulario de registro

    Given el usuario navega al sitio web

  @FormularioRegistro
  Scenario: Validar formulario de registro
    When dirigirse al menu forms y practice form
    When suministrar informacion personal
    When ingresar fecha de naciomiento
    When presionar en el boton submit
    Then validar mensaje formulario

  @ValidarLinks
  Scenario: Verificar la funcionalidad de los enlaces
    When dirigirse al menu elementes y links
    When ingresar a cada link
    Then Validar informacion correcta cada link
