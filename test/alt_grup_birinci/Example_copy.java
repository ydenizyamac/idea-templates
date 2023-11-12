
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME} {
    #if (${ENUM})
    enum MyEnum {
        VALUE1,
        VALUE2,
        VALUE3
    }
    #end
    private final String model = "${Model_Name}";
    private final String model2 = "${Model}";
    private final String model3 = "${Model.Name}";
    @Variable(enumType = MyEnum.class)
    private String myVariable;
}


