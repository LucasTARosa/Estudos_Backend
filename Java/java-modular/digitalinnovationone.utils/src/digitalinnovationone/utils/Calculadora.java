package digitalinnovationone.utils;

import digitalinnovationone.utils.interno.DivHelper;
import digitalinnovationone.utils.interno.MultiHelper;
import digitalinnovationone.utils.interno.SubHelper;
import digitalinnovationone.utils.interno.SumHelper;

public class Calculadora {

    private DivHelper diviHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        diviHelper = new DivHelper();
        multiHelper = new MultiHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();


    }
    public int sum(int a, int b){
        return sumHelper.execute(a, b);

    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);

    }

    public int multi(int a, int b){
        return multiHelper.execute(a, b);

    }

    public int div(int a, int b){
        return diviHelper.execute(a, b);

    }
}
