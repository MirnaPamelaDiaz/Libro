
package Ejercicio_1;

import javax.swing.JOptionPane;

public class Eje1_Main {
    public static void main(String[] args) {
        int isbn;
        String tittle;
        String author;
        int pages;
        
        Libro l1 = new Libro();
        
        isbn = Integer.parseInt(JOptionPane.showInputDialog("ingrese el ISBN del libro: "));
        l1.setIsbn(isbn);
        System.out.println("ISBN: "+l1.getIsbn());//  JOptionPane.showMessageDialog(null,"ISBN"+l1.getIsbn());
        
        tittle = JOptionPane.showInputDialog("Ingrese el titulo del libro: ");
        l1.setTittle(tittle);
        System.out.println("Titulo: "+l1.getTittle());
        
        author = JOptionPane.showInputDialog("Ingrese el nombre del autor: ");
        l1.setAuthor(author);
        System.out.println("Autor: "+l1.getAuthor());
        
        pages=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de paginas: "));
        l1.setPages(pages);
        System.out.println("Cantidad de paginas: "+l1.getPages());
        
    }
 
    
            

}
