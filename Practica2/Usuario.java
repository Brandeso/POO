import java.util.*;


public class Usuario{
  public static void main(String [] args){
    boolean continuar = true;
    ArrayList<Student> StudentList = new ArrayList<Student>();
    Scanner read = new Scanner(System.in);
    String aux;
    System.out.println("¡Bienvenido! Introduzca los datos del primer alumno: ");
    do{
      System.out.println("Introduzca el nombre del alumno: ");
      aux = read.nextLine();
      StudentList.add(new Student(aux));
      System.out.println("¿Desea contitnuar? Y/N ");
      aux = read.nextLine();
      if((aux.charAt(0)=='y')||(aux.charAt(0)=='Y')){
        continuar = true;
      } else {
        continuar = false;
      }
    }while(continuar);

    System.out.println("¿Desea imprimir el nombre los alumnos registrados? Y/N");
    aux = read.nextLine();
    if((aux.charAt(0)=='y')||(aux.charAt(0)=='Y')){
      for(Student S : StudentList){
        S.printName();
      }
    } else {
      System.out.println("Gracias por usar nuestro programa");
    }

  }
}
