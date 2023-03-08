Am creat clasa Problem ce reprezinta instanta unei "probleme". Am declarat 2 vectori de obiecte, unul de tip Location si unul de tip Road. 

Cu ajutorul metodei equals din clasa Object, pe care am adaptat o la clasele Location si Road, putem compara 2 obiecte de acelasi tip pentru a vedea daca sunt egale sau nu. Astfel, in clasa Problem, cand adaugam un nou obiect in vector cu metoda addLocation/addObject, acesta va fi mai intai comparat cu obiectele din vector, pentru a nu avea un drum sau o locatie adaugata de mai multe ori in lista.

Am creat clasele Airport, City, Gasstation mostenitoare ale clasei Location ce reprezinta tipul obiectelor clasei Location. Acestora le am adaugat proprietati specifice: Airport-nrTerminals, nrAirlines, name, City-population, area, Gasstation-gasPrice, si constructori.

In clasa Problem verificam daca datele unei "probleme" sunt valide: calculam cu metoda calcDist() distanta euclidiana dintre locatia de pornire si destinatia unui drum si apoi cu metoda addRoad() verificam daca aceasta distanta este mai mare sau egala cu lungimea deumului respectiv. Daca aceasta conditie este indeplinita atunci datele problemei sunt valide si le putem adauga in vectori.
