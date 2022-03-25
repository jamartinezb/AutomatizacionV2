#Autor: Jhon Martinez
@stories
  Feature: Registrar en pagina web
    @scenario1
    Scenario: registrar en la pagina web
      Given la pagina cargue
      When el usuario inicia el registro
      |sNombres      |sApellidos      |sEmail              |sMes      |sDia|sAnno|sCiudad|sPosta|sPais   |sSO       |SVersion  |sIdioma|sCelular|sModeloCel|sSOCelular|
      |Jhon Alexander|Martinez Becerra|jhonpo1593@gmail.com|Septiembre|10  |1993 |Ibagué |730003|Colombia| Windows  |Windows 10|Spanish|LG      |X3        |Android   |
      Then se completa con exito