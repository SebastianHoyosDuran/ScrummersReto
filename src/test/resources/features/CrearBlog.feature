#Autor : Sebastian Hoyos

Feature: HU-001 Crear un blog con la informacion requerida
  Yo como administrador de tutranqui
  Quiero crear un nuevo Blog con la informacion requerida
  Para que los usuarios pueda leerlo

  Background:
    Given que me encuentro en la pagina

  @Fallido
  Scenario:
    When logue con la informacion correcta
    And ingrese a gestion de blogs
    And rellene la informacion necesaria
    Then podre ver el mensaje que el blog que no se guardo se manera exitosa

