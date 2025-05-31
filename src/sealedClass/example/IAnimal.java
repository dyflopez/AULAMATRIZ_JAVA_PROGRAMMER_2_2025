package sealedClass.example;

public sealed interface IAnimal permits Perro,Elefante{

    void sonido();
}
