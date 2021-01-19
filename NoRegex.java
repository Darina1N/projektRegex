package sk.kosickaakademia.regex;

public class NoRegex {
    public boolean isValidSPZ(String text){
        if(text==null)//ak mi niekto nezada spz tak to beriem tiez ako chybove lebo taka spz nie je
            return false;

        text = text.toUpperCase().trim();//to trim mi spraví to že mi zmaže medzery pred a za textom

        if(text.length()!=7){
            return false;
        }
        for(int i=0;i<=1;i++)//kontrola na prve 2 znaky ci su pismena bud takto alebo cez ascii co mam nizsie
            if(!Character.isLetter(text.charAt(i)))
                return false;

        /*if(text.charAt(0) < 65 && text.charAt(0) > 90){
            return false;
        }
        if(text.charAt(1) < 65 && text.charAt(1) > 90){
            return false;
        }*/

        for(int i=2;i<=6;i++)//kontrola dalsích znakov ci to su cisla alebo pismena nic ine
            if(!Character.isLetterOrDigit(text.charAt(i)))
                return false;

        return true;
    }
}
