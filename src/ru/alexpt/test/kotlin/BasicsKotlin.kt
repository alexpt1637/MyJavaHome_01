package ru.alexpt.test.kotlin

import com.sun.xml.internal.fastinfoset.util.StringArray
import jdk.nashorn.internal.objects.Global.print
import java.text.SimpleDateFormat
import java.util.*

// main() — точка входа в приложение
fun main(args: Array<String>) {
    //------------------------------------------------- Переменные -----------------------------------------------------
    // мы можем сразу присвоить переменной начальное значение при ее объявлении. Такой прием называется инициализацией:
    var a = 23
    println("a: " + a)

    var b = 54
    println("b: " + b)

    var c1: Float
    c1 = (a + b).toFloat()
    println("c1 = a + b = " + c1)

    val c2: Float
    c2 = (b - a).toFloat()
    println("c2 = b - a = " + c2)

    val c3: Float
    val c4: Float
    c3 = c1 / c2
    println("c3 = c1 / c2 = " + c3)
    c4 = c2 * c3
    println("c4 = c2 * c3 = " + c4)

    b = 45
    println("новое значение b: " + b)
    c1 = (a + b).toFloat()
    println("новое значение с1 = (a + b): " + c1)

    c1 = (a % b).toFloat()
    println("новое значение с1 = (a % b): " + c1)

    //------------------------------------------------- Типы данных ----------------------------------------------------
    // Kotlin не имеет встроенных примитивных типов. Все типы представляют определенные классы.
    // Любые литералы, которые представляют целые числа, воспринимаются как данные типа Int.
    var i: Int = 45
    // Если число представляет значение типа Long, то следует использовать суффикс L:
    val l: Long = 45L
    // Все числа с плавающей точкой (содержат точку в качестве разделителя целой и дробной части) рассматриваются как числа типа Double:
    val d: Double = 68.71
    // Если данные будут представлять тип Float, то необходимо использовать суффикс F:
    val f: Float = 68.71F
    // Тип Boolean может хранить одно из двух значений: true (истина) или false (ложь).
    val a1: Boolean = true
    val b1: Boolean = false
    // Символьные данные представлены типом Char. Он представляет отдельный символ, который заключается в одинарные кавычки.
    val a2: Char = 'A'
    val b2: Char = 'B'
    val it: Int
    it = a2.toInt() + b2.toInt()
    println(message = "Char a2 = $a2, Char b2 = $b2")   // Char a2 = A, Char b2 = B
    println(message = "Int it = a2 + b2 = " + it)       // Int it = a2 + b2 = 131
    val fit: Float
    fit = it.toFloat() / 2
    println(message = "fit = $fit")                     // fit = 65.5
    println(message = "Char fit = ${fit.toChar()}")     // Char fit = A
    val cha: Int
    cha = it - b2.toInt()
    println("Int cha = $cha")                            // Int cha = 65
    println(message = "Char cha = ${cha.toChar()}")      // Char cha = A
    val chb: Int
    chb = it - a2.toInt()
    println("Int chb = $chb")                            // Int chb = 66
    println(message = "Char chb = ${chb.toChar()}")      // Char chb = B

    /*Тип Char может представлять специальные последовательности, которые интерпретируются особым образом:
    \t: табуляция
    \n: перевод строки
    \r: возврат каретки
    \': одинарная кавычка
    \": двойная кавычка
    \\: обратный слеш*/

    val name: String = "Тип Char преобразован в стоку: ${cha.toChar()}${chb.toChar()}"
    println(name)
    println()

    // если необходимо вставить в текст перевод на другую строку, можно использовать эскейп-последовательность \n
    val text1: String = "Если необходимо вставить в текст перевод на другую строку, \nможно использовать эскейп-последовательность \\n"
    println(text1)
    println()

    // при создании многострочного текста можно использовать тройные двойные кавычки:
    val text2: String = """Если необходимо вставить в текст
перевод на другую строку при создании многострочного текста
можно использовать тройные двойные кавычки."""
    println(text2)
    println()

    // с помощью знака доллара $ мы можем вводить в строку значения различных переменных:
    val firstName = "Tom"
    val lastName = "Smith"
    val welcome = "Hello, $firstName $lastName"
    println(welcome)                                        // Hello, Tom Smith

    val name2 = "Tom"
    val age = 22
    val userInfo = "Your name: $name2, Your age: $age"
    println(userInfo)                                       // Your name: Tom, Your age: 22

    // Тип Any является базовым для всех остальных типов.
    // Остальные базовые типы, такие как Int или Double, являются производными от Any.
    // Соответственно мы можем присвоить переменной данного типа любое значение:
    var name3: Any = "Tom Smith, \nage: $age"
    println("Результат: $name3")                            // Результат: Tom Smith, age: 22
    name3 = c3
    println("c3: $c3")                                      // c3: 2.483871
    println("name3: $name3")                                // name3: 2.483871

    // Kotlin позволяет выводить тип переменной на основании данных, которыми переменная инициализируется.
    // компилятор увидит, что переменной присваивается значение типа Int, поэтому переменная agee будет представлять тип Int
    // при этом нам обязательно надо инициализировать переменную некоторым значением.
    val agee = 5
    val namee = "Tom"
    println("Вывод данных: $namee, $agee")                  // Вывод данных: Tom, 5
    println()

    //------------------------------------------ Арифметические операции -----------------------------------------------
    // ++ (инкремент): увеличивает значение на единицу
    // -- (декремент): уменьшает значение на единицу
    // +=: присваивание после сложения
    // -=: присваивание после вычитания
    // *=: присваивание после умножения
    // /=: присваивание после деления
    // %=: присваивание после деления по модулю

    //------------------------------------------ Побитовые операторы ---------------------------------------------------
    // Операции выполняются над двоичными разрядми числа, побитовые операторы применяются только к данным типов Int и Long

    //----------------------------------- Условные выражения / Операции отношения --------------------------------------
    a = 11
    b = 12
    val cc : Boolean =  a > b
    println("cc = $cc")                             // false - a меньше чем b

    val dd = 35 > 12
    println("dd = $dd")                             // true - a больше чем b
    println()

    //----------------------------------- Условные конструкции / if...else ---------------------------------------------
    // Если блок кода состоит из одного выражения, то фигурные скобки можно опустить:
    a = 10
    if(a == 10)
        println("a равно 10")

    a = 12
    if(a == 10)
        println("a равно 10")
    else
        println("a НЕ равно 10, а равно $a")
    println()

    // Если необходимо проверить несколько альтернативных вариантов, то можно добавить выражения else if:
    a = 22
    if(a == 10) {
        println("a равно 10")
    }
    else if(a == 9){
        println("a равно 9")
    }
    else if(a == 8){
        println("a равно 8")
    }
    else{
        println("a имеет неопределенное значение (a = $a) \n")
    }

    b = 42
    if (a > b)
        println("а больше b: $a > $b")
    else
        println("a меньше b: $a < $b")
    println()

    //------------------------------------------- Конструкция when -----------------------------------------------------
    // Конструкция when проверяет значение некоторого объекта и в зависимости от его значения выполняет тот или иной код
    // Конструкция when аналогична конструкции switch в других языках
    a = 12
    when(a){
        10 -> println("a = 10")
        20 -> println("a = 20")
        else -> println("неопределенное значение, a = $a")      // Выражение else не обязательное, его можно не определять
    }
    println()

    // Если надо, чтобы при совпадении значений выполнялось несколько инструкций, то для каждого значения можно определить блок кода
    a = 10
    when(a){
        10 -> {
            println("a = 10")
            a *= 2
        }
        20 -> {
            println("a = 20")
            a *= 5
        }
        else -> { println("неопределенное значение")}
    }
    println("Значение 'а' после выполнения второго действия в блоке: а = $a")

    // Можно определить одни и те же действия сразу для нескольких значений. В этом случае значения перечисляются через запятую
    a = 10
    when(a){
        10, 20 -> println("a = 10 или a = 20")
        else -> println("неопределенное значение")
    }

    // Также можно сравнивать с целым диапазоном значений с помощью оператора in
    a = 30
    when(a){
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")           // a в диапазоне от 20 до 29
        !in 10..20 -> println("a вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }
    // связка операторов !in позволяет проверить отсутствие значения в определенной последовательности

    // Как и if конструкция when может возвращать значение
    val sum = 1000

    val rate = when(sum){
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println("Возвращенное значение: $rate")       // 15
    println()
    // если значение переменной sum располагается в определенном диапазоне, то возвращается то значение, которое идет после стрелки

    //------------------------------------------------ Циклы / Цикл for ------------------------------------------------
    // Цикл for пробегается по всем элементам коллекции - цикл for в Kotlin эквивалентен циклу for-each в ряде других языков программирования
    /*Его формальная форма выглядит следующим образом:
    for(переменная in последовательность){
        выполняемые инструкции
    }*/

    // цикл while:  Цикл while повторяет определенные действия пока истинно некоторое условие:
    var x = 5
    while (x > 0) {
        println("цикл while: " + x--)
    }
    println()

    // цикл do-while:   вначале выполняется блок кода после ключевого слова do, а потом оценивается условие после while
    // Если условие истинно, то повторяется выполнение блока после do.
    // Если i не соответствует условию, блок do выполнится хотя бы один раз.
    i = 5
    do{
        println("Цикл do-while: " + i*i)
        i--
    }
    while(i > 10)
    println()

    // возникает необходимость при некоторых условиях не дожидаться выполнения всех инструкций в цикле, перейти к новой итерации
    println("оператор continue:")
    for(n in 1..8){
        if(n == 5) continue
        println(n * n)
    }
    println()

    // при некоторых условиях нам вовсе надо выйти из цикла, прекратить его выполнение. В этом случае применяется оператор break:
    println("оператор break:")
    for(n in 1..5){
        if(n == 5) break
        println(n * n)
    }
    println()

    //-------------------------------------------- Последовательности --------------------------------------------------
    // Последовательность представляет набор значений или диапазон: https://metanit.com/java/kotlin/2.8.php
    var range = 1..5    // последовательность [1, 2, 3, 4, 5]

    //------------------------------------------------- Массивы --------------------------------------------------------
    // https://metanit.com/java/kotlin/2.3.php
    // val numbers: Array<Int>
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val n = numbers[1]  // получаем второй элемент  n=2
    println("Второй элемент n = $n")
    println("Пятый элемент массива равен = " + numbers[4])
    numbers[4] = 7      // переустанавливаем пятый элемент
    println("Пятый элемент массива после переустановки равен = " + numbers[4])
    println()

    val phones: Array<String> = arrayOf("Galaxy S8", "iPhone X", "Motorola C350")

    // Для перебора массивов применяется цикл for:
    for(phone in phones){
        println(phone)
    }
    println()

    phones[2] = "LG"
    println(phones[2])
    println(phones[1])
    println(phones[0])
    println()

    val num = IntArray(3, {5})
    val doub = DoubleArray(3, {1.5})
    num[1] = 256
    doub[1] = 10.24
    doub[2] = 6.5
    for(num in num){
        println("num = IntArray: $num")
    }
    println()
    for(doub in doub){
        println("doub = DoubleArray: $doub")
    }
    println()

    val bit = IntArray (5, {128})
    bit[1] = bit[0] * 2
    bit[2] = bit[1] * 2
    bit[3] = bit[2] * 2
    bit[4] = bit[3] * 2

    for(bit in bit){
        println(bit)
    }
    println()

    val ch = bit.toList()
    for(ch in ch){
        println("List: $ch")
    }
    println()


    val dyd: String = "ABRAKADABRA"
    val dydpars = dyd.toCharArray()

    for(dydpars in dydpars){
        println(dydpars)
    }
    println()

    val dydlist = dydpars.toList()
    println(dydlist)

    val dydstr = dydlist.toString()
    println(dydstr)
    println()

    var k: Int = 0
    println(dydpars[k+1])

    var j = 1066
    var j1 = j.toChar()
    println(j1)

    var j2 = dydpars[k+1]
    val g2 = j2.toInt()
    println(g2)

    var j3 = dydpars[k+2]
    val g3 = j3.toInt()
    println(g3)
    println()

    // можем проверить наличие или отсутствие элементов в массиве с помощью операторов in и !in:
    println(4 in numbers)       // true
    println(2 !in numbers)      // false
    println(10 in numbers)      // false
    println(1 in numbers)       // true
    println()

    // Двухмерные массивы
    // Используя индексы, можно обращаться к подмассивам в подобном массиве, в том числе переустанавливать их значения:
    val table = Array(3, { Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)

    table[0][1] = 6  // второй элемент первой строки
    val w = table[0][1]     // t = 6
    println(w)

    // Используя два цикла, можно перебирать двухмерные массивы
}