public class Test {
    public static void main(String[] args)
    {
        MyClassInfo classInfo = InputManager.manageInput();
        if(classInfo!=null) {
            CodeGenerator codeGenerator = new CodeGenerator(classInfo);
            codeGenerator.generateClassCode();
            System.out.println(codeGenerator.getGeneratedCode());
            codeGenerator.writeCodeToFile("sth");
        }
    }
}
