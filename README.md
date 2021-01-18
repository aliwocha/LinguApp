## **LinguApp (javastart.pl)**

Aplikacja LinguApp służy do nauki słówek. Posiada ona dwie główne funkcjonalności:
* dodawanie nowych słówek do bazy,
* test językowy polegający na wylosowaniu kilku fraz i konieczności ich poprawnego przetłumaczenia.

Szkielet projektu aplikacji LinguApp wraz z główną logiką aplikacji został wcześniej przygotowany przez twórcę kursu. Moim zadaniem było rozszerzyć jej możliwości i dodać nowe funkcjonalności, które w przyszłości ułatwią wprowadzanie zmian. Zmiany wprowadzone przeze mnie:
* dodanie do projektu Springa i zastosowanie wstrzykiwania zależności w miejscach, w których to było konieczne
* możliwość modyfikacji formatu tekstu drukowanego w konsoli ze zwykłego na tekst pisany wielkimi literami
* odczytywanie ścieżki do pliku źródłowego z pliku application.properties
* dodanie profili produkcyjnego i deweloperskiego oraz szyfrowania pliku szyfrem Cezara w profilu produkcyjnym
