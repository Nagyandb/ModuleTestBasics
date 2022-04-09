package main;

/**
 * Elméleti kérdések.
 * Mindegyik kérdésre a kérdés saját blokk kommentjén belül válaszolj!
 */
public class Theorem {

    /* Milyen primitív adattípusok léteznek a Java-ban? Sorold fel őket! - 1p
        - Vannak egész szám típusok:
        * byte
        * short
        * int
        * long

        - Vannak törtszám típusok:
        * float
        * double

        - Továbbá vannak olyan primitív adattípusok, amleyek nem számtípusok:
        * char ( ez egyetlen karaktert ad meg az Aascii ábécéből)
        * boolean ( ez edig egy logikai változo, vagy igaz)true) vagy hamis (false) értéke lehet)

     */


    /* Mi a különbség a while és a do-while ciklusok között? - 2p
        A while elöltesztelős ciklus másnéven, míg a do-while az ún. hátultesztelős, vagyis míg a while-ban a felttelt a
        ciklus kulcsszava után írjuk ki, addíg a do-while esetében ezt a blokk után beírandó while kulcsszó után tesszük.
        A while esetében tudjuk hogy hányszor kell iterálnunk, míg a do-while esetében nem.
        A while-nál a feltétel vizsgálata a feltétel vizsgálata megeleőzi az utasításblokkot, míg a do-while esetében
        annak vizsgálata az utasításblokk után történik meg.
     */


    /* Mik a tömbök? (Mire használhatóak? Mikor érdemes használni őket? Hogyan hozhatjuk létre őket?) - 3p
        A tömb nem más, mint azonos adattípusú változók, elemek halmaza, amelyben tárolhatjuk őket.
        Előre meghatározott a hosszuk, amit nem kell a deklarálásnál megadni de a hosszukat nem tudjuk változtatni.
        Az elemek mind kapnak egy sorszámot, ezek az indexek. Az indexelés 0-val kezdődik, és az utolsó elemet a tömb
        hossza - 1 "képlettel" adhatunk meg. Például:
        int[] numbers = new int [10]
        első eleme: numbers[0]
        utolsó eleme: numbers[numbers.length - 1]
        Fontos  megemlíteni hogy abban az esetben ha itt például egy olyan elemre hivatkozunk, amely nem létezik akkor
        hibaüzenetet kapunk: "ArrayIndexOutOfBoundsException"
        Például ha a fenti tömbből a tömb 11-ik elemét akarjuk megadni az így nézne ki:
        numbers[10] -- erre megkapnánk a fenti hibaüzenetet.

        Léteznek többdimenziós tömbök is, vagyis egy tömbben lehet több masik is. Ha például veszünk egy kétdimenziós
        tömböt, az sorokból és oszlopokból áll.
        Ennek képlete például:
        int numbersDimension[][] =  new int[3][8]


        Itt például a tömb harmadik sorát ami a második indexen található, adtuk meg, és annak az utolsó, hetedik indexen levő
        elemét
        int elementOfArray = nubemrsDimension[2][7]


     */

}
