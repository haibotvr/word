package com.simon.boot.word.framework.kits;

import com.simon.boot.word.framework.exception.ValidException;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class DataValidationUtil {

    public static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    public static Validator validator = factory.getValidator();

    public static <T> void validate(T bean){
        StringBuffer sb = new StringBuffer();
        try {
            if(null == bean){
                sb.append("校验的对象不能为null");
            } else {
                Set<ConstraintViolation<T>> constraintViolations = validator.validate(bean);
                for (ConstraintViolation<T> violation : constraintViolations) {
                    sb.append(violation.getPropertyPath()).append(":").append(violation.getMessage()).append(" ,");
                }
            }
        } catch (Exception e) {
            throw new ValidException(sb.toString());
        }
        if(!StringUtils.isEmpty(sb.toString())){
            throw new ValidException(sb.toString());
        }
    }

}
