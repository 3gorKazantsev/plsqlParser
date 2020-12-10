# PL/SQL to JSON antlr4
Парсинг PL/SQL в JSON при помощи готового файла грамматики и библиотеки ANTLR4

~~Начало работы~~
---
Перед тем как запускать метод `parse(input, output)` вы должны сгенерировать
файлы в каталог grammar. Для этого нужно:
- Установить плагин ANTLRv4 в вашу IDEA
- Правый клик по PLSQL.g4:
    * Configure ANTLR...<br>
        Output directory - `.\plsqlParser\src\main\java`<br>
        Location of imported grammar -  `.\plsqlParser\src\main\java\com\ekazantsev\grammar`<br>
        Остальное оставляем пустым
    * Generate ANTLR Recognizer
    
После этого в каталоге grammar должны появиться следующие файлы <br>
![img1](https://sun9-67.userapi.com/impg/A6-yhKJ_r4XCzs1UZpgU9oS6Li7uJV_EwDdOUw/Vm3hl2-Il18.jpg?size=133x204&quality=96&proxy=1&sign=e65965115f353e2e5d52786cf7d82800)

Возможные ошибки
---
IDEA может не воспринимать PLSQLParser.java как класс и будет видеть
его как Java file. 

Чтобы это исправить:
- Help > Edit Custom Properties...
- Вставляем туда это `idea.max.intellisense.filesize=25000`
- Перезапускаем IDEA

P.S. Данная ошибка никак не влияет на компиляцию

Просмотр дерева
---
Чтобы просмотреть построенное дерево:
- Заходим в файл грамматики (PLSQL.g4)
- Правый клик по `sql_script()` > Test Rule sqlscript
- В ANTLR Preview выбираем путь до .sql файла

Работа через командную строку
---
`-i` - input (папка или sql файл)<br>
`-o` - output (папка или json файл)

Работа с папками:
- `java parserPLSQL -i G:/path/to/input/Folder` <br>
    При указании флага `-i` и одного параметра (путь до папки
    с sql файлами) рядом с Folder создастся FolderJSON,
    в которой будут находиться все сгенерированные JSON файлы.
- `java parserJSON -i G:/path/to/input/Folder -o G:/output/Folder` <br>
    При указании флага `-i` и двух параметров генерация JSON
    файлов будет происходить в указанную папку после ключа `-o`.
    
Работа с файлами:
- `java parserPLSQL -i G:/path/to/file.sql -o G:/path/to/file.json` <br>
    Генерация JSON файлов в указанный файл после ключа `-o`.
- Использование только одного параметра недопустимо.

Dependencies
---
- [antlr4 4.9](https://mvnrepository.com/artifact/org.antlr/antlr4/4.9)
- [Gson 2.8.6](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.6)
- [Apache Commons CLI 1.4](https://mvnrepository.com/artifact/commons-cli/commons-cli/1.4)
- [Apache Commons IO 2.7](https://mvnrepository.com/artifact/commons-io/commons-io/2.7)
