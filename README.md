# Södra Teknisk Uppgift

### 1. SQL

```
SELECT Avdelning, COUNT(*) FROM Medarbetare GROUP BY Avdelning;
```
### 2. Imperativ programmering

I den här lösningen har jag använt HashSet för att lagra tecken i en unik uppsättning. Jag har sett till att endast använda små bokstäver för att göra det snabbare att kontrollera strängen. 
Jag har installera gradle också och testa olika sätt. I min lösning jag kommer till Arkitektur trade-off. Om jag vill att bara kontrollera bokstaver inte special characters vi vill ha problem med "ö å ä". 
Och om svensk bokstaver är krav jag kan inte kolla om char is alphabetic!

#### Run application:

Gå till en unix-baserad terminal eller Gitbash på Windows och run:

./gradlew build
./gradlew run

Det kan vara problem med svensk bokstaver som "åöä" på IntelliJ eller Coomand Prompt terminal.
 