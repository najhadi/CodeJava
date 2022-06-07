package Modele;

import java.util.Comparator;

public class ArticleComparateur implements Comparator<Article> {
    @Override
    public int compare(Article o1, Article o2) {
        if(o1.getPrix()<o2.getPrix())
        {System.out.println("llok");
            return 1;

        } else if (o1.getPrix()>o2.getPrix())
        {
            return 1;
        } else return 0;
    }
}
