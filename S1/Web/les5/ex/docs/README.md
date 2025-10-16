# Oefeningen les 5: CSS Basis deel 2


## Oefening 1: CSS cascade and inheritance

Beschouw onderstaande webpagina. Bepaal voor het **p**-element de waarde (computed value) voor elk van de onderstaande CSS properties. Doe dit zonder gebruik te maken van de Developers Tools en zonder de webpagina te openen. 

  - font-size
  - font-style
  - color
  - background-color

Als je de waarden bepaald hebt kan je jouw oplossing controleren door de webpagina te openen in Google Chrome en gebruik te maken van de Chrome Developer Tools.

``` html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Specificity</title>
  <style>
    body {
      font-size: 1.5em;
    }

    body > p {
      background-color: red;
      font-style: italic;
    }

    p {
      background-color: green;
      color:orange;
    }

    h1 + p {
      color: white;
      font-style: normal;
    }
  </style>
</head>
<body>
  <h1>CSS cascade and inheritance</h1>
  <p>What is my font-size, font-style (am i italicized or not?), color and background-color?</p>
</body>
</html>
```
-----

## Oefening 2: Cascading - Inheritance

Open de map **oefening02-cascading-inheritance**. De opgave staat in **style.css**.           
         

-----


## Oefening 3: Specifications Table

Voeg aan de css-file in **oefening03-table** een stijl toe zodat de elementen met `class="spec-living"` een rode kleur krijgen. Doe dit zonder gebruik te maken van `!important`. Het gebruik van `!important` is immers 'bad practice'. Gebruik het enkel om CSS van externe libraries te overschrijven.

Te bekomen eindresultaat:

![table](images/table.png)     


-----


## Oefening 4: Kleuren

Open de map **oefening04-kleuren**. Maak een map **css** aan en ook een **main.css** in deze map.      
Leg in **index.html** de link naar deze externe stylesheet.    

Voeg stijlregels toe aan het css-bestand zodat je onderstaande webpagina bekomt. 

1. Gebruik het Google font "Merriweather" voor de headings en het Google font "Open Sans" voor de overige tekst. Voeg de google fonts toe via een CSS `@import` statement.
2. Gebruik pseudo-classes om de headings in rood, geel en groen weer te geven.
3. De lijsttekens bij de geneste lijsten worden niet weergegeven en alle tekst is onderlijnd.
4. Merk op dat bij elke kleur het eerste item bold moet worden weergegeven, omdat dit het belangrijkste item is.
Normaal zouden we dus strong-elementen toevoegen aan deze items. Maak echter, bij wijze van oefening, gebruik van een class-selector om bij elke kleur het eerste item bold te maken. Gebruik 'vet' als class name.
<br>Merk op dat je nog een correctie moet toevoegen om ervoor te zorgen dat 'Lente' en 'Nieuw leven' niet vet worden weergegeven.

Te bekomen eindresultaat:

![Kleuren](images/kleuren.png)             
        

---

## Oefening 5: Vander beken - lettertypes en kleuren

Gebruik voor de vanderbeken-oefening het Google-lettertype **Roboto**. De vanderbeken-website  bevat gewone tekst, cursieve en vette tekst. Selecteer dus de styles 'Regular 400', 'Regular 400 italic'en 'Bold 700'. Voeg de fonts toe aan je website met behulp van een `@import` statement.

Bekijk de website in je browser en controleer met de Chrome Developer Tools of het lettertype Roboto geladen wordt.
  - Open de Developer Tools (F12).
  - Selecteer bij **Elements** een HTML-element met tekst.
  - Selecteer **Computed** en kijk helemaal onderaan in de lijst welke de 'Rendered font' is.

>  **Extra** De Firefox Developer Tools bevatten een Font editor waarmee het gemakkelijker is, dan met de Chrome Developer Tools, om te zien welke fonts er gebruikt worden.

Voeg kleur- en tekst-eigenschappen toe aan de vanderbeken-oefening. Welke kleur- en tekst-eigenschappen je moet toevoegen is beschreven in de css-file.

De meeste lay-out en witruimtes voegen we voorlopig nog niet toe aan de website. Dit komt later aan bod in de lessen.

Eindresultaat: 

**index.html**

![index.html](images/vdb1.png)          

**over_ons.html**

![over_ons.html](images/vdb2.png)          

**realisaties.html**

![realisaties.html](images/vdb3.png)          

**contact.html**

![contact.html](images/vdb4.png)          


---

## Oefening 6: Likwiepedia.

Open de map **oefening06-likwiepedia**.
 
Voeg de stijlregels toe voor de opmaak van de tabellen zoals hieronder te zien is.

Je lost de oefening op zonder classes te gebruiken.

Volgende kleuren worden gebruikt:      
    - gold               
    - silver             
    - peru     
    - lightpink                
    - lightsteelblue             
    - palegreen              

EXTRA:  Maak ook de oefening eens gebruikmakend van classes.

Eindresultaat:      

![](images/41.png)     
