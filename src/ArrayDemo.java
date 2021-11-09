class StackByArray { //Declarando la clase
        String array[]; int capacity, top; //Las variables que usaremos

    StackByArray(int c) { //Declaramos el objeto
        capacity = c; //iniciando las variables
        array = new String[capacity]; //iniciando el array
        top = 0;
    }

    boolean isEmpty() {
        return (top == 0);
    } //Declarando el boolean

    boolean isFull() {
        return (top == capacity);
    } //Declarando el segundo boolean

    void push (String value) { //Declarando el objeto
        if(!isFull()) { //Donde comienza la condicion
            array[top] = value;
            top++;
        }
    }

    String pop() { //Otro Objeto
        if (!isFull()) { //Comienza la condicion
            return array[--top]; //Declaramos lo que retornara
        } else {
            return array[top];
        }
    }

    public String toString() { //Otro Objeto
        String tempStr; //Variables
        tempStr = "Top = " + top + "\n"; //iniciando variables
        for (int i = top - 1; i >= 0; i--) { //Declarando el for loop
            tempStr = tempStr + array[i] + "\n";
        }
        return tempStr;
    }
}

public class ArrayDemo { //Declarando otra clase
    public static void main(String[] args) {
        StackByArray myStack = new StackByArray(5); //Inciando variables
        String tempValue;

        myStack.push("Toyota Corolla, 2011"); //El primer valor
        myStack.push("Toyota Rav4, 2006"); //El segundo valor
        myStack.push("Toyota Camry, 2000"); //El tercer valor
        System.out.println(myStack); //Imprimira la pantalla

        while (!myStack.isEmpty()) { //El loop por si esta vacio e arreglo
            tempValue = myStack.pop();
            System.out.println(myStack);
        }
        }
    }
