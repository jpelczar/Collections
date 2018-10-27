/**
 * Zasada działania:
 * Dodanie elementów 4,5,7,9
 * Reprezentacja na LinkedStack:
 * Element(value: 9, previous: Element(value: 7, previous: Element(value: 5, previous: Element(value: 4, previous: null))))
 */
public class LinkedStack<T> implements Stack<T> {

    /**
     * Najpierw ustawaimy head na null - to oznacza że na naszym stosie nie ma elementów
     */
    private Element head = null;

    @Override
    public void push(T value) {
        if (isEmpty()) { //jeśli stos jest pusty dodajemy pierwszy element bez poprzednika
            head = new Element(value, null);
        } else { //jeśli head nie jst nullem wówczas zostanie ustawiny nowy head w którym jako poprzednik zostanie ustawiona jego poprzednia wartość
            head = new Element(value, head);
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) { //jeśli stos jest pusty zwórć null, w przeciwnym wypadku head.previous rzuci NullPointerException ponieważ head jest null
            return null;
        }
        Element toPop = head; //zapisz obecny head do zmiennej pomocniczej
        head = head.previous; //ustaw jako nowy head poprzednik obecnego
        return toPop.value; //pobierz wartość z elementu head który został właśnie zdjęty ze stosu
    }

    @Override
    public T poll() {
        if (isEmpty()) { //jesli stos jest pusty zwroc null, w przecinym wypadku head.value rzuci NullPointerException ponieważ head jest null
            return null;
        }
        return head.value; //pobierz wartość z obecnego elementu head
    }

    @Override
    public boolean isEmpty() {
        return head == null; //jeśli head jest null oznacza to że stos jest pusty
    }

    /**
     * Klasa do przechowywania struktury pojedyńczego elementu przechowywanego na stosie
     */
    private class Element {
        private T value; //wartość przechowywana w elemencie
        private Element previous; //poprzednik elementu - przydatny do przechowywania kolejności elementów na stosie.
        //Każdy nowo dołożony element będzie posiadał odwołanie do elementu wczesniejszego które jest niezbędne do prawidłowego działania stosu.

        public Element(T value, Element previous) {
            this.value = value;
            this.previous = previous;
        }
    }
}
