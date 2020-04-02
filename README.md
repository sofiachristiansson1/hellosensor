# MAMN01 - Hello Sensor 

#### Beskrivning av appens uppbyggnad ####

* För att skapa den första MainActivity började jag med att följa guiden "Build your first app" och sedan kunde jag genom "Palette" i layout filen activity_main.xml skapa två knappar.
* Sedan skapade jag en ny activity Compass.java och följde guiden "Compass Tutorial". Det jag har lagt till i denna kod är koden för att byta bakgrundsfärg. Den la jag till genom att skapa ett ConstraintLayout objekt,som heter currentLayout, som refererar till activity_compass.xml och sedan när mobilen pekar mot norr ändrar jag färg till röd genom koden "currentLayout.setBackgroundColor(Color.RED)"
* För att få knapparna att fungera och dirirgera till rätt aktivitet behövde jag lägga till lite kod i MainActivity.java, dels i onCreate metoden och dels skapa en ny onClick metod. 
