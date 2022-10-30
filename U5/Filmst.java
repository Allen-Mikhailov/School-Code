public class Filmst {
    public static void main(String[] args) {
        // Create an array called watch that contains a list of 4 film objects
        // Initialize the values of each object in the array.
        Film[] watch = new Film[4];
        watch[0] = new Film("Shrek", 133, "PG");
        watch[1] = new Film("Road to Perdition", 117, "G");
        watch[2] = new Film("The Truth about Cats and Dogs", 93, "PG");
        watch[3] = new Film("Enigma", 114, "G");

        for (int i = 0; i < watch.length; i++)
        {
            watch[i].setLength((int) (watch[i].getLength()*1.1));
            watch[i].display();
        }
        
        int smallestIndex = 0;
        for (int i = 1; i < watch.length; i++)
        {
            if (watch[smallestIndex].getLength() > watch[i].getLength())
            smallestIndex = i;
        }

        System.out.println("And the shortest film is .....");
        watch[smallestIndex].display();
    }
}

class Film {
    String title;
    int length;
    String rating; // "G", "PG", "PG-13", "R"

    public Film(String sname, int min, String r) {
        title = sname;
        length = min;
        rating = r;
    }

    public void display() {
        System.out.println("Title: "+title);
        System.out.println("Length: "+length);
        System.out.println("rating: "+rating);
        System.out.println("_________________");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int len) {
        length = len;
    }
}