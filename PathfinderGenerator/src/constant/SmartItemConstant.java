package constant;

import smartItem.SmartItemCommunication;
import smartItem.SmartItemDedicatePower;
import smartItem.SmartItemPlan;
import smartItem.SmartItemSkill;
import smartItem.SmartItemStat;
import utility.Data;
import utility.Tuple;

/**
 * Donne les tableau de drop des atouts d'objet intelligent.
 * @author Mentra20
 *
 */
public class SmartItemConstant {

	//Tableau pour determiner l'alignement de l'objet
	public static Data<String> alignement(){
		Data<String> res = new Data<String>();
		
		res.add(new Tuple<String, Integer>("Chaotique Bon", 10));
		res.add(new Tuple<String, Integer>("Chaotique Neutre", 10));
		res.add(new Tuple<String, Integer>("Chaotique Mauvais", 15));
		res.add(new Tuple<String, Integer>("Neutre Mauvais", 10));
		res.add(new Tuple<String, Integer>("Loyal Mauvais", 10));
		res.add(new Tuple<String, Integer>("Loyal Bon", 15));
		res.add(new Tuple<String, Integer>("Loyal Neutre", 10));
		res.add(new Tuple<String, Integer>("Neutre Bon", 10));
		res.add(new Tuple<String, Integer>("Neutre", 10));
		
		return res;
	}
	
	//Tableau pour determiner les statistiques de l'objet (fait � la main)
	public static Data<SmartItemStat> statistics(){
		Data<SmartItemStat> res = new Data<SmartItemStat>();
		
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(10, 0, 0), 20));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(11, 200, 0), 14));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(12, 500, 1), 13));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(13, 700, 1), 11));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(14, 1000, 2), 9));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(15, 1400, 2), 8));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(16, 2000, 3), 7));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(17, 2800, 3), 6));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(18, 4000, 4), 5));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(19, 5200, 4), 4));
		res.add(new Tuple<SmartItemStat, Integer>(new SmartItemStat(20, 8000, 5), 3));
		
		return res;
	}
	
	//Tableau pour determiner les capacit� de communication de l'objet (fait � la main)
	public static Data<SmartItemCommunication> communicationCapacity(){
		Data<SmartItemCommunication> res = new Data<SmartItemCommunication>();
		
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Parole", 500, 0), 18));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("T�l�pathie", 1000, 1), 12));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Sens (18m)", 500, 0), 15));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Sens (36m)", 1000, 0), 12));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Vision dans le noir", 500, 0), 14));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Vision aveugle", 5000, 1), 8));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Lecture des langages	", 1000, 1), 11));
		res.add(new Tuple<SmartItemCommunication, Integer>(new SmartItemCommunication("Lecture de la magie", 2000, 1), 10));
		
		return res;
	}
	
	//Tableau pour determiner les pouvoirs de l'objet 
	public static Data<SmartItemSkill> powerList(){
		Data<SmartItemSkill> res = new Data<SmartItemSkill>();
		
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 0, � volont�", 1000, 1), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 1, 3/jour", 1200, 1), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer aura magique sur lui � volont�", 2000, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 2, 1/jour", 2400, 1), 10));	
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet a 5 rangs dans une comp�tence", 2500, 1), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut g�n�rer des membres pour se d�placer � une vitesse de 3 m", 5000, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 3, 1/jour", 6000, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 2, 3/jour", 7200, 1), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet a 10 rangs dans une comp�tence", 10000, 2), 10));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut adopter une forme diff�rente de la m�me taille", 10000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut voler (comme avec vol), � une vitesse de 9 m", 1000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 4, 1/jour", 11200, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut se t�l�porter (comme avec t�l�portation), 1/jour", 15000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 3, 3/jour", 18000, 2), 5));
		res.add(new Tuple<SmartItemSkill, Integer>(new SmartItemSkill("L�objet peut lancer un sort de niveau 4, 3/jour", 33600, 2), 5));

		return res;
	}
	
	//Tableau pour determiner les desseins de l'objet 
	public static Data<SmartItemPlan> planList(){
		Data<SmartItemPlan> res = new Data<SmartItemPlan>();
		
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les individus d�alignement diam�tralement oppos�", 2), 20));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les lanceurs de sorts profanes (y compris les monstres capables de lancer des sorts ou d�utiliser des pouvoirs magiques)", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les lanceurs de sorts divins (y compris les entit�s divines et leurs serviteurs)", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer toutes les cr�atures qui ne savent pas lancer de sorts", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer un type particulier de cr�ature", 2), 5));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer une race ou une esp�ce de cr�ature", 2), 5));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("D�fendre une race ou une esp�ce particuli�re de cr�ature", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer les serviteurs d�une divinit� particuli�re", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("D�fendre les serviteurs et les int�r�ts d�une divinit� particuli�re", 2), 10));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Vaincre/tuer tout le monde (sauf l�objet et son propri�taire)", 2), 5));
		res.add(new Tuple<SmartItemPlan, Integer>(new SmartItemPlan("Choisissez un dessein", 2), 5));
		
		return res;
	}
	
	//Tableau pour determiner les pouvoirs de desseins de l'objet 
	public static Data<SmartItemDedicatePower> dedicatePowerList(){
		Data<SmartItemDedicatePower> res = new Data<SmartItemDedicatePower>();
		
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L�objet peut d�tecter les ennemis de son dessein � 18 m",10000, 1), 20));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L�objet peut utiliser un sort de niveau 4, � volont�",56000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("Le propri�taire gagne un bonus de chance de +2 aux jets d�attaque, de sauvegarde et aux tests",80000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L�objet peut lancer un sort de niveau 5, � volont�",90000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L�objet peut lancer un sort de niveau 6, � volont�",132000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L�objet peut lancer un sort de niveau 7, � volont�",182000, 2), 15));
		res.add(new Tuple<SmartItemDedicatePower, Integer>(new SmartItemDedicatePower("L�objet peut lancer r�surrection supr�me sur son propri�taire, 1/mois",200000, 2), 5));
		
		return res;
	}
	
	//Tableau pour determiner les traits de l'objet 
	public static Data<String> traitList(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("Toujours d�accord avec tout le monde et change tout le temps d�avis", 1));
		res.add(new Tuple<String, Integer>("Tr�s bruyant en pr�sence de tr�sors", 1));
		res.add(new Tuple<String, Integer>("Agit de fa�on myst�rieuse et r�pond toujours avec po�sie", 1));
		res.add(new Tuple<String, Integer>("N�aime pas les inconnus", 1));
		res.add(new Tuple<String, Integer>("Aime parier par principe sur des choses anodines", 1));
		res.add(new Tuple<String, Integer>("Parle de lui � la troisi�me personne", 1));
		res.add(new Tuple<String, Integer>("N�gocie l�utilisation de certains de ses pouvoirs", 1));
		res.add(new Tuple<String, Integer>("Demande toujours quel est le go�t et l�odeur des choses", 1));
		res.add(new Tuple<String, Integer>("Se met � hurler d�s qu�il est excit�", 1));
		res.add(new Tuple<String, Integer>("Monsieur je-sais-tout", 1));
		res.add(new Tuple<String, Integer>("Poli mais visiblement hypocrite", 1));
		res.add(new Tuple<String, Integer>("Tic verbal : s�excuse tout le temps", 1));
		res.add(new Tuple<String, Integer>("Lance beaucoup de menaces en l�air", 1));
		res.add(new Tuple<String, Integer>("Tr�s suave, conseille aux gens d�aborder le succ�s comme l��chec avec philosophie", 1));
		res.add(new Tuple<String, Integer>("Parle aussi peu que possible", 1));
		res.add(new Tuple<String, Integer>("Ricane ou �clate de rire devant le malheur des autres", 1));
		res.add(new Tuple<String, Integer>("Se trompe syst�matiquement de nom quand il parle � quelqu�un", 1));
		res.add(new Tuple<String, Integer>("Prie tout le temps", 1));
		res.add(new Tuple<String, Integer>("F�licite toujours tout le monde, m�me pour de petites choses", 1));
		res.add(new Tuple<String, Integer>("Toujours surpris et l�g�rement offens� quand on s�adresse � lui", 1));
		res.add(new Tuple<String, Integer>("N�aime pas prendre de d�cision", 1));
		res.add(new Tuple<String, Integer>("A une liste de r�gles ou de maximes pour diverses situations et les cite d�s que l�occasion se pr�sente", 1));
		res.add(new Tuple<String, Integer>("Explique aux gens les raisons � r�elles � de leurs actes", 1));
		res.add(new Tuple<String, Integer>("Demande des avis ou des opinions sur des situations hautement improbables", 1));
		res.add(new Tuple<String, Integer>("Utilise un langage tr�s formel, n�emploie jamais de contractions et privil�gie les mots grandiloquents", 1));
		res.add(new Tuple<String, Integer>("Se laisse facilement distraire par des �v�nements mineurs", 1));
		res.add(new Tuple<String, Integer>("A toujours besoin de quelqu�un pour lui expliquer les blagues ou les m�taphores", 1));
		res.add(new Tuple<String, Integer>("A une croyance particuli�re, plut�t �trange, et regarde le monde � la lumi�re de cette opinion", 1));
		res.add(new Tuple<String, Integer>("Aime compter les choses et adore les nombres", 1));
		res.add(new Tuple<String, Integer>("Essaye toujours de trouve un compromis", 1));
		res.add(new Tuple<String, Integer>("Toujours en train de se parler � lui-m�me", 1));
		res.add(new Tuple<String, Integer>("Tr�s mauvais menteur", 1));
		res.add(new Tuple<String, Integer>("Pose des questions impolies sans se rendre compte qu�il offense son interlocuteur", 1));
		res.add(new Tuple<String, Integer>("Grommelle et se plaint de sa forme et des risques qu�il prend", 1));
		res.add(new Tuple<String, Integer>("Tr�s sensible � la critique ou aux conflits", 1));
		res.add(new Tuple<String, Integer>("�tourdi", 1));
		res.add(new Tuple<String, Integer>("Accuse un certain type de cr�ature d��tre � l�origine de ses ennuis", 1));
		res.add(new Tuple<String, Integer>("Tyran intellectuel", 1));
		res.add(new Tuple<String, Integer>("Fait des allusions � des �v�nements historiques ou mythologiques sans les expliquer", 1));
		res.add(new Tuple<String, Integer>("D�teste un type d�environnement et se plaint d�s qu�il s�y trouve", 1));
		res.add(new Tuple<String, Integer>("Pose tout le temps des questions sur ce qui se trouve en dehors de son champ de vision", 1));
		res.add(new Tuple<String, Integer>("Fait tous les jours une liste de ce que son propri�taire doit faire", 1));
		res.add(new Tuple<String, Integer>("Incapable de garder un secret", 1));
		res.add(new Tuple<String, Integer>("L�g�rement surpris quand quelqu�un a une bonne id�e ou fait quelque chose de productif", 1));
		res.add(new Tuple<String, Integer>("Pleurniche tout le temps", 1));
		res.add(new Tuple<String, Integer>("Se met facilement en col�re", 1));
		res.add(new Tuple<String, Integer>("Lance sans cesse des avertissements sur les dangers des maladies", 1));
		res.add(new Tuple<String, Integer>("A une phrase f�tiche", 1));
		res.add(new Tuple<String, Integer>("Murmure un mot qui rime avec le dernier mot de la phrase", 1));
		res.add(new Tuple<String, Integer>("Adore les jeux de mots", 1));
		res.add(new Tuple<String, Integer>("Fait des bruits d�animaux quand il est excit� ou se sent menac�", 1));
		res.add(new Tuple<String, Integer>("Amoureux de po�sie et de litt�rature, il ne rate jamais une occasion de faire une tirade ou deux, en vers ou en prose", 1));
		res.add(new Tuple<String, Integer>("Tr�s superstitieux", 1));
		res.add(new Tuple<String, Integer>("Pousse son propri�taire � agir de mani�re t�m�raire", 1));
		res.add(new Tuple<String, Integer>("N�utilise jamais un seul mot quand il peut en placer dix", 1));
		res.add(new Tuple<String, Integer>("Demande sans cesse qu�on le d�truise mais panique si on le prend au s�rieux", 1));
		res.add(new Tuple<String, Integer>("A toujours une bonne explication pour signifier que quelque chose ne marchera pas", 1));
		res.add(new Tuple<String, Integer>("Pr�tend �tre amoureux de son propri�taire", 1));
		res.add(new Tuple<String, Integer>("Raconte des histoires ennuyeuses � propos de choses banales", 1));
		res.add(new Tuple<String, Integer>("A toujours des suggestions � faire pour rendre les choses � plus dr�les et plus int�ressantes �", 1));
		res.add(new Tuple<String, Integer>("Apprend des mots dans des langues qu�il ne conna�t pas et les utilise � la place de mots sa langue principale", 1));
		res.add(new Tuple<String, Integer>("Adore son propri�taire", 1));
		res.add(new Tuple<String, Integer>("Ignore souvent son propri�taire", 1));
		res.add(new Tuple<String, Integer>("Se m�prise", 1));
		res.add(new Tuple<String, Integer>("Chante parfois des comptines exasp�rantes", 1));
		res.add(new Tuple<String, Integer>("Se comporte comme si son propri�taire �tait son ami mais, � l��vidence, il le d�teste", 1));
		res.add(new Tuple<String, Integer>("M�prise ouvertement les religions organis�es et pense que tous les dieux sont des menteurs �go�stes", 1));
		res.add(new Tuple<String, Integer>("De plus en plus furieux et d�termin� � chaque revers de fortune", 1));
		res.add(new Tuple<String, Integer>("Croit que la plupart des objets sont intelligents", 1));
		res.add(new Tuple<String, Integer>("N�a aucune �chelle de valeur morale quand il dresse des plans et propose souvent des solutions horrifiantes � des probl�mes mineurs", 1));
		res.add(new Tuple<String, Integer>("Reste muet et refuse de parler � qui que ce soit pendant des jours", 1));
		res.add(new Tuple<String, Integer>("Croit qu�il devient fou", 1));
		res.add(new Tuple<String, Integer>("Cite constamment le nom d�un de ses anciens propri�taires qui �tait tr�s c�l�bre", 1));
		res.add(new Tuple<String, Integer>("A une syntaxe et une diction catastrophiques", 1));
		res.add(new Tuple<String, Integer>("N�en a jamais assez d�apprendre de nouvelles choses", 1));
		res.add(new Tuple<String, Integer>("Se plaint d�odeurs que personne d�autres ne remarque", 1));
		res.add(new Tuple<String, Integer>("Veut qu�on le trempe dans de la bi�re, du vin ou un autre alcool et se comporte ensuite comme s�il �tait saoul", 1));
		res.add(new Tuple<String, Integer>("Adore chanter mais n�a absolument pas l�oreille musicale", 1));
		res.add(new Tuple<String, Integer>("Tient les autres pour responsables de ses malheurs", 1));
		res.add(new Tuple<String, Integer>("Intarissable moulin � rumeurs qui invente la plupart des d�tails", 1));
		res.add(new Tuple<String, Integer>("Consid�re les autres comme des �tres � l�intelligence inf�rieure", 1));
		res.add(new Tuple<String, Integer>("Toujours enjou�, tente de remonter le moral d�autrui avec des chants, des blagues et des histoires passionnantes", 1));
		res.add(new Tuple<String, Integer>("Plus les choses empirent, plus il est d�tendu, et vice-versa", 1));
		res.add(new Tuple<String, Integer>("Se souvient toujours de travers", 1));
		res.add(new Tuple<String, Integer>("Invente des histoires", 1));
		res.add(new Tuple<String, Integer>("�vite de parler � quelqu�un d�autre que son propri�taire", 1));
		res.add(new Tuple<String, Integer>("A toujours besoin d�attention", 1));
		res.add(new Tuple<String, Integer>("Est un peu perturb� quand il n�est pas avec son propri�taire", 1));
		res.add(new Tuple<String, Integer>("Interroge les autres sur leur pass�, pour savoir s�ils � conviennent �", 1));
		res.add(new Tuple<String, Integer>("Est perplexe quant aux actions d�autrui et demande souvent une explication � leurs actes", 1));
		res.add(new Tuple<String, Integer>("Tr�s jaloux et tr�s possessif vis � vis de son propri�taire", 1));
		res.add(new Tuple<String, Integer>("Mentionne sans cesse une bataille � laquelle il a particip� et dit que rien n�est comparable", 1));
		res.add(new Tuple<String, Integer>("Diagnostique une manie, une obsession ou une mal�diction chez tout le monde mais se trompe souvent", 1));
		res.add(new Tuple<String, Integer>("Explique des choses simples qui n�ont pas besoin d�explication", 1));
		res.add(new Tuple<String, Integer>("Voudrait �tre lib�r� de son enveloppe d�objet et cherche quelqu�un pour accomplir cette t�che", 1));
		res.add(new Tuple<String, Integer>("Pense �tre un dieu emprisonn�", 1));
		res.add(new Tuple<String, Integer>("A un ami �th�r� imaginaire", 1));
		res.add(new Tuple<String, Integer>("A peur du noir", 1));
		res.add(new Tuple<String, Integer>("Sermonne les gens qui disent des insanit�s", 1));
		res.add(new Tuple<String, Integer>("Parle peu mais �met souvent des petits ricanements d�ments", 1));
		
		return res;
	}
}



