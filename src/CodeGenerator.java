import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CodeGenerator {
    private static final String CLASS_SIGNATURE = "public class";
    private static final String NEW_LINE = "\n";
    private static final String TAB = "\t";
    private static final String SPACE = " ";
    private static final String OPENING_BRACKET = "{";
    private static final String CLOSING_BRACKET = "}";
    private static final String PRIVATE_MODIFIER = "private";
    private static final String PUBLIC_MODIFIER = "public";
    private static final String EQUALS = "=";
    private static final String SEMICOLON = ";";
    private static final String OPENING_ROUND_BRACKET = "(";
    private static final String CLOSING_ROUND_BRACKET = ")";
    private static final String VOID = "void";
    private static final String THIS = "this";
    private static final String GET = "get";
    private static final String SET = "set";
    private static final String DOT = ".";
    private static final String RETURN = "return";
    private static final String COMMA = ",";
    private static final String STATIC = "static";
    private static final String INSTANCE = "instance";
    private static final String GET_INSTANCE = "getInstance()";
    private static final String INSTANCE_CONDITION = "if(instance==null)";
    private static final String CREATE_INSTANCE = "instance=new";
    private static final String DEFAULT_PATH = System.getProperty("user.dir");
    private static final String SLASH = "/";
    private static final String JAVA_EXTENSTION = ".java";

    private MyClassInfo classInfo;
    private StringBuilder code;
    private List<ParameterInfo> fields;

    public CodeGenerator(MyClassInfo classInfo)
    {
        code = new StringBuilder();
        this.classInfo = classInfo;
        fields = classInfo.getParameters();

    }

    public String getGeneratedCode()
    {
        return code.toString();
    }

    public void generateClassCode()
    {
        generateClassSignature();
        generateInstanceVariables();
        if(classInfo.isChosenSingleton())
            generateSingleton();
        else
            generatePublicConstructor();
        if(classInfo.isChosenGetters())
            generateGetters();
        if(classInfo.isChosenSetters())
            generateSetters();
        generateClassEnd();
    }

    public void writeCodeToFile(String path) {
        BufferedWriter writer=null;
        try
        {
           writer = new BufferedWriter(new FileWriter(path+SLASH+classInfo.getClassName()+JAVA_EXTENSTION));
           writer.write(code.toString());
        }
        catch(IOException ex)
        {
            System.out.println("Path is not correct - file will be saved in your current directory ");
            try {
                writer = new BufferedWriter(new FileWriter(DEFAULT_PATH+SLASH+classInfo.getClassName()+JAVA_EXTENSTION));
                writer.write(code.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        finally
        {
            try{
                if(writer!=null)
                    writer.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }

    private void generateClassSignature()
    {
        String className = classInfo.getClassName();
        code.append(CLASS_SIGNATURE);
        code.append(SPACE);
        code.append(className);
        code.append(OPENING_BRACKET);
    }

    private void generateInstanceVariables()
    {
        for (ParameterInfo field: fields
             ) {
            code.append(NEW_LINE);
            code.append(TAB);
            generateInstanceVariable(field);
        }
    }

    private void generateGetters()
    {
        for(ParameterInfo field:fields)
        {
            generateGetter(field);
        }
    }
    private void generateSetters() {
        for(ParameterInfo field:fields)
        {
            generateSetter(field);
        }
    }

    private void generateSetter(ParameterInfo field) {
        String fieldName = field.getFieldName();
        String fieldType = field.getFieldType();
        code.append(NEW_LINE)
                .append(TAB)
                .append(PUBLIC_MODIFIER)
                .append(SPACE)
                .append(VOID)
                .append(SPACE)
                .append(SET)
                .append(getWordFromUpperCase(fieldName))
                .append(OPENING_ROUND_BRACKET)
                .append(fieldType)
                .append(SPACE)
                .append(fieldName)
                .append(CLOSING_ROUND_BRACKET)
                .append(OPENING_BRACKET)
                .append(NEW_LINE).append(TAB).append(TAB)
                .append(THIS).append(DOT).append(fieldName)
                .append(EQUALS).append(fieldName).append(SEMICOLON)
                .append(NEW_LINE).append(TAB).append(CLOSING_BRACKET);

    }

    private void generateGetter(ParameterInfo field) {
        String fieldName = field.getFieldName();
        String fieldType = field.getFieldType();
        code.append(NEW_LINE)
            .append(TAB)
            .append(PUBLIC_MODIFIER)
            .append(SPACE)
            .append(fieldType)
            .append(SPACE)
            .append(GET)
            .append(getWordFromUpperCase(fieldName)).append(OPENING_ROUND_BRACKET).append(CLOSING_ROUND_BRACKET)
            .append(OPENING_BRACKET)
            .append(NEW_LINE).append(TAB).append(TAB)
            .append(RETURN).append(SPACE)
            .append(fieldName).append(SEMICOLON)
                .append(NEW_LINE).append(TAB).append(CLOSING_BRACKET);
    }

    private String getWordFromUpperCase(String word)
    {
        if(word.length()<2)
            return word.toUpperCase();
        return word.substring(0,1).toUpperCase()+word.substring(1);
    }


    private void generateInstanceVariable(ParameterInfo field)
    {
        String fieldName = field.getFieldName();
        String fieldType = field.getFieldType();
        code.append(PRIVATE_MODIFIER);
        code.append(SPACE);
        code.append(fieldType);
        code.append(SPACE);
        code.append(fieldName);
        code.append(SEMICOLON);

    }

    private void generatePublicConstructor()//add different constructors
    {
        code.append(NEW_LINE)
                .append(TAB)
                .append(PUBLIC_MODIFIER)
                .append(SPACE)
                .append(classInfo.getClassName())
                .append(OPENING_ROUND_BRACKET);
        if(fields.size()==0) {
            code.append(CLOSING_ROUND_BRACKET);
            code.append(OPENING_BRACKET);
        }
        else
        {
            for (int i=0;i< fields.size()-1;i++){
                if(fields.get(i).getDefaultValue()==null)
                    code.append(fields.get(i).getFieldType()).append(SPACE).append(fields.get(i).getFieldName())
                    .append(COMMA).append(SPACE);
            }
            code.append(fields.get(fields.size()-1).getFieldType()).append(SPACE).append(fields.get(fields.size()-1).getFieldName());
            code.append(CLOSING_ROUND_BRACKET)
                .append(OPENING_BRACKET);
            for (ParameterInfo field: fields
                 ) {
                code.append(NEW_LINE).append(TAB).append(TAB);
                if(field.getDefaultValue()!=null) {
                    code.append(THIS).append(DOT).append(field.getFieldName()).append(EQUALS)
                    .append(field.getDefaultValue()).append(SEMICOLON);
                }
                else
                    code.append(THIS).append(DOT).append(field.getFieldName()).append(EQUALS).append(field.getFieldName()).append(SEMICOLON);

            }

        }
        code.append(NEW_LINE)
                .append(TAB)
                .append(CLOSING_BRACKET);
    }

    private void generateSingleton()
    {
        generateSingletonInstanceSignature();
        generatePrivateConstructor();
        generateGetInstance();
    }

    private void generateGetInstance() {
        code.append(NEW_LINE).append(TAB)
                .append(PUBLIC_MODIFIER)
                .append(SPACE)
                .append(STATIC)
                .append(SPACE)
                .append(classInfo.getClassName())
                .append(SPACE)
                .append(GET_INSTANCE)
                .append(OPENING_BRACKET)
                .append(NEW_LINE).append(TAB).append(TAB)
                .append(INSTANCE_CONDITION)
                .append(NEW_LINE).append(TAB).append(TAB).append(TAB)
                .append(CREATE_INSTANCE)
                .append(SPACE)
                .append(classInfo.getClassName()).append(OPENING_ROUND_BRACKET).append(CLOSING_ROUND_BRACKET).append(SEMICOLON)
                .append(NEW_LINE).append(TAB).append(TAB)
                .append(RETURN).append(SPACE).append(INSTANCE).append(SEMICOLON)
                .append(NEW_LINE).append(TAB).append(CLOSING_BRACKET);
    }

    private void generatePrivateConstructor() {
        code.append(NEW_LINE).append(TAB)
                .append(PRIVATE_MODIFIER).append(SPACE)
                .append(classInfo.getClassName()).append(OPENING_ROUND_BRACKET).append(CLOSING_ROUND_BRACKET)
                .append(OPENING_BRACKET);
        for (ParameterInfo field: fields
             ) {
            if(field.getDefaultValue()!=null)
            {
                code.append(NEW_LINE).append(TAB).append(TAB);
                code.append(THIS).append(DOT).append(field.getFieldName()).append(EQUALS).append(field.getDefaultValue()).append(SEMICOLON);
            }
        }
        code.append(NEW_LINE).append(TAB).append(CLOSING_BRACKET);

    }

    private void generateSingletonInstanceSignature() {
        code.append(NEW_LINE);
        code.append(TAB);
        code.append(PRIVATE_MODIFIER)
                .append(SPACE)
                .append(STATIC)
                .append(SPACE)
                .append(classInfo.getClassName())
                .append(SPACE)
                .append(INSTANCE)
                .append(EQUALS)
                .append(GET_INSTANCE)
                .append(SEMICOLON);
    }

    private void generateClassEnd()
    {
        code.append(NEW_LINE);
        code.append(CLOSING_BRACKET);
    }




}
