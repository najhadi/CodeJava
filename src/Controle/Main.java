package Controle;

import Modele.Article;
import Modele.ArticleComparateur;

import java.util.Set;
import java.util.TreeSet;
public class Main

{

    public static void main(String[] args)

    { Set <Article> monSet = new TreeSet<>(new ArticleComparateur());
        monSet.add(new Article("livre",12,12.34));
        monSet.add(new Article("livre2",15,15.34));
        monSet.add(new Article("livre3",18,18.34));
        System.out.println("Elements du TreeSet = " + monSet);
    }

}
