Feature: Automatización de Datepicker

  Scenario: Seleccionar día 15 del mes actual
    Given que el usuario abre la página del datepicker
    When selecciona el día 15 del mes actual
    Then la fecha seleccionada debe mostrarse en el campo

  Scenario: Seleccionar día 10 del próximo mes
    Given que el usuario abre la página del datepicker
    When selecciona el día 10 del próximo mes
    Then la fecha seleccionada debe mostrarse en el campo

  Scenario: Validar que el campo no se puede editar manualmente
    Given que el usuario abre la página del datepicker
    When intenta escribir manualmente una fecha
    Then no debe poder editar el campo de texto
