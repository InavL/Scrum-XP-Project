# Sprint backlog

## Mål

* Komma fram till vad vi borde prioritera och vad tror vi att vi kan klara av.

* Börja kl 9 varje dag. Jobba med parprogrammering.

* Sätta upp alla program.

* Läsa litteratur.

* Skapa strukturen med inlägg och kanske inloggningsfunktion.

* Arbeta 6h varje dag resterande av veckan.

* 120h inplanerad första sprinten (lite lågt).

## Vad behöver vi göra

Skapa en databas, grund till programmet samt en inloggningsfunktion.

Helt ta bort allt som har med icke-inloggade användare.

## Övrig

Det kommer inte att finnas någon funktionalitet för icke-inloggade. Första rutan kan därför vara en inloggningsruta.

En **SuperAdmin** har access till allt. En **lägre admin** har ansvar för forskning och **en annan** för grundutbildning och det informella. **Användare** ska kunna vara forsknings eller utbildningsanknuten. Fem olika användarklasser totalt.

|           |          | SuperAdmin |          |            |
| :-------- | :------- | :--------: | -------: | ---------: |
|           | ForAdmin |            | UtbAdmin |            |
| Forskning |          | Informella |          | Utbildning |

Vyn ska skräddarsys för att kunna se det ena eller det andra (det område de tillhör ska visas först). De ska självfallet kunna se båda två.

Likt oru, nyheter och forskning eller grundutbildning och det informella i vänsterspalten med någon typ av flik ovan så att man kan välja att gå in och titta på det andra.

Dela upp de stora kraven till mindre.
T.ex. "Som inloggad vill jag se publika inlägg för att se allmän information" borde delas upp till exempelvis:
Kunna skapa inlägg.
Kunna visa inlägg.
Kunna redigera inlägg.
Kunna ta bort inlägg.
Alternativt skapa tasks på user storien för att bättre dela upp den i mindre bitar.

Generellt borde de user stories som är "för stora" delas upp i mindre.

Spara bilder i databasen(?).

Kategorier:

|      |      |      | F    |      |      |      |    I |      |      |      |    U |      |      |      |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: |
|      | 1    |      | 2    |      | 3    |      |    4 |      |    5 |      |    6 |      |    7 |      |
| 1a   | 1b   | 2a   | 2b   | 3a   | 3b   | 4a   |   4b |   5a |   5b |   6a |   6b |   7a |   7b |      |