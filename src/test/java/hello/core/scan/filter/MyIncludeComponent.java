package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 클래스에 붙음..
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
