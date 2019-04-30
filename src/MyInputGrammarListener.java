import gen.JavaGrammarBaseListener;
import gen.JavaGrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

public class MyInputGrammarListener extends JavaGrammarBaseListener {
    private MyClassInfo classInfo;

    @Override public void enterPrule(JavaGrammarParser.PruleContext ctx) {
        super.enterPrule(ctx);
        classInfo = new MyClassInfo();
        List<TerminalNode> className = ctx.getTokens(JavaGrammarParser.ClassName);
        List<TerminalNode> fields = ctx.getTokens(JavaGrammarParser.Parameter);
        List<TerminalNode> isGetSet = ctx.getTokens(JavaGrammarParser.GS);
        List<TerminalNode> isSingleton = ctx.getTokens(JavaGrammarParser.Singleton);

        if(className.isEmpty()||isGetSet.isEmpty()||isSingleton.isEmpty())
            return;

        List<ParameterInfo> parameters = getParameters(fields);
        boolean isGettersChosen = false;
        boolean isSettersChosen = false;
        String gs = isGetSet.get(0).getText();
        if(gs.equals("g"))
            isGettersChosen = true;
        else if(gs.equals("s"))
            isSettersChosen = true;
        else if(gs.equals("gs"))
        {
            isGettersChosen=true;
            isSettersChosen=true;
        }
        classInfo.setClassName(className.get(0).getText());
        classInfo.setParameters(parameters);
        classInfo.setChosenGetters(isGettersChosen);
        classInfo.setChosenSetters(isSettersChosen);
        classInfo.setChosenSingleton(isSingleton.get(0).getText().equals("singl"));

    }

    private List<ParameterInfo> getParameters(List<TerminalNode> fields)
    {
        List<ParameterInfo> parameters = new ArrayList<>();
        for(TerminalNode node: fields)
        {
            String[] params = node.getText().split("\\s+");
            String[] paramPlusDefault=params[0].split("=");
            ParameterInfo parameterInfo;
            if(paramPlusDefault.length>1)
            {
                String[] paramInfo = paramPlusDefault[0].split(":");
                 parameterInfo= new ParameterInfo(paramInfo[0],paramInfo[1],paramPlusDefault[1]);

            }
            else
            {
                String[] paramInfo = params[0].split(":");
                parameterInfo = new ParameterInfo(paramInfo[0],paramInfo[1]);
            }

            parameters.add(parameterInfo);
        }
        return parameters;
    }


    public MyClassInfo getClassInfo() {
        return classInfo;
    }

}
