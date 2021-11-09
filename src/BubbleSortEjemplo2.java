class Student {
    int age; //Variable de edad
    String name, id; //Variables string
    Student (int a, String n, String i) {
        age = a;
        name = n;
        id = i;
    }

    public String toString () {
        return (age + ", " + name + ", " + id);
    }
}

public class BubbleSortEjemplo2 {
    public static void main(String[] args) {
        Student lista[] = new Student[6], //Declaracion de lista
                tempValue;
        int i, j; //Declaracion de variables

        lista[0] = new Student(23, "Jose", "1111");
        lista[1] = new Student(43, "Maria", "2222");
        lista[2] = new Student(28, "Luis", "3333");
        lista[3] = new Student(32, "Juan", "4444");
        lista[4] = new Student(15, "Carmen", "5555");
        lista[5] = new Student(23, "Luisa", "6666");

        for (i = 0; i < lista.length - 1; i++) {
            System.out.println("Pass # " + (i + 1)); //Presentara los numeros del pase
            for (j = 0; j < lista.length - i - 1; j++) //El for loop que leera la lista y sus valores
            {
                if (lista[j].age > lista[j + 1].age) { //Condicion
                    System.out.println("Exchange " + lista[j] + "<->" + lista[j + 1]); //Presentara los valores que seran cambiados
                    tempValue = lista[j]; //Iniciando la variable temp
                    lista[j] = lista[j + 1];
                    lista[j + 1] = tempValue;
                }
            }
        }
        for (i = 0; i < lista.length; i++) { //For loop que leera la lista
            System.out.println(lista[i]); //Imprimira los valores de la lista
        }
        System.out.println("Orden descendiente: \n"); //Imprimira lo que hara el codigo
        for(i = lista.length - 1; i >= 0; i--) { //Ordenara los datos de forma descendente
            System.out.println(lista[i]); //Imprimira los datos de forma descendente
        }

    }
}
