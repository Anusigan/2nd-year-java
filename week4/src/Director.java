public class Director {
    private String name;
    private String surname;
    private int numdirectedmovie;
    private String dob;

    public Director(String james, String cameron){

    }

    public String getName() {
        return name;
    }



    public String getSurname() {
        return surname;
    }



    public int getNumdirectedmovie() {
        return numdirectedmovie;
    }

    public void setNumdirectedmovie(int numdirectedmovie) {
        this.numdirectedmovie = numdirectedmovie;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(Date date) {
        this.dob = date.toString();
    }
}
