package libros;
public class LibroB implements Libro{
    private String name;
    private int ID;
    private boolean state=true;
    private String author;
    private String category="Libro";
    public LibroB(String name,String author,int ID){
        this.name=name;
        this.ID=ID;
        this.state=true;
        this.author=author;
    }
    public LibroB(){
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String getAuthor(){
        return this.author;
    }

    @Override
    public void setAuthor(String author){
        this.author=author;
    }

    @Override
    public boolean getState(){
        return this.state;
    }

    @Override
    public void setState(boolean state){
        this.state=state;
    }

    @Override
    public String getCategory(){
        return this.category;
    }
    
    @Override
    public void setCategory(String category){
        this.category=category;
    }

    @Override
    public int getID(){
        return this.ID;
    }

    @Override
    public void setID(int ID){
        this.ID=ID;
    }    
}