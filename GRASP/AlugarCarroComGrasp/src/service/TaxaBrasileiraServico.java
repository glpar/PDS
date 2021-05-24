package service;

public class TaxaBrasileiraServico implements TaxaServico{

    public double taxa(double pagamento){
        if(pagamento <= 100.0){
            return pagamento * 0.2;
        }else{
            return pagamento * 0.15;
        }
    }
}
