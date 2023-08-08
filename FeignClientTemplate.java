#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

#parse("File Header.java")
@FeignClient(name = "${Feign_Name}", url = "${Feign_Url}")
public interface ${NAME} {
    
}