class Demo {
    
    // Overload by number of parameters
    int addition(int A, int B) {         // similar to Addition@2ii
        return A + B;
    }

    int addition(int A, int B, int C) {  // similar to Addition@3iii
        return A + B + C;
    }

    // Overload by data type
    double addition(double A, double B) { // similar to Addition@2dd
        return A + B;
    }

    // Overload by sequence of parameters
    double addition(int A, double B) {     // example of sequence
        return A + B;
    }

    double addition(double A, int B) {     // another sequence example
        return A + B;
    }
}

public class Program {
    public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println(obj.addition(10, 11));          // 21
        System.out.println(obj.addition(10.90, 11.99));    // 22.89
        System.out.println(obj.addition(10, 11, 20));      // 41
        System.out.println(obj.addition(10, 11.5));        // 21.5 (sequence)
        System.out.println(obj.addition(10.5, 11));        // 21.5 (sequence)
    }
}


/*

void Fun(int A, int B);             Fun@2ii
void Fun(int A, int B, int C);      Fun@3iii

void Fun(int A, int B);             Fun@2ii
void Fun(float A, float B);         Fun@2ff


void Fun(int A, float B, double C); Fun@3ifd
void Fun(double A, float B, int C); Fun@3dfi

void Fun(int A, int B);
int Fun(int A, int B);   
//You cannot overload a method if only the return type is different or if the signature is exactly the same.


int fun(int A, int B);
int fun(int A, int B); //  cannot do this
*/