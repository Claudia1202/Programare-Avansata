Am creat cate o clasa pentru comenzile: Add, List, View, Report. Am utilizat o interfata Commands pentru a descrie comanda generica.
Clasa AddCommand implementeaza comanda cu ajutorul careia adaugam documente in catalog.
Clasa ListCommand afiseaza pe ecran lista de documente adaugate in catalog.
Clasa ViewCommand deschide documentul specificat.
Clasa RaportCommand creează (și deschide) un raport HTML reprezentând conținutul catalogului, cu ajutorul unui template Velocity ("raport.vm").
Comenzile invalide vor fi semnalate cu ajutorul exceptiilor "InvalidCatalogException" si "InvalidDocException".
