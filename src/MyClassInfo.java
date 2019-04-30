import java.util.ArrayList;
import java.util.List;

public class MyClassInfo {
    private String className;
    private List<ParameterInfo> parameters;
    private boolean isChosenGetters;
    private boolean isChosenSetters;
    private boolean isChosenSingleton;

    public MyClassInfo()
    {
        parameters = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ParameterInfo> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterInfo> parameters) {
        this.parameters = parameters;
    }

    public boolean isChosenGetters() {
        return isChosenGetters;
    }

    public void setChosenGetters(boolean chosenGetters) {
        isChosenGetters = chosenGetters;
    }

    public boolean isChosenSetters() {
        return isChosenSetters;
    }

    public void setChosenSetters(boolean chosenSetters) {
        isChosenSetters = chosenSetters;
    }

    public boolean isChosenSingleton() {
        return isChosenSingleton;
    }

    public void setChosenSingleton(boolean chosenSingleton) {
        isChosenSingleton = chosenSingleton;
    }

    @Override
    public String toString() {
        return "MyClassInfo{" +
                "className='" + className + '\'' +
                ", parameters=" + parameters +
                ", isChosenGetters=" + isChosenGetters +
                ", isChosenSetters=" + isChosenSetters +
                ", isChosenSingleton=" + isChosenSingleton +
                '}';
    }


}
