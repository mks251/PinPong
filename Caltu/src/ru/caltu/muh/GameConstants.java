package ru.caltu.muh;

/**
*Этот интерфейс содержит все константы,которые используются в игре
*/
public interface GameConstants {
// Размеры стола
public final int TABLE_WIDTH = 320;  
public final int TABLE_HEIGHT = 220;
public final int TABLE_TOP = 12;
public final int TABLE_BOTTOM = 180;
// Шаг перемещения мяча в пикселях!
public final int BALL_INCREMENT = 4;
// Максимальные и минимальные координаты мяча
public final int BALL_MIN_X = 1+ BALL_INCREMENT;
public final int BALL_MIN_Y = 1 + BALL_INCREMENT;
public final int BALL_MAX_X = TABLE_WIDTH - BALL_INCREMENT;
public final int BALL_MAX_Y = TABLE_HEIGHT - BALL_INCREMENT;
// Начальные координаты мяча
public final int BALL_START_X = TABLE_WIDTH/2;
public final int BALL_START_Y = TABLE_HEIGHT/2;
//Размеры, расположения и шаг перемещения ракеток
public final int KID_RACKET_X = 300;
public final int KID_RACKET_Y_START = 100;
public final int COMPUTER_RACKET_X = 15;
public final int COMPUTER_RACKET_Y_START = 100;
public final int RACKET_INCREMENT = 2;
public final int RACKET_LENGTH = 30;
public final int RACKET_WIDTH = 5;
public final int WINNING_SCORE = 21;
// Замедлить быстрые компьютеры – измените это значение, 
// если понадобится
public final int SLEEP_TIME = 10; //время в миллисекундах
}
/*!
Ниже! я! перечислил! основные! изменения,! которые! ! сделал! в! классе!
PingPongGameEngine:!!
!
"  Удалил!интерфейс!MouseListener!и!все!его!методы,!потому!что!
мы!больше!не!обрабатываем!клики!мыши.!Все!движения!мыши!
будут!обрабатываться!MouseMotionListener.!
!
"  Теперь!этот!класс!реализует!интерфейс!Runnable,!а!вся!логика!!
находится!в!методе!run().!Посмотрите!на!конструктор!–!там!я!
создаю! и! запускаю! новый! поток.! Метод! !run()! обрабатывает!
правила! игры! в! несколько! шагов,! все! эти! шаги!
запрограммированы! внутри! условия! if(ballServed).! Это!
сокращенный!вариант!выражения!!if(ballServed==true).!
!
"  Пожалуйста,! обратите! внимание! на! условие,! которое!
устанавливает!значение!переменной!canBounce!в!первом!шаге.!
В!зависимости!от!этого!выражения,!значение!переменной!будет!
либо!true,!либо!false.!!
Программирование на Java для детей, родителей, бабушек и дедушек  211
!
"  Класс! реализует! интерфейс! ! KeyListener,! и! метод!
keyPressed()! проверяет,! какая! кнопка! была! нажата! для!
начала/завершения! игры,! либо! подачи! мяча.! Этот! метод!
позволяет!обрабатывать!как!заглавные,!так!и!маленькие!буквы,!
например!N!и!n.!
!
"  Я! добавил! ! несколько!private! методов:!displayScore(),!
kidServe()! и! isBallOnTheTable().! Они! объявлены!
приватными,! потому! что! используются! только! внутри! этого!
класса! ! и! другие! классы! даже! не! подозревают! об! их!
существовании.!Это!пример!инкапсуляции!в!действии.|!
!
"  Некоторые! компьютеры! настолько! быстрые,! что!
контролировать!движение! мяча! становится! трудно.! Поэтому! я!
замедлил! игру! с! помощью! метода! Thread.sleep().!
Статический! метод!sleep()! приостановит! текущий! поток! на!
заданное!в!конструкторе!количество!милл*/