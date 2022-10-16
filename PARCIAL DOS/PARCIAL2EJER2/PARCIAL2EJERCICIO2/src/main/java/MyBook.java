import java.util.Scanner;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}


class myBookClass extends Book {

    public myBookClass() {
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    
    
    
}


public class MyBook{
        public static void main(String[]args){
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Escribe el titulo de un libro:");
                String title=sc.nextLine();
                myBookClass new_novel=new myBookClass();
                new_novel.setTitle(title);
                System.out.println("El Titulo es: "+"'"+new_novel.getTitle()+"'");
            }
        }
}