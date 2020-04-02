# MAMN01 - Hello Sensor 

#### Beskrivning av appens uppbyggnad ####

* För att skapa den första MainActivity började jag med att följa guiden "Build your first app" och sedan kunde jag genom "Palette" i layout filen activity_main.xml skapa två knappar.
* Sedan skapade jag en ny activity Compass.java och följde guiden "Compass Tutorial". Det jag har lagt till i denna kod är koden för att byta bakgrundsfärg. Den la jag till genom att skapa ett ConstraintLayout objekt,som heter currentLayout, som refererar till activity_compass.xml och sedan när mobilen pekar mot norr ändrar jag färg till röd genom koden "currentLayout.setBackgroundColor(Color.RED)". Jag bytte även bild på kompassen genom att lägga till en ny bild i drawables. 
* För att få knapparna att fungera och dirirgera till rätt aktivitet behövde jag lägga till lite kod i MainActivity.java, dels i onCreate metoden och dels skapa en ny onClick metod. För att göra detta krävdes en del googlande för att förstå att man behövde använda klassen Intent. 
* I Accelerometer-uppgiften krävdes det en del läsning och lite googling för att förstå alla detaljer. Jag skapade först i onCreate referenser till textobjekten som skulle visa de olika koordinaterna och skapade en sensorManager och en sensor av typen accelerometer.
* I onSensorCHange metoden ändrar jag textobjekten till värdena i sensorEvents vektorn, där plats 0 är x koordinaten, 1 är y koordinaten och 2 är z koordinaten. Om värdet på plats 0 i vektorn är mindre än noll betyder det att mobilen är lutad höger och jag skriver ut Lutning höger.
* Som utvidning valde jag att lägga till ett ljud när mobilen lutas till höger. Det gjorde jag genom att lägga till en MediaPlayer och köra kommandot mp.start() vid högerlutning och mp.pause() vid vänsterlutning. För att ljudet inte skulle höras när man gick ut ur accelerometern behövdes en onDestroy metod. 
