public class Main {
  public static void main(String[] args) {
    MyGenerics<String> myString = new MyGenerics<String>("deu boa");
    System.out.println(myString.getDado());

    MyGenerics<Integer> myInteger = new MyGenerics<Integer>(2684168);
    System.out.println(myInteger.getDado());

    MyGenerics<Pessoa> myPerson = new MyGenerics<Pessoa>(new Pessoa("Navestelar", 19, "Pesquisadora"));
    System.out.println(myPerson.getDado());
  }
}