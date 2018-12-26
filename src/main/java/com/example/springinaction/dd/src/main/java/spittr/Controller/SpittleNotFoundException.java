package spittr.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,
                reason = "Spittle Not Found")
// 用ResponseStatus注解将异常映射为特定的状态码
public class SpittleNotFoundException extends RuntimeException {
}
