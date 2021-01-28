package extras.method_replacement;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ToStringReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        if(isToStringMethod(method)){
            return "Replaced toString()";
        }else{
            throw new IllegalArgumentException("Unable to reimplement method " + method.getName());
        }

    }

    private boolean isToStringMethod(Method method){
        if(method.getParameterTypes().length != 0) return false;
        if(!("toString".equals(method.getName()))) return false;
        if(method.getReturnType() != String.class) return false;
        return true;
    }

}
