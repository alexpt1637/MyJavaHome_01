// С помощью функции prompt() в браузере выводится диалоговое окно с предложением ввести некоторое значение.
// Второй аргумент в этой функции указывает на значение, которое будет использоваться по умолчанию.
    var strSum = prompt("Введите сумму вклада", 1000);
    var strPercent = prompt("Введите процентную ставку", 10);
    var sum = parseFloat(strSum);
    var procent = parseFloat(strPercent);
    sumYar = sum + sum * procent / 100;
    console.log("После начисления процентов сумма вклада составит: " + sumYar);

    sumMon = sum * procent / 100 / 12;
    console.log("Доход от процентов в месяц равен: " + sumMon);

    var numbers = [1, 2, 3, 4];
    console.log(...numbers);    // 1 2 3 4
    numbers[1] = 45;
    console.log("Второй элемент массива: " + numbers[1]);
    console.log(...numbers);

    var str1 = "У Лукоморья дуб зелёный, \nЗлатая цепь на дубе том, \nИ днем, и ночью кот учёный \nВсё ходит по цепи кругом.";
    alert(str1);
    var str2 = "Пойдет направо - песнь заводит, \nНалево - сказку говорит... \nТам чудеса, там леший бродит, \nРусалка на ветвях сидит.";
    alert(str2);