Riadny termín [60b], 20.5.2019 8:00
Vytvorte oknovú aplikáciu, ktorá umožní používateľovi kresliť 2 rôzne tvary. Aplikácia bude mať
nasledovnú funkcionalitu (30 bodov):
1. Vytvorenie hlavného okna, ktoré bude obsahovať Ovládacie prvky a Kresliacu plochu [5b].
2. Kreslenie dvoch typov tvarov: symbol plus a úsečka [15b+10b].
3. Voľba farby geometrického tvaru prostredníctvom Java AWT Choice-u [4b].
4. Zmena farby už nakresleného geometrického tvaru [5B].
5. Zatvorenie aplikácie cez tlačidlo na zatvorenie aplikácie [1b].
Podrobný popis k bodu1:
Väčšinu plochy okna bude zaberať Kresliaca plocha. V hornej časti okna sa budú nachádzať Ovládacie
prvky. Ovládacie prvky budú tvoriť: Button “Plus”, Button “Úsečka”, Choice a Label. Každý z týchto prvkov
musí zaberať štvrtinu celkového miesta vyhradeného pre ovládacie prvky.
Podrobný popis k bodu 2:
Stlačením príslušného tlačidla si vyberieme, buď kreslenie PLUSKA, alebo kreslenie ÚSEČKY. Po stlačení
tlačidla myši (kliknutí) a následným ťahaním, sa na plátno vykresľuje geometrický tvar. Podľa aktuálnej
polohy kurzora sa dynamicky mení šírka aj výška (ak je zvolený symbol PLUS) alebo dĺžka (ak je zvolená
ÚSEČKA). Po pustení tlačidla myši sa ukončí kreslenie geometrického tvaru, t.j. jeho veľkosť sa zafixuje
a vtedy sme pripravení kresliť ďalší zvolený geometrický tvar. Vykreslený tvar musí na kresliacej ploche
zostať vykreslený aj po vykreslení ďalšieho tvaru. Takisto si každý tvar musí zachovávať svoju farbu
(farba sa bude meniť Choice-om, pozri bod 3).
Symbol plus musí mať pri kreslení zachované proporcie:
Pozn.: Pri kreslení (ťahaní myšou) zvoleného geometrického tvaru sa musí uvažovať, do akého smeru sa
ťahá. Vtedy je potrebné domyslieť, ako sa budú prepočítavať koncové súradnice geometrického tvaru. Ak
implementujete prepočítavanie koncového bodu v závislosti od všetkých smerov ťahania myšou (sprava
hore - doľava dole, zľava dole - doprava hore, zľava hore - doprava dole a opačne) získate za tento bod
plný počet (15 pre PLUSko a 10b pre ÚSEČKU). Ak neimplementujete všetky 4 alternatívy prepočítavania
súradníc koncového bodu (ťahania myšou), získate maximálne polovicu zo stanovených bodov. (max
7.5b pre plusko a max 5b pre úsečku).
Podrobný popis k bodu 3 :
Spomedzi ovládacích prvkov bude Choice slúžiť na výber farby, Label na grafické znázornenie aktuálne
zvolenej farby. Práve kreslené geometrické tvary majú farbu zvolenú podľa Choice-u. Počet farieb, ktoré
sú na výber, je minimálne 3. Farby teda môžu byť ľubovoľné, podmienkou ale je, aby boli viditeľné na
kresliacej ploche. Po výbere farby sa zmení farba Label-u podľa aktuálnej farby. Zmena farby ovplyvňuje
len nové geometrické tvary, už nakreslené geometrické tvary si musia zachovať svoju farbu!
Podrobný popis k bodu 4:
Implementujte ďalšie tlačidlo. Stlačením tohto tlačidla sa zmení režim kreslenia geometrických tvarov na
režim označovania geometrických tvarov a následnou zmenou ich farby na farbu zvolenú pomocou
Choice-u. Označenie geometrického tvaru a jeho zmena farby sa vykoná klikom myši. Zmena farby sa
týka iba jedného (označeného) geometrického tvaru (ošetrite prípad, kedy sa viaceré geometrické tvary
prekrývajú).
Hodnotenie
Okrem funkcionality budú hodnotené aj princípy Objektovo orientovaného programovania (30 bodov),
najmä:
● správne využitie modifikátory prístupu, [3b]
● vhodné pomenovanie tried a metód, [3b]
● vhodné využitie dedenia a polymorfizmu, [3b]
● vhodné použitie výnimiek na ošetrenie nedovoleného správania (nehádzať a nezachytávať
všeobecnú triedu Exception), [3b]
● nepoužitie vnorených tried (nested class), [2b]
● nepoužitie statických metód, [3b]
● nepoužitie duplicitných kódov [3b]
Odovzdanie
Vypracovanie písomky odovzdajte do AIS do miesta odovzdania nato určenom. Odovzdáva sa zip archív
celého projektu (*.zip) obsahujúci všetky zdrojové kódy. Na vypracovanie písomky je vyhradený čas 2
hodiny.
Riadny termín [60b], 20.5.2019 11:00
Vytvorte oknovú aplikáciu, ktorá umožní používateľovi kresliť 2 rôzne tvary. Aplikácia bude mať
nasledovnú funkcionalitu (40 bodov):
6. Vytvorenie hlavného okna, ktoré bude obsahovať Ovládacie prvky a Kresliacu plochu [5b].
7. Kreslenie dvoch typov tvarov: medzikružie a úsečka [15b+10b].
8. Voľba farby geometrického tvaru prostredníctvom Java AWT Choice-u [4b].
9. Zmena farby už nakresleného geometrického tvaru [5B].
10. Zatvorenie aplikácie cez tlačidlo na zatvorenie aplikácie [1b].
Podrobný popis k bodu1:
Väčšinu plochy okna bude zaberať Kresliaca plocha. V hornej časti okna sa budú nachádzať Ovládacie
prvky. Ovládacie prvky budú tvoriť: Button “Medzikružie”, Button “Úsečka”, Button “Zmena farby”, Choice
a Label. Ovládacie prvky umiestnite podla grafického rozloženia na obrázku nižšie. V hornej časti sa
nachádza Button “Medzikružie”, “Úsečka” a “Zmena farby”. V strede je Plátno (Canvas) a na spodku je
Choice a Label.
Podrobný popis k bodu 2:
Stlačením príslušného tlačidla si vyberieme, buď kreslenie MEDZIKRUŽIA, alebo kreslenie ÚSEČKY. Po
stlačení tlačidla myši (kliknutí) a následným ťahaním, sa na plátno vykresľuje geometrický tvar. Podľa
aktuálnej polohy kurzora sa dynamicky mení šírka aj výška (ak je zvolené MEDZIKRUŽIE) alebo dĺžka (ak
je zvolená ÚSEČKA). Po pustení tlačidla myši sa ukončí kreslenie geometrického tvaru, t.j. jeho veľkosť
sa zafixuje a vtedy sme pripravení kresliť ďalší zvolený geometrický tvar. Vykreslený tvar musí na
kresliacej ploche zostať vykreslený aj po vykreslení ďalšieho tvaru. Takisto si každý tvar musí zachovávať
svoju farbu (farba sa bude meniť Choice-om, pozri bod 3).
Medzikružie musí mať pri kreslení zachované proporcie:
Pozn.: Pri kreslení (ťahaní myšou) zvoleného geometrického tvaru sa musí uvažovať, do akého smeru sa
ťahá. Vtedy je potrebné domyslieť, ako sa budú prepočítavať koncové súradnice geometrického tvaru. Ak
implementujete prepočítavanie koncového bodu v závislosti od všetkých smerov ťahania myšou (sprava
hore - doľava dole, zľava dole - doprava hore, zľava hore - doprava dole a opačne) získate za tento bod
plný počet (15 pre MEDZIKRUŽIEa 10b pre ÚSEČKU). Ak neimplementujete všetky 4 alternatívy
prepočítavania súradníc koncového bodu (ťahania myšou), získate maximálne polovicu zo stanovených
bodov. (max 7.5b pre medzikružie a max 5b pre úsečku).
Podrobný popis k bodu 3 :
Spomedzi ovládacích prvkov bude Choice slúžiť na výber farby, Label na grafické znázornenie aktuálne
zvolenej farby. Práve kreslené geometrické tvary majú farbu zvolenú podľa Choice-u. Počet farieb, ktoré
sú na výber, je minimálne 3. Farby teda môžu byť ľubovoľné, podmienkou ale je, aby boli viditeľné na
kresliacej ploche. Po výbere farby sa zmení farba Label-u podľa aktuálnej farby. Zmena farby ovplyvňuje
len nové geometrické tvary, už nakreslené geometrické tvary si musia zachovať svoju farbu!
Podrobný popis k bodu 4:
Implementujte ďalšie tlačidlo. Stlačením tohto tlačidla sa zmení režim kreslenia geometrických tvarov na
režim označovania geometrických tvarov a následnou zmenou ich farby na farbu zvolenú pomocou
Choice-u. Označenie geometrického tvaru a jeho zmena farby sa vykoná klikom myši. Zmena farby sa
týka iba jedného (označeného) geometrického tvaru (ošetrite prípad, kedy sa viaceré geometrické tvary
prekrývajú).
Hodnotenie
Okrem funkcionality budú hodnotené aj princípy Objektovo orientovaného programovania (30 bodov),
najmä:
● správne využitie modifikátory prístupu, [3b]
● vhodné pomenovanie tried a metód, [3b]
● vhodné využitie dedenia a polymorfizmu, [3b]
● vhodné použitie výnimiek na ošetrenie nedovoleného správania (nehádzať a nezachytávať
všeobecnú triedu Exception), [3b]
● nepoužitie vnorených tried (nested class), [2b]
● nepoužitie statických metód, [3b]
● nepoužitie duplicitných kódov [3b]
Odovzdanie
Vypracovanie písomky odovzdajte do AIS do miesta odovzdania nato určenom. Odovzdáva sa zip archív
celého projektu (*.zip) obsahujúci všetky zdrojové kódy. Na vypracovanie písomky je vyhradený čas 2
hodiny.