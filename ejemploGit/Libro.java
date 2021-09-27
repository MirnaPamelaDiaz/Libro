/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas*/

package Ejercicio_1;//NOMBRE DEL PAQUETE----------------------------------------
public class Libro {//NOMBRE DE LA CLASE----------------------------------------
//ATRIBUTOS:--------------------------------------------------------------------
    private int isbn;
    private String tittle;
    private String author;
    private int pages;
//CONSTRUCTOR-------------------------------------------------------------------

    public Libro(int isbn, String tittle, String author, int pages) {
        this.isbn = isbn;
        this.tittle = tittle;
        this.author = author;
        this.pages = pages;
    }

    public Libro() {
    }
//METODOS SETTER----------------------------------------------------------------

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
//METODOS GETTER----------------------------------------------------------------

    public int getIsbn() {
        return isbn;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
    
    

    

}
