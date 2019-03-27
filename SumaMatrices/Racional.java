import java.util.*;

public class Racional{
  // Declaramos 2 enteros, el numerador y el denominador
  private int num;
  private int den;
  Random rand = new Random();
  // Hacemos todos los constructores de Racionales posibles
  // Racional sin parámetros
  public Racional(){
    this(1,1);
  }

  // Racional con 2 enteros como parámetros
  public Racional(int x, int y){
    if((x == 0) || (y == 0)){
      // Se establecerá un valor arbitrario para el denominador (5) y un aleatorio para el numerador
      this.num = rand.nextInt(10);
      this.den = 5;
    } else {
      this.num = x;
      this.den = y;
    }
  }

  // Racional con otro Racional como parámetro
  public Racional(Racional R){
    this(R.num, R.den);
  }

  // MÉTODOS QUE TENDRÁ NUESTRA CLASE RACIONAL

  // Método que recibe 2 enteros o un Racional como parámetro y cambia el valor actual del Racional
  // Lo usaremos para guardar la respuesta del usuario y establecer el resultado deseado
  public void Establecer(int A, int B){
    num = A;
    den = B;
  }

  public void Establecer(Racional R){
    this.num = R.num;
    this.den = R.den;
  }

  // Método que compara 2 racionales, devuelve verdadero si la relacion es la misma
  // Ej: 2/5 == 10/25
  public boolean equals(Object R){
    Racional aux = (Racional)R; // Down Casting
    if(this.num*aux.den == this.den*aux.num){
      System.out.println((this.num*aux.den)+" == "+(this.den*aux.num));
      return true;
    }
    else{
      System.out.println((this.num*aux.den)+" =! "+(this.den*aux.num));
      return false;
    }
  }

  // Método que imprime la operacion con el siguiente formato: num / den {+,-,÷,*} num / den
  public void imprimir(Racional[] Elementos, int opc){
    switch(opc){
      case 1: // Suma
          System.out.println("La operacion a realizar es: ");
          System.out.println(Elementos[0].num + " / " + Elementos[0].den + " + " + Elementos[1].num + " / " + Elementos[1].den);
        break;
      case 2: // Resta
          System.out.println("La operacion a realizar es: ");
          System.out.println(Elementos[0].num + " / " + Elementos[0].den + " - " + Elementos[1].num + " / " + Elementos[1].den);
        break;
      case 3: // Multiplicacion
          System.out.println("La operacion a realizar es: ");
          System.out.println(Elementos[0].num + " / " + Elementos[0].den + " * " + Elementos[1].num + " / " + Elementos[1].den);
        break;
      case 4: // Division
          System.out.println("La operacion a realizar es: ");
          System.out.println(Elementos[0].num + " / " + Elementos[0].den + " ÷ " + Elementos[1].num + " / " + Elementos[1].den);
        break;
      default:
        break;
    }
  }

  public void imprimir(){
    System.out.println(num + " / " + den);
  }

  // Suma de 2 racionales
  public Racional sumaRacionales(Racional[] Elementos){
    if(Elementos[0].den == Elementos[1].den){
      this.num = Elementos[0].num + Elementos[1].num;
      this.den =  Elementos[0].den;
      return this;
    } else {
      this.num = Elementos[0].num*Elementos[1].den + Elementos[1].num*Elementos[0].den;
      this.den = Elementos[0].den * Elementos[1].den;
      return this;
    }
  }

  // Resta de 2 racionales
  public Racional restaRacionales(Racional[] Elementos){
    if(Elementos[0].den == Elementos[1].den){
      this.num = Elementos[0].num - Elementos[1].num;
      this.den = Elementos[0].den;
      return this;
    } else {
      this.num = Elementos[0].num*Elementos[1].den - Elementos[1].num*Elementos[0].den;
      this.den = Elementos[0].den * Elementos[1].den;
      return this;
    }
  }

  // Multiplicacion de 2 racionales
  public Racional multiRacionales(Racional[] Elementos){
    this.num = Elementos[0].num*Elementos[1].num;
    this.den = Elementos[0].den*Elementos[1].den;
    return this;
  }

  // Division de 2 racionales
  public Racional divRacionales(Racional[] Elementos){
    this.num = Elementos[0].num*Elementos[1].den;
    this.den = Elementos[0].den*Elementos[1].num;
    return this;
  }

  // Imprime los 2 racionales
  public void imprimeRacionales(Racional[] Elementos){
    System.out.println("Racional 1: ");
    Elementos[0].imprimir();
    System.out.println("Racional 2: ");
    Elementos[1].imprimir();
  }

  // Funcion que reduce el término actual a su mínima expresión
  public void Reducir(){
    for(int i = this.den-1; i > 1 ; i--){
      if(this.den%i == 0){
        if(this.num%i == 0){
          this.num = this.num/i;
          this.den = this.den/i;
          System.out.println("El término ha quedado reducido a su mínima expresion");
          System.out.println(this.num + " / " + this.den);
        } else {
          continue;
        }
      } else {
        continue;
      }
    }
  }
}
