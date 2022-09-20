## Lekcja 11 - konfiguracja frameworka


Wprowadzenie mechanizmu konfiguracji na podstawie properties files. Będziemy chcieli dodać dwa oddzielne zestawy danych konfiguracyjnych w zależności od środowiska.

Cel: Chcemy mieć jeden scenariusz, na tyle dynamiczny aby można go było uruchomić na rożnych środowiskach. Przełączanie między środowiskami musi być maksymalnie łatwe.

Środowisko - to inny serwer, z innym URL i innymi danymi testowymi.

PropertyStore class
EnvironmentProperty class
BrowserEnvironment
.properities files:
  - global configuration
  - separate config file per environment

Materiały - czym jest properties w Java - Java Properties file examples - [https://mkyong.com/java/java-properties-file-examples/](Mkyong.com)


## Zadanie domowe.
Zaproponuj refactoryzację przedstawionego rozwiązania opartego na plikach .properties na rozwiązanie oparte na pliku w formacie yaml:
Materiały pomocnicze:
What is YAML? How it Works With Examples ([https://phoenixnap.com/blog/what-is-yaml-with-examples](phoenixnap.com))
Reading and Writing YAML Files in Java with Jackson ([https://stackabuse.com/reading-and-writing-yaml-files-in-java-with-jackson/](stackabuse.com))