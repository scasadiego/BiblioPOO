package libros;

public class Periodico implements Libro {
    private String name;
    private int ID;
    private boolean state=true;
    private String author;
    private String category="Periodico";
    public Periodico(String name,String author,int ID,boolean state){
        this.name=name;
        this.ID=ID;
        this.state=state;
        this.author=author;
    }
    public Periodico(){
    }
    
    @Override
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String getAuthor(){
        return this.author;
    }


    public void setAuthor(String author){
        this.author=author;
    }

    @Override
    public boolean getState(){
        return this.state;
    }


    public void setState(boolean state){
        this.state=state;
    }

    @Override
    public String getCategory(){
        return this.category;
    }
    

    public void setCategory(String category){
        this.category=category;
    }

    @Override
    public int getID(){
        return this.ID;
    }


    public void setID(int ID){
        this.ID=ID;
    }    
}

