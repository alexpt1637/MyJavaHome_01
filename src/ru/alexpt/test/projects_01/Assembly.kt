package ru.alexpt.test.projects_01

import java.util.*

fun main(args: Array<String>) {
    wer()
}

fun wer(){
    val k = 30000
    val `in` = Scanner(System.`in`)
    println("Введите кодовую фразу (ключ):")
    val textkey: String = `in`.nextLine()

    val textkey1 = textkey.toList()
    println(textkey1)

    val i = 0
    val j = 0
    addkey(textkey1, i, j, k)
    println("-----------------------------------")
}