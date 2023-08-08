#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
@FeignClient(name = "${FEIGN_NAME}", url = "${FEIGN_URL}")
public interface ${NAME} {
    
}