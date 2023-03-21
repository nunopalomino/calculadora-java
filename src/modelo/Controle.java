package modelo;

public class Controle
{
    public String numero1;
    public String numero2;
    public String operacao;
    public String resultado;
    
    public void executar()
    {
        Validacao validar = new Validacao();
        validar.numero1 = this.numero1;
        validar.numero2 = this.numero2;
        validar.operacao = this.operacao;
        validar.validar();
        
        if (validar.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            calculos.num1 = validar.num1;
            calculos.num2 = validar.num2;
            calculos.operacao = operacao;
            calculos.calcular();
            
            resultado = calculos.resultado.toString();
        }
        else
        {
            resultado = validar.mensagem;
        }
    }
}
