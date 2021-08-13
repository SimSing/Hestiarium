package service;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Animal;
import model.Animal.Category;
import model.Animal.Occurrence;
import model.Animal.Size;
import model.Animal.Species;

public class Lists {
	
	public static List<Animal> animalList = new ArrayList<Animal>();
	public static ObservableList<Animal> observableAnimalList = FXCollections.observableArrayList();
	
	
	
	static Animal adler = new Animal(1, "Adler", Category.AIR, Species.BIRD, Occurrence.EVERYWHERE, "Gebirge, Wald", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Adler.html");
	static Animal alligator = new Animal(2, "Alligator", Category.LAND_WATER, Species.REPTILE, Occurrence.SOUTH_AVENTURIA, "Fluss", -4, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Alligator.html");
	static Animal al_Anfaner = new Animal(3, "Al\'Anfaner", Category.LAND, Species.CAT, Occurrence.SOUTH_AVENTURIA, "Pet(Katze)", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_AlAnfaner.html");
	static Animal aranier = new Animal(4, "Aranier", Category.LAND, Species.CAT, Occurrence.MIDDLE_AVENTURIA, "Pet(Katze)", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Aranier.html");
	static Animal auerOchse = new Animal(5, "Auerochse", Category.LAND, Species.CATTLE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -1, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Auerochse.html");
	static Animal basaltSalamander = new Animal(6, "Basaltsalamander", Category.LAND, Species.REPTILE, Occurrence.TBD, "TBD", 00, Size.TINY, "https://www.ulisses-regelwiki.de/basaltsalamander.html");			//*****************Flusslande
	static Animal beilunkerZwergenpony = new Animal(7, "Beilunker Zwergenpony", Category.LAND, Species.HORSE, Occurrence.EVERYWHERE, "Zucht(Zwerge)", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Beilunker_Zwergenpony.html");
	static Animal bergAdler = new Animal(8, "Bergadler", Category.AIR, Species.BIRD, Occurrence.NORTH_MIDDLE_AVENTURIA, "Gebirge", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Bergadler.html");
	static Animal bornBär = new Animal(9, "Bornbär", Category.LAND, Species.URSAE, Occurrence.TBD, "TBD", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Bornbaer.html");                           //******************Das Erbe der Theaterritter
	static Animal bornländer = new Animal(10, "Bornländer", Category.LAND, Species.DOG, Occurrence.NORTH_AVENTURIA, "Pet(Hund)", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Bornlaender.html");
	static Animal bosparaniel = new Animal(11, "Bosparaniel", Category.LAND, Species.DOG, Occurrence.MIDDLE_AVENTURIA, "Pet(Hund", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Bosparaniel.html");
	static Animal brabacuda = new Animal(12, "Brabacuda", Category.WATER, Species.FISH ,Occurrence.SOUTH_AVENTURIA, "Südmeer, Perlenmeer", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Brabacuda.html");
	static Animal brabakerWaldelefant = new Animal(13, "Brabaker Waldelefant", Category.LAND, Species.OTHER, Occurrence.SOUTH_AVENTURIA, "Wald, Regenwald", -4, Size.GIANT, "https://www.ulisses-regelwiki.de/Best_Brabaker-Waldelefant.html");
	static Animal bunterHund = new Animal(14, "Bunter Hund", Category.LAND, Species.DOG, Occurrence.MIDDLE_AVENTURIA, "Pet(Hund", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_BunterHund.html");
	static Animal burgenKatze = new Animal(15, "Burgenkatz", Category.LAND, Species.CAT, Occurrence.NORTH_AVENTURIA, "Pet(Katze)", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Burgenkatz.html");
	static Animal chaAyZhamorrah = new Animal(16, "Cha Ay Zhamorrah", Category.LAND, Species.CAT, Occurrence.SOUTH_AVENTURIA, "Pet(Katze)", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Cha_ay_Zhamorrah.html");
	static Animal Dachs = new Animal(17, "Dachs", Category.LAND, Species.OTHER, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Dachs.html");
	static Animal drachenLibelle = new Animal(18, "Drachenlibelle", Category.AIR, Species.INSECT, Occurrence.MIDDLE_AVENTURIA, "Fluss, See, Sumpf", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Drachenlibelle.html");
	static Animal eidechse = new Animal(19, "Eidechse", Category.LAND, Species.REPTILE, Occurrence.EVERYWHERE, "Everywhere", -2, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Eidechse.html");
	static Animal elch = new Animal(20, "Elch", Category.LAND, Species.GAME, Occurrence.NORTH_AVENTURIA, "Wald", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Elch.html");
	static Animal elefant = new Animal(21, "Elefant", Category.LAND, Species.OTHER, Occurrence.MIDDLE_AVENTURIA, "Steppe", -4, Size.GIANT, "https://www.ulisses-regelwiki.de/Elefant.html"); //***********************************Steppe?
	static Animal elenvinerVollblut = new Animal(22, "Elenviner Vollblut", Category.LAND, Species.HORSE, Occurrence.MIDDLE_AVENTURIA, "Zucht(Mittelreich)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Elenviner_Vollblut.html");
	static Animal esel = new Animal(23, "Esel", Category.LAND, Species.HORSE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Gebirge, Steppe", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Esel.html");
	static Animal espenerSaupacker = new Animal(24, "Espener Saupacker",Category.LAND, Species.DOG, Occurrence.MIDDLE_AVENTURIA, "Pet(Hund)", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Espener_Saupacker.html");
	static Animal falke = new Animal(25, "Falke", Category.AIR, Species.BIRD, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald, Gebirge, Steppe", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Falke.html");
	static Animal ferkinaPony	= new Animal(26, "Ferkinapony", Category.LAND, Species.HORSE, Occurrence.MIDDLE_AVENTURIA, "Steppe, Gebirge", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Ferkinapony.html");
	static Animal feuerMolch = new Animal(27, "Feuermloch", Category.LAND, Species.LIZARD, Occurrence.TBD, "TBD", 00, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Feuermolch.html"); //********************************Quelle des Nagrach(Neuauflage)
	static Animal feuerSkorpion = new Animal(28, "Feuerskorpion", Category.LAND, Species.ARACHNAE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wüste + Umgebung, Steppe, Gebirge", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Feuerskorpion.html");
	static Animal firnläufer = new Animal(29, "Firnläufer", Category.LAND, Species.CANINE, Occurrence.NORTH_AVENTURIA, "Wald, Steppe", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Firnläufer.html");
	static Animal fischerSpinne = new Animal(30, "Fischerspinne", Category.LAND, Species.ARACHNAE, Occurrence.MIDDLE_AVENTURIA, "Gebirge, Wald", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/BEst_Fischerspinne.html");
	static Animal fledermaus = new Animal(31, "Fledermaus", Category.AIR, Species.BIRD, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Höhle, Wald", 00, Size.TINY, "https://www.ulisses-regelwiki.de/fledermaeuse.html");
	static Animal flugEchse = new Animal(32, "Flugechse", Category.AIR, Species.LIZARD, Occurrence.SOUTH_AVENTURIA, "Küste, Sumpf", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Flugechse.html");
	static Animal frettchen = new Animal(33, "Frettchen", Category.LAND, Species.RODENT, Occurrence.EVERYWHERE, "Wald, Steppe", 0, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Frettchen.html");
	static Animal gans = new Animal(34, "Gans", Category.AIR_WATER, Species.BIRD, Occurrence.EVERYWHERE, "Fluss, See", 0, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Gans.html");
	static Animal garetischesSchlappohr = new Animal(35, "Garetisches Schlappohr", Category.LAND, Species.DOG, Occurrence.MIDDLE_AVENTURIA, "Pet(Hund)", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Garetisches_Schlappohr.html");
	static Animal gebirgsBock = new Animal(36, "Gebirgsbock", Category.LAND, Species.GAME, Occurrence.NORTH_MIDDLE_AVENTURIA, "Gebirge", 0, Size.SMALL, "https://www.ulisses-regelwiki.de/Gebirgsbock.html");
	static Animal geisterQualle = new Animal(37, "Geisterqualle", Category.WATER, Species.FISH, Occurrence.TBD, "Sea", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/best_Geisterqualle.html");          //****************************Untiefen
	static Animal gelbschwanzSkorpion = new Animal(38, "Gelbschwanzskorpion", Category.LAND, Species.ARACHNAE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wüste + Umgebung, Waldrand", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Gelbschwanzskorpion.html");
	static Animal goldfelser = new Animal(39, "Goldfelser", Category.LAND, Species.HORSE, Occurrence.SOUTH_AVENTURIA, "Zucht(Novadis)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Goldfelser.html");
	static Animal grauTier = new Animal(40, "Grautier", Category.LAND, Species.HORSE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Steppe", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Grautier.html");
	static Animal greifKatze = new Animal(41, "Greifkatze", Category.LAND_AIR, Species.BIRD, Occurrence.SOUTH_AVENTURIA, "Dschungel", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Greifkatze.html");
	static Animal grimmWolf = new Animal(42, "Grimmwolf", Category.LAND, Species.CANINE, Occurrence.MIDDLE_AVENTURIA, "Wald, Steppe", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Grimwolf.html");
	static Animal gruftAssel = new Animal(43, "Gruftassel", Category.LAND, Species.INSECT, Occurrence.EVERYWHERE, "Höhle, Gruft", 00, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Gruftassel.html");
	static Animal habicht = new Animal(44, "Habicht", Category.AIR, Species.BIRD, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -2, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Habicht.html");
	static Animal halmarAntilope = new Animal(45, "Halmar Antilope", Category.LAND, Species.GAME, Occurrence.NORTH_AVENTURIA, "Steppe", -3, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Halmar-Antilope.html");
	static Animal hornEchse = new Animal(46, "Hornechse", Category.LAND, Species.REPTILE, Occurrence.SOUTH_AVENTURIA, "Sumpf, Dschungel", -5, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Hornechse.html");
	static Animal huhn = new Animal(47, "Huhn", Category.LAND_AIR, Species.BIRD, Occurrence.EVERYWHERE, "Wald, Farm", +1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Huhn.html");
	static Animal kriegsHund = new Animal(48, "Kriegshund", Category.LAND, Species.DOG, Occurrence.NORTH_AVENTURIA, "Pet(Hund), Orks", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_HundKriegshund.html");
	static Animal straßenKöterMischling = new Animal(49, "Straßenkötermischling", Category.LAND, Species.DOG, Occurrence.EVERYWHERE, "Stadt, Dorf", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Hund.html");
	static Animal weißerKoscher = new Animal(50, "Weißer Koscher", Category.LAND, Species.DOG, Occurrence.MIDDLE_AVENTURIA, "Pet(Hund)", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/best_Hund_Weißer_Koscher.html");
	static Animal höhlenBär = new Animal(51, "Höhlenbär", Category.LAND, Species.URSAE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Höhle", -5, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Höhlenbär.html");
	static Animal höhlenSpinne = new Animal(52, "Höhlenspinne", Category.LAND, Species.ARACHNAE, Occurrence.EVERYWHERE, "Gebirge, Höhle, Wald", 00, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Hoehlenspinne.html");
	static Animal jaguar = new Animal(53, "Jaguar", Category.LAND, Species.CAT, Occurrence.SOUTH_AVENTURIA, "Dschungel, Gebirge", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Jaguar.html");
	static Animal kaiman = new Animal(54, "Kaiman", Category.WATER, Species.FISH, Occurrence.TBD, "Meer", -4, Size.MIDDLE, "https://www.ulisses-regelwiki.de/best_Kaiman.html");
	static Animal kalekkeM = new Animal(55, "Kalekke(männlich)", Category.LAND, Species.MONKEY, Occurrence.SOUTH_AVENTURIA, "Dschungel", -5, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Kalekke.html");
	static Animal kalekkeW = new Animal(56, "Kalekke(weiblich)", Category.LAND, Species.MONKEY, Occurrence.SOUTH_AVENTURIA, "Dschungel", -5, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Kalekke.html");
	static Animal kamel = new Animal(57, "Kamel", Category.LAND, Species.HORSE, Occurrence.SOUTH_AVENTURIA, "Wüste + Umgebung, Steppe", -1, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Kamel.html");
	static Animal karen = new Animal(58, "Karen", Category.LAND, Species.GAME, Occurrence.NORTH_AVENTURIA, "Steppe", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Karen.html");
	static Animal khoramsBestie = new Animal(59, "Khoramsbestie", Category.LAND, Species.CANINE, Occurrence.SOUTH_AVENTURIA, "Wüste + Umgebung, Steppe", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Khoramsbestie.html");
	static Animal khomGeier = new Animal(60, "Khomgeier", Category.AIR, Species.BIRD, Occurrence.SOUTH_AVENTURIA, "Wüste + Umgebung, Steppe", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Khômgeier.html");
	static Animal kronenHirsch = new Animal(61, "Kronenhirsch", Category.LAND, Species.GAME, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Kronenhirsch.html");
	static Animal koschKröte = new Animal(62, "Koschkröte", Category.LAND_WATER, Species.LIZARD, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Pet(Kröte), Hexe", 00, Size.TINY, "https://www.ulisses-regelwiki.de/Best_KröteKoschkröte.html");
	static Animal kvillOtter = new Animal(63, "Kvillotter", Category.LAND_WATER, Species.REPTILE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Fluss, See, Wald, Steppe", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Kvillotter.html");
	static Animal königsAdler = new Animal(64, "Königsadler", Category.AIR, Species.BIRD, Occurrence.EVERYWHERE, "Gebirge", -2, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Königsadler.html");
	static Animal königsSkorpion = new Animal(65, "Königsskorpion", Category.LAND, Species.ARACHNAE, Occurrence.TBD, "TBD", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Koenigsskorpion.html");  //***************************Das Dornenreich
	static Animal langMähne = new Animal(66, "Langmähne", Category.LAND, Species.HORSE, Occurrence.NORTH_AVENTURIA, "Steppe, Zucht(Thorwal)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Langmähne.html");
	static Animal luchs = new Animal(67, "Luchs", Category.LAND, Species.CAT, Occurrence.EVERYWHERE, "Wald, Steppe", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/luchs.html");
	static Animal mammut = new Animal(68, "Mammut", Category.LAND, Species.OTHER, Occurrence.NORTH_AVENTURIA, "Steppe, Eiswüste", -4, Size.GIANT, "https://www.ulisses-regelwiki.de/Bets_Mammut.html");
	static Animal maraskanPony = new Animal(69, "Maraskanpony", Category.LAND, Species.HORSE, Occurrence.MIDDLE_AVENTURIA, "Maraskan", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Maraskanpony.html");
	static Animal maraske = new Animal(70, "Maraske", Category.LAND, Species.ARACHNAE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Maraskan", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Maraske.html");
	static Animal maulEsel_maulTier = new Animal(71, "Maulesel/Maultier", Category.LAND, Species.HORSE, Occurrence.EVERYWHERE, "Zucht", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Maulesel_und_Maultier.html");
	static Animal moosAffe = new Animal(72, "Moosaffe", Category.LAND, Species.MONKEY, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wald, Dschungel", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Moosaffe.html");
	static Animal morfu = new Animal(73, "Morfu", Category.LAND_WATER, Species.GASTROPOD, Occurrence.TBD, "TBD", 00, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Morfu.html");   //***********************Quelle des Nagrach
	static Animal mungo = new Animal(74, "Mungo", Category.LAND, Species.RODENT, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wald, Wüste + Umgebung, Steppe, Maraskan", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Mungo.html");
	static Animal mähnenWolf = new Animal(75, "Mähnenwolf", Category.LAND, Species.DOG, Occurrence.NORTH_AVENTURIA, "Steppe, Pet(Hund)", -2, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Maehnenwolf.html");
	static Animal nivesischer_SteppenHund = new Animal(76, "Nivesischer Steppenhund", Category.LAND, Species.DOG, Occurrence.NORTH_AVENTURIA, "Steppe, Pet(Hund)", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Nivesischer_Steppenhund.html");
	static Animal nordMähne = new Animal(77, "Nordmähne", Category.LAND, Species.HORSE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Zucht(Bauern) Steppe", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Nordmaehne.html");
	static Animal nuala = new Animal(78, "Nuala", Category.LAND, Species.CAT, Occurrence.EVERYWHERE, "Pet(Katze)", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Nuala.html");
	static Animal ongaloRind = new Animal(79, "Ongalorind", Category.LAND, Species.CATTLE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Steppe, Waldrand", 0, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Ongalorind.html");  
	static Animal onjaroBracke = new Animal(80, "Onjaro-Bracke", Category.LAND, Species.DOG, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Pet(Hund), Horasreich", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Onjaro-Bracke.html");
	static Animal orkPony = new Animal(81, "Orkpony", Category.LAND, Species.HORSE, Occurrence.NORTH_AVENTURIA, "Steppe, Zucht(Orks)", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Orkpony.html");
	static Animal paaviPony = new Animal(82, "Paavipony", Category.LAND, Species.HORSE, Occurrence.NORTH_AVENTURIA, "Steppe, Zucht(Paavi, Elfen)", 0, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Paavipony.html");
	static Animal pailosWaran = new Animal(83, "Pailoswaran", Category.LAND, Species.LIZARD, Occurrence.SOUTH_AVENTURIA, "Strand, Wald, Zyklopeninseln", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Pailoswaran.html");
	static Animal palmViper = new Animal(84, "Palmviper", Category.LAND_WATER, Species.REPTILE, Occurrence.SOUTH_AVENTURIA, "Dschungel", -2, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Palmviper.html");
	static Animal papagei = new Animal(85, "papagei", Category.AIR, Species.BIRD, Occurrence.SOUTH_AVENTURIA, "Dschungel", -2, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Papagei.html");
	static Animal pardel = new Animal(86, "Pardel(Khomgepard)", Category.LAND, Species.CAT, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Steppe, Wald", -4, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Pardel.html");
	static Animal pfau = new Animal(87, "Pfau", Category.LAND_AIR, Species.BIRD, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wald", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Pfau.html");
	static Animal piranha = new Animal(88, "Piranha", Category.WATER, Species.FISH, Occurrence.SOUTH_AVENTURIA, "Fluss", 0, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Piranha.html");
	static Animal polarbär = new Animal(89, "Polarbär(Firunsbär)", Category.LAND, Species.URSAE, Occurrence.NORTH_AVENTURIA, "Eiswüste", -5, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Polarbär.html");
	static Animal qualle = new Animal(90, "Qualle", Category.WATER, Species.FISH, Occurrence.TBD, "TBD", -1, Size.TINY, "https://www.ulisses-regelwiki.de/best_Qualle.html"); //***********************************Unendlichkeit und Tiefenrausch
	static Animal rabe = new Animal(91, "Rabe", Category.AIR, Species.BIRD, Occurrence.EVERYWHERE, "Everywhere", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Rabe.html");
	static Animal kolkRabe = new Animal(91, "Kolkrabe", Category.AIR, Species.BIRD, Occurrence.EVERYWHERE, "Everywhere", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_RabeKohlrabe.html");
	static Animal rahjaTänzer = new Animal(92, "Rahjatänzer", Category.LAND, Species.DOG, Occurrence.NORTH_MIDDLE_AVENTURIA, "Pet(Hund), Horasreich", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Rahjataenzer.html");
	static Animal ratte = new Animal(93, "Ratte", Category.LAND, Species.RODENT, Occurrence.EVERYWHERE, "Everywhere", 00, Size.TINY, "https://www.ulisses-regelwiki.de/Ratte.html");
	static Animal reh = new Animal(94, "Reh", Category.LAND, Species.GAME, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald, Maraskan", 0, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Reh.html");
	static Animal rempelkäfer = new Animal(95, "Rempelkäfer", Category.LAND, Species.INSECT, Occurrence.TBD, "TBD", 00, Size.TBD, "https://www.ulisses-regelwiki.de/Rempelkäfer.html"); //************************************Neue Bande & Uralter Zwist
	static Animal rennkuckuck = new Animal(96, "Rennkuckuck", Category.LAND, Species.BIRD, Occurrence.TBD, "TBD", -6, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Rennkuckuck.html");
	static Animal riesenAmöbe = new Animal(97, "Riesenamöbe", Category.LAND, Species.GASTROPOD, Occurrence.EVERYWHERE, "Höhle, Gruft", 00, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Riesenamöbe.html");
	static Animal riesenFledermaus = new Animal(98, "Riesenfledermaus", Category.AIR, Species.BIRD, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Höhle, Wald", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/best_riesenfledermaus.html");
	static Animal riesenHirschKäfer = new Animal(99, "Riesenhirschkäfer", Category.LAND, Species.INSECT, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -2, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Riesenhirschkäfer.html");
	static Animal riesenHundertfüßer = new Animal(100, "Riesenhundertfüßer", Category.LAND, Species.INSECT, Occurrence.TBD, "TBD", 00, Size.GIANT, "https://www.ulisses-regelwiki.de/Best_Riesenhunderfuesser.html"); //************************Gefangen in der Gruft der Königin
	static Animal riesenLöffler = new Animal(101, "Riesenlöffler", Category.LAND, Species.GAME, Occurrence.MIDDLE_AVENTURIA, "Wald, Gebirge", -5, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Riesenlöffler.html");
	static Animal riesenSkorpion = new Animal(102, "Riesenskorpion", Category.LAND, Species.ARACHNAE, Occurrence.SOUTH_AVENTURIA, "Zyklopeninseln, Gebirge(Khom)", 00, Size.GIANT, "https://www.ulisses-regelwiki.de/Best_Riesenskorpion.html");
	static Animal rind = new Animal(103, "rind", Category.LAND, Species.CATTLE, Occurrence.EVERYWHERE, "Wald, Steppe, Farm", 0, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Rind.html");
	static Animal rochenWurm = new Animal(104, "Rochenwurm", Category.WATER, Species.FISH, Occurrence.TBD, "TBD", -3, Size.BIG, "https://www.ulisses-regelwiki.de/best_Rochenwurm.html"); //**********************Unendlichkeit und Tiefenrausch
	static Animal rotFuchs = new Animal(105, "Rotfuchs", Category.LAND, Species.CANINE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Rotfuchs.html");
	static Animal saguaraSpinne = new Animal(106, "Saguaraspinne", Category.LAND, Species.ARACHNAE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wald", -2, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Saguaraspinne.html");
	static Animal sandLöwe = new Animal(107, "Sandlöwe", Category.LAND, Species.CAT, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wüste + Umgebung", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Sandlöwe.html");
	static Animal schaf = new Animal(108, "Schaf", Category.LAND, Species.CATTLE, Occurrence.EVERYWHERE, "Gebirge, Steppe, Farm", 0, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Schaf.html");
	static Animal schakal = new Animal(109, "Schakal", Category.LAND, Species.CANINE, Occurrence.TBD, "TBD", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/best_schakal.html");  //*****************************Das Dornenreich
	static Animal schattenLöwe = new Animal(110, "Schattenlöwe", Category.LAND, Species.CAT, Occurrence.SOUTH_AVENTURIA, "Dschungel", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Schattenlöwe.html");
	static Animal schattenRochen = new Animal(111, "Schattenrochen", Category.WATER, Species.FISH, Occurrence.TBD, "TBD", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/best_Schattenrochen.html"); //***********************************Unendlichkeit und Tiefenrausch
	static Animal scheunenKatze = new Animal(112, "Scheunenkatz", Category.LAND, Species.CAT, Occurrence.EVERYWHERE, "Pet(Katze), Dorf, Farm", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Scheunenkatz.html");
	static Animal diamantSchildkröte = new Animal(113, "Diamantschildkröte", Category.LAND_WATER, Species.GASTROPOD, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Meer, Strand", +2, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Schildkroete_Diamantschildkroete.html");
	static Animal boa = new Animal(114, "Boa", Category.LAND, Species.REPTILE, Occurrence.SOUTH_AVENTURIA, "Dschungel", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/Tiere_Boa.html");
	static Animal schlinger = new Animal(115, "Schlinger", Category.LAND, Species.REPTILE, Occurrence.SOUTH_AVENTURIA, "Dschungel, Sumpf", 00, Size.GIANT, "https://www.ulisses-regelwiki.de/Best_Schlinger.html");
	static Animal schwan = new Animal(116, "Schwan", Category.LAND_WATER, Species.BIRD, Occurrence.TBD, "TBD", 00, Size.MIDDLE, "https://www.ulisses-regelwiki.de/best_Schwan.html");//****************************Dryadenhain & Dschinnenzauber
	static Animal schwarzBär = new Animal(117, "Schwarzbär", Category.LAND, Species.URSAE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Schwarzbär.html");
	static Animal schwarzer_Olporter = new Animal(118, "Schwarzer Olporter", Category.LAND, Species.DOG, Occurrence.NORTH_MIDDLE_AVENTURIA, "Pet(Hund)", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Schwarzer_Olporter.html");
	static Animal schwarzKäfer = new Animal(119, "Schwarzkäfer", Category.LAND, Species.INSECT, Occurrence.TBD, "TBD", 00, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Schwarzkäfer.html");//******************************Publikation: Katakomben & Ruinen Seite 15
	static Animal schwein = new Animal(120, "Schwein", Category.LAND, Species.CATTLE, Occurrence.EVERYWHERE, "Farm", 1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Schwein.html");
	static Animal schädelEule = new Animal(121, "Schädeleule", Category.AIR, Species.BIRD, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Schädeleule.html");
	static Animal shadif = new Animal(122, "Shadif", Category.LAND, Species.HORSE, Occurrence.SOUTH_AVENTURIA, "Zucht(Novadis)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Shadif.html");
	static Animal siebenWindLäufer = new Animal(123, "Siebenwindläufer", Category.LAND, Species.DOG, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Pet(Hund)", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Siebenwindlaeufer.html");
	static Animal singVogel = new Animal(124, "Singvogel", Category.AIR, Species.BIRD, Occurrence.EVERYWHERE, "Wald, Steppe, Gebirge", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Singvogel.html");
	static Animal smaragdNatter = new Animal(125, "Smaragdnatter", Category.LAND, Species.REPTILE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald, Steppe", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Smaragdnatter.html");
	static Animal sonnenLuchs = new Animal(126, "Sonnenluchs", Category.LAND, Species.CAT, Occurrence.NORTH_AVENTURIA, "Wald", -2, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Sonnenluchs.html");
	static Animal speiKobra = new Animal(127, "Speikobra", Category.LAND_WATER, Species.REPTILE, Occurrence.SOUTH_AVENTURIA, "Fluss, Wald", -3, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Speikobra.html");
	static Animal speiSpinne = new Animal(128, "Speispinne", Category.LAND, Species.ARACHNAE, Occurrence.TBD, "TBD", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Speispinne.html");//*************************************Des Wandelbaren Schicksal
	static Animal schwarze_Witwe = new Animal(129, "Schwarze Witwe", Category.LAND, Species.ARACHNAE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Wald, Steppe", 00, Size.TINY, "https://www.ulisses-regelwiki.de/Tiere_Spinne.html");
	static Animal steinAssel = new Animal(130, "Steinassel", Category.LAND, Species.INSECT, Occurrence.TBD, "TBD", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Steinassel.html"); //**************************???????????????????????????????
	static Animal stinkTier = new Animal(131, "Stinktier", Category.LAND, Species.OTHER, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Steppe, Wald, Gebirge", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Stinktier.html");
	static Animal Strauß = new Animal(132, "Strauß", Category.LAND, Species.BIRD, Occurrence.SOUTH_AVENTURIA, "Steppe", -1, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Strauß.html");
	static Animal streifenDachs = new Animal(133, "Streifendachs", Category.LAND, Species.OTHER, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Streifendachs.html");
	static Animal streifenHai = new Animal(134, "Streifenhai", Category.WATER, Species.FISH, Occurrence.EVERYWHERE, "Meer", -2, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Streifenhai.html");
	static Animal sturmFalke = new Animal(135, "Sturmfalke", Category.AIR, Species.BIRD, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald, Gebirge", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Sturmfalke.html");
	static Animal sumpfEgel = new Animal(136, "Sumpfegel", Category.WATER, Species.GASTROPOD, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Sumpf, See", +1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Sumpfegel.html");
	static Animal sumpfRanze = new Animal(137, "Sumpfranze", Category.LAND, Species.MONKEY, Occurrence.EVERYWHERE, "Sumpf", 00, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Sumpfranze.html");
	static Animal svellttaler_Kaltblut = new Animal(138, "Svellttaler Kaltblut", Category.LAND, Species.HORSE, Occurrence.NORTH_AVENTURIA, "Steppe, Zucht(Lowangen, Donnerbach)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Svellttaler_Kaltblut.html");
	static Animal säbelzahnTiger = new Animal(139, "Säbelzahntiger", Category.LAND, Species.CAT, Occurrence.EVERYWHERE, "Steppe, Wald, Dschungel", 00, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Säbelzahntiger.html");
	static Animal taube = new Animal(140, "Taube", Category.AIR, Species.BIRD, Occurrence.EVERYWHERE, "Everywhere", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Taube.html");
	static Animal teshkaler = new Animal(141, "Teshkaler", Category.LAND, Species.HORSE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Steppe Zucht(Andergast)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Teshkaler.html");
	static Animal therengar_Terrier = new Animal(142, "Therengar Terrier", Category.LAND, Species.DOG, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Pet(Horasreich)", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Therengar-Terrier.html");
	static Animal tiger = new Animal(143, "Tiger", Category.LAND, Species.CAT, Occurrence.TBD, "TBD", 00, Size.BIG, "https://www.ulisses-regelwiki.de/Tiger.html");//******************************Das Dornenreich
	static Animal todesHörnchen = new Animal(144, "Todeshörnchen", Category.LAND, Species.RODENT, Occurrence.NORTH_AVENTURIA, "Orkland, Svellttal, Wald", 00, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Todeshörnchen.html");
	static Animal tralloper_Riese = new Animal(145, "Tralloper Riese", Category.LAND, Species.HORSE, Occurrence.MIDDLE_AVENTURIA, "Steppe, Zucht(Weiden)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_TralloperRiese.html");
	static Animal trollMops = new Animal(146, "Trollmops", Category.LAND, Species.DOG, Occurrence.SOUTH_AVENTURIA, "Pet(Hund)", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Trollmops.html");
	static Animal tulamide = new Animal(147, "Tulamide", Category.LAND, Species.HORSE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Steppe, Zucht(Tulamiden)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Tulamide.html");
	static Animal tuzaker = new Animal(148, "Tuzaker", Category.LAND, Species.DOG, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Maraskan, Pet(hund)", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Tuzaker.html");
	static Animal vampirFledermaus = new Animal(149, "Vampirfledermaus", Category.AIR, Species.BIRD, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Höhle, Wald", -3, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Vampirfledermaus.html");
	static Animal vielfraß = new Animal(150, "Vielfraß", Category.LAND, Species.OTHER, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", 00, Size.SMALL, "https://www.ulisses-regelwiki.de/best_Vielfraß.html");
	static Animal vogelSpinne = new Animal(151, "Vogelspinne", Category.LAND, Species.ARACHNAE, Occurrence.SOUTH_MIDDLE_AVENTURIA, "Waldrand, Steppe, Maraskan", -2, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Vogelspinne.html");
	static Animal wachHund = new Animal(152, "Wachhund", Category.LAND, Species.DOG, Occurrence.EVERYWHERE, "Pet(Hund)", 00, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Wachhund.html");
	static Animal waldSpinne = new Animal(153, "Waldspinne", Category.LAND, Species.ARACHNAE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", 2, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Waldspinne.html");
	static Animal waldWolf = new Animal(154, "Waldwolf", Category.LAND, Species.CANINE, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald", -2, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Waldwolf.html");
	static Animal warunker = new Animal(155, "Warunker", Category.LAND, Species.HORSE, Occurrence.MIDDLE_AVENTURIA, "Steppe, Zucht(Mittelaventurien)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Warunker.html");
	static Animal wasserSchlange = new Animal(156, "Wasserschlange", Category.LAND_WATER, Species.REPTILE, Occurrence.TBD, "TBD", 00, Size.TBD, "https://www.ulisses-regelwiki.de/Wasserschla.html");//**********************Der schwarze Forst
	static Animal wehrheimer_BlutHund = new Animal(157, "Wehrheimer Bluthund", Category.LAND, Species.DOG, Occurrence.MIDDLE_AVENTURIA, "Pet(Hund)", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Wehrheimer_Bluthund.html");
	static Animal wildKatze = new Animal(158, "Wildkatze", Category.LAND, Species.CAT, Occurrence.EVERYWHERE, "Everywhere", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Wildkatze.html");
	static Animal wildSchwein = new Animal(159, "Wildschwein", Category.LAND, Species.GAME, Occurrence.NORTH_MIDDLE_AVENTURIA, "Wald, Steppe", -1, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Wildschwein.html");
	static Animal winhaller_WolfsJäger = new Animal(160, "Winhaller Wolfsjäger", Category.LAND, Species.DOG, Occurrence.NORTH_MIDDLE_AVENTURIA, "Pet(Hund)", -1, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Winhaller_Wolfsjaeger.html");
	static Animal wolfsRatte = new Animal(161, "Wolfsratte", Category.LAND, Species.RODENT, Occurrence.NORTH_MIDDLE_AVENTURIA, "Everywhere", -1, Size.TINY, "https://www.ulisses-regelwiki.de/Best_Wolfsratte.html");
	static Animal wollNashorn = new Animal(162, "Wollnashorn", Category.LAND, Species.OTHER, Occurrence.NORTH_AVENTURIA, "Steppe, Waldrand", -3, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Wollnashorn.html");
	static Animal würgeSchlange = new Animal(163, "Würgeschlange", Category.LAND, Species.REPTILE, Occurrence.SOUTH_AVENTURIA, "Dschungel", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Würgeschlange.html");
	static Animal yaquirTaler = new Animal(164, "Yaquirtaler", Category.LAND, Species.HORSE, Occurrence.MIDDLE_AVENTURIA, "Steppe, Zucht(Almada)", -2, Size.BIG, "https://www.ulisses-regelwiki.de/Best_Yaquirtaler.html");
	static Animal ziege = new Animal(165, "Ziege", Category.LAND, Species.GAME, Occurrence.EVERYWHERE, "Wald, Gebirge", 0, Size.SMALL, "https://www.ulisses-regelwiki.de/Best_Ziege.html");
	static Animal zitterRochen = new Animal(166, "Zitterrochen", Category.WATER, Species.FISH, Occurrence.EVERYWHERE, "Meer", -3, Size.MIDDLE, "https://www.ulisses-regelwiki.de/Best_Zitterrochen.html");

	public static void addAnimals() {
		animalList.add(adler);
		animalList.add(alligator);
		animalList.add(al_Anfaner);
		animalList.add(aranier);
		animalList.add(auerOchse);
		animalList.add(basaltSalamander);
		animalList.add(beilunkerZwergenpony);
		animalList.add(bergAdler);
		animalList.add(bornBär);
		animalList.add(bornländer);
		animalList.add(bosparaniel);
		animalList.add(brabacuda);
		animalList.add(brabakerWaldelefant);
		animalList.add(bunterHund);
		animalList.add(burgenKatze);
		animalList.add(chaAyZhamorrah);
		animalList.add(Dachs);
		animalList.add(drachenLibelle);
		animalList.add(eidechse);
		animalList.add(elch);
		animalList.add(elefant);
		animalList.add(elenvinerVollblut);
		animalList.add(esel);
		animalList.add(espenerSaupacker);
		animalList.add(falke);
		animalList.add(ferkinaPony);
		animalList.add(feuerMolch);
		animalList.add(feuerSkorpion);
		animalList.add(firnläufer);
		animalList.add(fischerSpinne);
		animalList.add(fledermaus);
		animalList.add(flugEchse);
		animalList.add(frettchen);
		animalList.add(gans);
		animalList.add(garetischesSchlappohr);
		animalList.add(gebirgsBock);
		animalList.add(geisterQualle);
		animalList.add(gelbschwanzSkorpion);
		animalList.add(goldfelser);
		animalList.add(grauTier);
		animalList.add(greifKatze);
		animalList.add(grimmWolf);
		animalList.add(gruftAssel);
		animalList.add(habicht);
		animalList.add(halmarAntilope);
		animalList.add(hornEchse);
		animalList.add(huhn);
		animalList.add(kriegsHund);
		animalList.add(straßenKöterMischling);
		animalList.add(weißerKoscher);
		animalList.add(höhlenBär);
		animalList.add(höhlenSpinne);
		animalList.add(jaguar);
		animalList.add(kaiman);
		animalList.add(kalekkeM);
		animalList.add(kalekkeW);
		animalList.add(kamel);
		animalList.add(karen);
		animalList.add(khoramsBestie);
		animalList.add(khomGeier);
		animalList.add(kronenHirsch);
		animalList.add(koschKröte);
		animalList.add(kvillOtter);
		animalList.add(königsAdler);
		animalList.add(königsSkorpion);
		animalList.add(langMähne);
		animalList.add(luchs);
		animalList.add(mammut);
		animalList.add(maraskanPony);
		animalList.add(maraske);
		animalList.add(maulEsel_maulTier);
		animalList.add(moosAffe);
		animalList.add(morfu);
		animalList.add(mungo);
		animalList.add(mähnenWolf);
		animalList.add(nivesischer_SteppenHund);
		animalList.add(nordMähne);
		animalList.add(nuala);
		animalList.add(ongaloRind);
		animalList.add(onjaroBracke);
		animalList.add(orkPony);
		animalList.add(paaviPony);
		animalList.add(pailosWaran);
		animalList.add(palmViper);
		animalList.add(papagei);
		animalList.add(pardel);
		animalList.add(pfau);
		animalList.add(piranha);
		animalList.add(polarbär);
		animalList.add(qualle);
		animalList.add(rabe);
		animalList.add(kolkRabe);
		animalList.add(rahjaTänzer);
		animalList.add(ratte);
		animalList.add(reh);
		animalList.add(rempelkäfer);
		animalList.add(rennkuckuck);
		animalList.add(riesenAmöbe);
		animalList.add(riesenFledermaus);
		animalList.add(riesenHirschKäfer);
		animalList.add(riesenHundertfüßer);
		animalList.add(riesenLöffler);
		animalList.add(riesenSkorpion);
		animalList.add(rind);
		animalList.add(rochenWurm);
		animalList.add(rotFuchs);
		animalList.add(saguaraSpinne);
		animalList.add(sandLöwe);
		animalList.add(schaf);
		animalList.add(schakal);
		animalList.add(schattenLöwe);
		animalList.add(schattenRochen);
		animalList.add(scheunenKatze);
		animalList.add(diamantSchildkröte);
		animalList.add(boa);
		animalList.add(schlinger);
		animalList.add(schwan);
		animalList.add(schwarzBär);
		animalList.add(schwarzer_Olporter);
		animalList.add(schwarzKäfer);
		animalList.add(schwein);
		animalList.add(schädelEule);
		animalList.add(shadif);
		animalList.add(siebenWindLäufer);
		animalList.add(singVogel);
		animalList.add(smaragdNatter);
		animalList.add(sonnenLuchs);
		animalList.add(speiKobra);
		animalList.add(speiSpinne);
		animalList.add(schwarze_Witwe);
		animalList.add(steinAssel);
		animalList.add(stinkTier);
		animalList.add(Strauß);
		animalList.add(streifenDachs);
		animalList.add(streifenHai);
		animalList.add(sturmFalke);
		animalList.add(sumpfEgel);
		animalList.add(sumpfRanze);
		animalList.add(svellttaler_Kaltblut);
		animalList.add(säbelzahnTiger);
		animalList.add(taube);
		animalList.add(teshkaler);
		animalList.add(therengar_Terrier);
		animalList.add(tiger);
		animalList.add(todesHörnchen);
		animalList.add(tralloper_Riese);
		animalList.add(trollMops);
		animalList.add(tulamide);
		animalList.add(tuzaker);
		animalList.add(vampirFledermaus);
		animalList.add(vielfraß);
		animalList.add(vogelSpinne);
		animalList.add(wachHund);
		animalList.add(waldSpinne);
		animalList.add(waldWolf);
		animalList.add(warunker);
		animalList.add(wasserSchlange);
		animalList.add(wehrheimer_BlutHund);
		animalList.add(wildKatze);
		animalList.add(wildSchwein);
		animalList.add(winhaller_WolfsJäger);
		animalList.add(wolfsRatte);
		animalList.add(wollNashorn);
		animalList.add(würgeSchlange);
		animalList.add(yaquirTaler);
		animalList.add(ziege);
		animalList.add(zitterRochen);
		
		observableAnimalList.addAll(animalList);
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
