package pl.kurs;

import pl.kurs.model.Person;
import pl.kurs.serrvice.PersonService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonService personService = new PersonService();

        System.out.println(personService.findOldestPerson(List.of(new Person("Adam", 33), new Person("Monika", 23), new Person("Ada", 43))));

        // polecenie clean - usuwa folder target
        // polecenie validate - waliduje strukture projektu
        // compile - kompiluje wszystkie pliki zdrodlowe i umieszcza je w targecie
        // test - uruchamia wszystkie testy jednostkowe  w projekcie
        // package - stworzy paczke z rozszrerzeniem jar

/*
cd - przejscie do folderu
cd.. - cofniecie sie do poprzedniego folderu
dir - wylistuje wszystkie pliki w folderze
 */
//        java -jar MavenLesson-1.0-SNAPSHOT.jar - polecenie do uruchomienia aplikacji w wierszu polecen jesli mamy zdefiniowana klase glowna
//        java -cp MavenLesson-1.0-SNAPSHOT.jar pl.kurs.Main(sciezka do klasy glownejj) -  polecenie do uruchomienia aplikacji w wierszu polecen jesli nie mamy zdefiniowanej klase glowna

        // verify - mozemy sprawdzc np czy odpowiednia ilosc kodu jest pokryta testami, jesli nie wywali blad

        // install - instaluje aplikacje na lokalnym repozytorium

        // site - tworzy dokumentacje techniczna projektu

        // deploy - wrzucenie aplikacji do firmowego repozytorium, jesli macie odpowiednie credentiale

        // todo
        // dodac zaleznosci z maven repository
        // odpalic aplikacje java -jar
        // stworzyc jara z zaleznosciami
        // stworzyc nowy projekt i uzyc go jako dependency


        // pd zainstalowac mavena i jave wedlug instrukcji
        // sprawdzic czy maven dziala w terminalu
        // pobawic sie poleceniami
        // stworzyc nowy projekt w strkuturze maven i podzielic na paczki z modelem, klasa serwisowa

    }
}
