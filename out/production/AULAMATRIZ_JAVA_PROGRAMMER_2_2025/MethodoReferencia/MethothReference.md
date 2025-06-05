***Method Reference***

Method Reference es una forma  corta de escribir las lamda que hace llamado a un metodo

List.forEach(s->system.out.println(s))

List.forEach(system.out::println);

variaciones contructor por referencia


()->new Persona();  => Persona::new

Tipos de Method Reference


forma 1 

Clase::staticMethod =>  Math:max    => metodos estaticos

objeto::instanceMethodo=> system.out::println =>Metodo de isntancia en un objeto

Clase::instanceMethod   => String::toUpperCase  => Metodo de una instancia de un objeto

Clase::new    => Persona::new => contructor ...creacion o instancia de objetos


Cuando no usar

* si se necesita una logica mas extensa , no suar Method Reference
* cuando el objeto no encada o no se comparte la firma o metodos no se puede relizar


sout("1qsad " +"!"# * + "#!#!)

string -> sout