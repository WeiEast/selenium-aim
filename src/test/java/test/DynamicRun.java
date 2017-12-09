package test;
import com.aimin.vo.User;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.MapContext;

public class DynamicRun {
    public static  void main(String[] arg) {
        String str= "a+b";
        JexlEngine jexl = new JexlEngine();
        org.apache.commons.jexl2.Expression e = jexl.createExpression(str);
        JexlContext jc = new MapContext();
        jc.set("a", 5);
        jc.set("b", 6);
        Object o = e.evaluate(jc);
        System.out.println(o);
    }
}
