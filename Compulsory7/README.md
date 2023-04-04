O matrice de dimensiuni n x n reprezinta o harta, iar elementele acesteia reprezinta "celulele" ce trebuie vizitate de cate exact un robot.
Fiecare robot are un nume si extrage in fiecare "celula" nou vizitata un numar random de token-uri din lista de numere de la 1 pana la n^3 (amestecate), ce este initializata in clasa SharedMemory, la care au acces toti robotii. Retinem cu ajutorul metodelor din clasa Cell celulele care au fost deja vizitate. 
Pentru fiecare dintre roboti este creat cate un thread in clasa Exploration, cu metoda start(). 
Metoda extractTokens() din clasa SharedMemory de tip synchronized se asigura ca lista de token-uri nu poate fi modificata de mai multi roboti in acelasi timp.
