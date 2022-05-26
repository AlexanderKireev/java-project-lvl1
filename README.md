##### Hexlet tests and linter status:
[![Linter Status](https://github.com/AlexanderKireev/java-project-lvl1/workflows/Make-build/badge.svg)](https://github.com/AlexanderKireev/java-project-lvl1/actions)
[![Actions Status](https://github.com/AlexanderKireev/java-project-lvl1/workflows/hexlet-check/badge.svg)](https://github.com/AlexanderKireev/java-project-lvl1/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/39897ff67dcef7944de2/maintainability)](https://codeclimate.com/github/AlexanderKireev/java-project-lvl1/maintainability)
[![Test Coverage](https://api.codeclimate.com/v1/badges/39897ff67dcef7944de2/test_coverage)](https://codeclimate.com/github/AlexanderKireev/java-project-lvl1/test_coverage)
## Проект "Игры разума" ("Brain Games")
Выполнен в рамках обучения в компании "Хекслет" ("Hexlet Ltd.") на курсе java-программирования.

Принят: 18 мая 2022 года. Студент: Киреев Александр. Куратор: Серов Андрей ("Hexlet Ltd.").

[![Hexlet Ltd. logo](https://raw.githubusercontent.com/Hexlet/assets/master/images/hexlet_logo128.png)](https://ru.hexlet.io/pages/about?utm_source=github&utm_medium=link&utm_campaign=java-package)

Проект представлен пятью играми: "Проверка на чётность", "Калькулятор", "НОД", "Арифметическая прогрессия", "Простое ли число?".

При старте проекта выводится текстовое меню выбора игр, которое, помимо пяти игр, включает два дополнительных пункта: первый - это "Приветсвие" и последний - "Выход".
```java
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
6 - Prime
0 - Exit
Your choice:
```
Необходимый пункт меню нужно выбрать вводом соответсвующего номера с клавиатуры. 

В случае выбора "Приветствия" программа завершается после ввода имени игрока, поприветствовав его.
```java
Welcome to the Brain Games!
May I have your name?

Hello, Bill!
```
При старте каждая из игр также предлагает ввести имя игрока с клавиатуры и, после его приветствия, выводит вопрос и три случайных варианта условий для решения.

Числовые ответы вводятся игроком с клавиатуры.

В случае трех верных ответов выводится поздравление игрока. 
```java
Correct!
Congratulations, Bill! 
```
В слачае ошибки - игра прерывается сообщением о "неверном ответе" и завершением программы.
```java
'72' is wrong answer ;(. Correct answer was '70'
Let's try again, Bill!
```
Первые четыре шага выполнения проекта посвящены обучению настройки окружения и реппозитория.

Дальнейшие пошаговые демонстрации проекта представлены ниже.
#### Step 5 of Project:
[![asciicast](https://asciinema.org/a/488451.svg)](https://asciinema.org/a/488451)
#### Step 6 of Project:
[![asciicast](https://asciinema.org/a/488478.svg)](https://asciinema.org/a/488478)
#### Step 7 of Project:
[![asciicast](https://asciinema.org/a/488494.svg)](https://asciinema.org/a/488494)
#### Step 8 of Project:
[![asciicast](https://asciinema.org/a/488678.svg)](https://asciinema.org/a/488678)
#### Final Step 9 of Project:
[![asciicast](https://asciinema.org/a/488679.svg)](https://asciinema.org/a/488679)