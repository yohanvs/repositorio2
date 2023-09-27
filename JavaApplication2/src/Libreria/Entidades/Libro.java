package Libreria.Entidades;

public class Libro {
    
    private String titulo;
    private String isbn;
    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String titulo, String isbn, String autor, int numPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }

    
    
}
