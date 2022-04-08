package com.cursoandroid.fundamentoskotlin

import java.lang.Math.abs

class Funciones {
}

fun main()
{
    sayHello();

    val num1 = 2;
    val num2 = 3;

    println("$num1 + $num2 = ${plus(num1, num2)}");
    println("$num1 - $num2 = ${subtract(num1, num2)}");

    newTopic("Infix");
    val c = -3;

    println("$num1 + $c = ${plus(num1, c)}");
    println("$num1 + $c = ${plus(num1, c.enableAbs(true))}")
}

//mismo archivo de kotlin con private
//Unit es com el void aunque por defeault sino especificamos que retorna algo lo toma como void
private fun sayHello(): Unit
{
    println("como fue")
}

fun plus(num1: Int, num2: Int): Int
{
    return num1 + num2;
}

fun subtract(num1: Int, num2: Int) = num1 - num2

//las funciones infix
//abs es funcion de valor absoluto
infix fun Int.enableAbs (enable: Boolean) = if(enable) abs(this) else this
