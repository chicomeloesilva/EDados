public class Square {
    // Desenha uma linha de n caracteres onde:
    // - o primeiro e o último caracteres são o caracter da variável 'a'
    // - todos os outros caracteres são o caracter da variável 'b'
    static void line(char a, char b, int n) {
	System.out.print(a);
	for (int i=1; i<=n-2; i++)
	    System.out.print(b);
	System.out.println(a);
    }

    static void linealt(char a, char b, int n) {
  int z=0;
	System.out.print(a);
	for (int i=1; i<=n-2; i++)
	    System.out.print(b);
	System.out.println(a);

    }
    // O procedimento executado inicialmente é sempre o main
    public static void main(String[] args) {

	     line('*','-',6);
       for (int z=1; z<=4;z++)
       line('|','.',6);
       line('*','-',6);
    }
}
