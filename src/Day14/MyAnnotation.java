package Day14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})//表示用在方法和类型上
@Retention(RetentionPolicy.SOURCE)
//@Deprecated
public @interface MyAnnotation {
}
