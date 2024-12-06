package JavaPractice.ComparablevsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>{

    private String name;
    private double rating;
    private int year;


    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public Movie(String nm,double rt,int yr){
        this.name=nm;
        this.rating=rt;
        this.year=yr;
    }

    public double getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }    
    
}

//class to compare movies by ratings
class RatingCompare implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2){
        if(m1.getRating() < m2.getRating()){
            return -1;
        }
        else if(m1.getRating()> m2.getRating()){
            return 1;
        }else{
            return 0;
        }
    }
}

//class to compare movie by name
class NameCompare implements Comparator<Movie>{

    @Override
    public int compare(Movie m1, Movie m2) 
    {
        return m1.getName().compareTo(m2.getName());
    }
    
}



public class ComparatorInterfaceImplementation {

    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.5, 2015));
        list.add(new Movie("Star wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi",8.4,1983));

        //Sort by rating 
        System.out.println("***********Movies Sorted By Rating************");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list,ratingCompare);

        for(Movie movie : list){
            System.out.println(movie.getRating()+" "+movie.getName()+" "+movie.getYear());
        }

        //Sort by Name
        System.out.println("***********Movies Sorted By Name************");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list,nameCompare);

        for(Movie movie : list){
            System.out.println(movie.getName()+" "+movie.getRating()+" "+movie.getYear());
        }

        //Use Comparable to Sort By Year
        System.out.println("***********Movies Sorted By Year************");
        Collections.sort(list);

        for(Movie movie : list){
            System.out.println(movie.getYear()+" "+movie.getRating()+" "+movie.getName());
        }

    }
    
}




