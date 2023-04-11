# UniversityBiologyProject
<b>This is an abstract presentation of a cell model</b>
- The program implements an abstract model of a cell and its behavior during division
- A program using the principles of OOP and work with threads in the implementation of kotlin coroutines, also handling formatting errors during user interaction

The main purpose of the program is to show the basic behavior of a cell during division.

dedicated to the 100th anniversary of the birth of V.M. Hlushkova

<br></br>
<h2>Пояснення Українською.</h2>

У мене була ціль представити модель клітини з реалізацією ділення у парадигмі об'єктно орієнтованного програмування. 
Щоб це зробити я використав мову kotlin, з-за допомогою неї я реалізував абстракцію клітини. <br></br>
<img src="https://user-images.githubusercontent.com/52855607/231107494-b5d17971-b94f-4ac8-b4b5-d3c6b02a75bc.png" width="1000">
Абстракція мітить основні компоненти клітини та метод поділу, який у падальшому я реалізую як геометричну прогресію.

Саме ось і реалізація методу ділення клітини 
<img src="https://user-images.githubusercontent.com/52855607/231108777-58ca2a95-e669-4f17-bfcc-6f6311dc1cec.png" width="1000">
Тут я використовую геоиетричну прогресію з записом у новостворенний масив, щоб зручно отримати всі утворені клітини. Створення нової відбувається шляхом передачі всіх параметрів з батьківської до нової, тобто принцип генитичної спадковості клітини реалізований шляхом наслідування від супер класу, тобто батьківської клітини.

<h4>Приклад роботи програми</h4>
Я створюю клітину та викликаю метод ділення у неї, вказуючи кількість (2).
<img src="https://user-images.githubusercontent.com/52855607/231112411-b1cf1110-1006-4d0a-b732-c437e7ecdaee.png" width="1000">

Тут ми бачимо візуально як поділилася клітина, вона взяла батьківські компоненти клітини з тим самимм індефікатором, що говорить про перейняття генетичної складової, протое, при цьому змінився основний індефікатор, бо клітина новоутворенна.
<img src="https://user-images.githubusercontent.com/52855607/231113137-d7a48082-3a62-444a-baa5-99d88c384e8e.png" width="1000">


