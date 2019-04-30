public class ParameterInfo {
    private String fieldName;
    private String fieldType;
    private String defaultValue;

    public ParameterInfo(String fieldName, String fieldType) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    public ParameterInfo(String fieldName, String fieldType, String defaultValue) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.defaultValue = defaultValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String toString() {
        return "ParameterInfo{" +
                "fieldName='" + fieldName + '\'' +
                ", fieldType='" + fieldType + '\'' +
                ", defaultValue='" + defaultValue + '\'' +
                '}';
    }
}
