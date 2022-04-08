package com.cursoandroid.fundamentoskotlin

class Principal {

}

fun main(){
    //print("Hola Kotlin");
    newTopic("Hola Kotlin");
    newTopic("Variables y constantes");
    val const = 0;//constante
    var variable: Int;
    variable = 4;
   //las variables y constantes adquieren el tipo de dato con el que se inicializan y no se puede cambiar
    println("constante: $const Variable: $variable")//para utilizar variables o constantes deben ser inicializadas

    newTopic("Datos nulos");

    var objNull: String?;//? la variable puede contener null
    objNull = null; //ninguna variable o constante por default es null, para ello en su declaración tiene que llevar un ?

    println(objNull);

}

fun newTopic(topic: String){
    print("====================== $topic =====================\n");
}


