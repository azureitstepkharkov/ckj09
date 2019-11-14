
package customannotationinjava;
//для использованя
import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

@CustomAnnotation(dateOfBirth = "1980-06-25")
public class CustomAnnoteteClass {
    
}
