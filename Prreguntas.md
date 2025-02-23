1️⃣ ¿De qué tipo genera la lista articulos por defecto el compilador?

List<Articulo> porque todos los elementos heredan de Articulo.

2️⃣ ¿Qué ocurre con el polimorfismo en este ejemplo?

La lista contiene objetos de distintas clases (Articulo y Ordenador), pero se pueden manejar de forma uniforme porque Ordenador hereda de Articulo.
Se puede aplicar promocionNavidad() a todos, y el método correcto se ejecuta en función del tipo de objeto (polimorfismo dinámico).

3️⃣ ¿Qué pasaría si creáramos la lista con listOf<Ordenador>?

Solo podríamos almacenar objetos de tipo Ordenador.
No podríamos incluir Articulo normales.
Se perdería la generalización de Articulo.

4️⃣ ¿Qué pasaría si la hiciéramos con listOf<Any>?

Se podría almacenar cualquier tipo de objeto (no solo Articulo y Ordenador).
Perderíamos la capacidad de invocar métodos específicos de Articulo sin hacer casting (it as Articulo).
