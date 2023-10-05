#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class Example${NAME} {
    private final String model = "${Model_Name}";
    private final String model2 = "${Model}";
    private final String model3 = "${Model.Name}";
}
