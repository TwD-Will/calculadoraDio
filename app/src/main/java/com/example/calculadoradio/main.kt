package com.example.calculadoradio

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt


fun main() {
    println("CALCULADORA EM KOTLIN")
    println("Todas as operaçoes desta Calculadora: %, /, *, -, +")
    println("[Para Exponeciação, use a letra 'q' ou 'Q' na operação]")
    println("[Para Porcentagem, use o caractere '%' na operação]")
    println("O Resto da divisão surge ao usar a Divisão")
    println()
    calcular()

}

fun calcular() {
    var n1: Float?
    var n2: Float?
    var operacao: String? = null
    val entrada = Scanner(System.`in`)

    do {

        do {
            print("Digite um valor: ")
            val leitor = entrada.nextFloat()
            n1 = leitor
        } while (n1 == null)
        do {
            print("Qual a operação: ")
            val leitorString = readLine()
            if (leitorString != null && leitorString != "") {
                if (leitorString == "+" || leitorString == "-" || leitorString == "*" ||
                    leitorString == "/" || leitorString == "q"
                    || leitorString == "Q" || leitorString == "%"
                ) {
                    operacao = leitorString
                } else {
                    println("Digite: +, - , /, * ou ^")
                }
            } else {
                println("ERROR!")
            }
        } while (operacao == null)
        do {
            print("Segundo valor:   ")
            val leitor = entrada.nextFloat()
            n2 = leitor
        } while (n2 == null)

        if (operacao == "+") {
            val soma = n1 + n2
            println("$n1 + $n2 = $soma")

        } else if (operacao == "-") {
            val subtracao = n1 - n2
            println("$n1 - $n2 = $subtracao")

        } else if (operacao == "*") {
            val multiplicacao = n1 * n2
            println("$n1 x $n2 = $multiplicacao")

           //divisao e resto da divisao
        } else if (operacao == "/") {
            val divisao = n1 / n2
            val restoDivisao = n1 % n2
            println("$n1 / $n2 = $divisao")
            println("Resto da divisão é $restoDivisao")

            //potencia e raiz quadrada
        } else if (operacao == "q" || operacao == "Q") {
            val potencia = n1.toDouble().pow(n2.toDouble())
            println("$n1 ^ $n2 = $potencia")
            val raizQuad = sqrt(n1.toDouble())
            println("Raiz Quadrada de $n1 = $raizQuad")

            //porcentagem
        } else if (operacao == "%") {
            val porcentagem = (n1 / 100) * n2
            println("$n1 %  de $n2 = $porcentagem")
        }
        println("Deseja continuar? s/n")
        val leitor = readLine()

    } while (leitor == "s" || leitor == "S")

    println("Bye!!! ")
}