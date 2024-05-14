import java.util.ArrayList;
    public class Test {
        public static void main(String[] args) {
            ArrayList <Movie> movies=new ArrayList<>();
            System.out.println(movies.isEmpty());
            System.out.println(movies.size());
            movies.add(new Movie(5,2003,"hello"));
            System.out.println(movies.size());
            movies.add(new Movie(5,2003,"hello"));
            movies.add(new Movie(8,2004,"world"));
            for (Movie temp:movies)
                System.out.print(temp);
            movies.remove(new Movie(5,2003,"hello"));
            movies.set(0,new Movie(6,2009,"hell"));
            for (Movie temp:movies)
                System.out.print(temp);
            for (Movie temp:movies)
                temp.setRating(temp.getRating() + 1);









        }
}
