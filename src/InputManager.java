import gen.JavaGrammarLexer;
import gen.JavaGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Scanner;

public class InputManager {
    public static MyClassInfo manageInput()
    {
        MyClassInfo myClassInfo;
        Scanner scanner = new Scanner(System.in);
        try{
            String line = scanner.nextLine();
            myClassInfo = parseInput(line);
            return myClassInfo;
        }
        catch(WrongGrammarException ex)
        {
            System.out.println("Grammar incorrect - do you want to try again? [Y]-yes, other-no");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("Y"))
                return manageInput();
            else
                return null;
        }
    }

    private static MyClassInfo parseInput(String input)throws WrongGrammarException
    {
//        String testString = "create Klasa param:int gs";
        JavaGrammarLexer lexer = new JavaGrammarLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaGrammarParser parser = new JavaGrammarParser(tokens);
        ParseTree tree = parser.prule();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyInputGrammarListener listener = new MyInputGrammarListener();

        walker.walk(listener, tree);
        MyClassInfo entry = listener.getClassInfo();
        System.out.println(parser.getNumberOfSyntaxErrors());
        if (parser.getNumberOfSyntaxErrors() > 0){
            throw new WrongGrammarException();
        }
        return entry;
    }

    private static class WrongGrammarException extends Throwable {

    }
}
