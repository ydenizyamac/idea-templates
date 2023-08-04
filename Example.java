#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class Example${NAME} {
    private final String model = "${Model_Name}";
}
