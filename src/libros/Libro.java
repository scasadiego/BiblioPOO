package libros;

public interface Libro{
    String getName();
    void setName(String nombre);
    String getAuthor();
    void setAuthor(String autor);
    boolean getState();
    void setState(boolean estado);
    String getCategory();
    void setCategory(String categoria);
    int getID();
    void setID(int ID);
}
