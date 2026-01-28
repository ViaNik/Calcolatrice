import model.Expression;
import model.ExpressionException;

public class Main {
    static void main() {
        {
            //String inputExpr = "((5/8-1/8)^4-(2/11*22/3-1)^4)/(1/4+1/9)*6/5";  //risultato: 1/6
            String inputExpr = "(5^2/90*(2/5)^3/(2/5)^2+1/2*(1/3)^4/(1/3)^3)/((1+2/3-11/3^2)^2/(4/9))"; //risultato: 5/8
            //String inputExpr = "(2/3+2/6)^1+((3/5-1/10)^2/(1-1/3)^2)-(1/2+2/3)^0-(5/16)^5/(5/16)^4"; //risultato: 1/4

            //Expression espressione = new Expression(inputExpr);
            try {
                //espressione.risolvi();
                System.out.println(Expression.risolvi(inputExpr));
//                System.out.println(espressione.getInputExpr());
//                System.out.println(espressione.getTokenList());
//                System.out.println(espressione.getValidTokensList());
//                System.out.println(espressione.getRpnExpression());
//                System.out.println(espressione.getRisultato());
            } catch (ExpressionException ex) {
                System.out.println(ex.getMessage());
                System.out.println(ex.getMessageDetails());
            }
            catch(ArithmeticException ex){
                System.out.println(ex.getMessage());
            }
        }



    }
}
