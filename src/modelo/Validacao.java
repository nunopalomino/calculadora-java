package modelo;

public class Validacao
{
    public String numero1;
    public String numero2;
    public String operacao;
    public Double num1;
    public Double num2;
    public String mensagem;
    
    public void validar()
    {
        mensagem = "";
        try
        {
            num1 = Double.valueOf(numero1);
            num2 = Double.valueOf(numero2);
            if (operacao.equals("/") && num2 == 0)
                mensagem = "Impossivel dividir por zero";
        }
        catch (NumberFormatException e)
        {
            mensagem = "Erro de conversão";
        }
        
    }
}
