package modelo;

public class Calculos
{
    public Double num1;
    public Double num2;
    public String operacao;
    public Double resultado;
    
    public void calcular()
    {
        switch (operacao)
        {
            case "+" -> resultado = num1+num2;
            case "-" -> resultado = num1-num2;
            case "*" -> resultado = num1*num2;
            case "/" -> resultado = num1/num2;
        }
    }
}
