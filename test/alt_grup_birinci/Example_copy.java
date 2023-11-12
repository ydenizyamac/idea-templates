#set ($EnumValuesExample = ["VALUE1", "VALUE2", "VALUE3"])
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class Example${NAME} {
    private final String model = "${Model_Name}";
    private final String model2 = "${Model}";
    private final String model3 = "${Model.Name}";
    private final String model4 = $EnumValuesExample;
    private final String model5 = "$EnumValuesExample";
}
