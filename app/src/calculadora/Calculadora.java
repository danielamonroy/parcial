package calculadora;
import static java.lang.Math.tan;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Calculadora {

double num1,s;
public double seno(){
    s=sin(num1);
    return s;
}
public double coseno(){
    s= cos(num1);
    return s;
}
public double tangente (){
    s = tan(num1);
    return s ;

}
public double sec(){
    s=1/(cos(num1));
    return s;
}
public double csc(){
    s= 1/(sin(num1));
    return s;
}
public double cotangente (){
    s = 1/(tan(num1));
    return s ;

}

}