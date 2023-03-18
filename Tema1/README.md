# Programare-Avansata

Tiron Claudia-Irina 2A2

Tema1: Main.java

In clasa Main am construit 2 metode : main() si latinSquare().

In metoda latinSquare() creez o matrice mat de dimensiune n x n. For-ul de la i=0 la n parcurge fiecare linie a matricei care va fi completata cu valori de la 1 la n astfel:

-for-ul de la j=i la n  parcurge linia curenta i de la al i-lea element pana la capat si completeaza aceste pozitii cu valori crescatoare incepand de la p=1

-for-ul descrescator de la k=i-1 la 0 parcurge in sens invers linia curenta i de la pozitia i-1 pana la pozitia 0 si completeaza aceste pozitii cu valori descrescatoare incepand de la q=n.

Apoi adaug un if care pentru n<30.000 face ca metoda latinSquare() sa afiseze matricea cu ajutorul functiei Arrays.deepToString() si a functiilor replace(), cu care afisam liniile si coloanele matricei. Pentru n>=30.000 metoda afiseaza doar timpul de executie in nanosecunde cu ajutorul functiei "System.nanoTime()".

Metoda main citeste si valideaza de la linia de comanda un numar n. Este apelata apoi metoda latinSquare pentru acest numar n. 
