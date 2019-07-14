package com.simon.boot.word.framework.kits;

import com.simon.boot.word.framework.exception.BusinessException;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author simon.wei
 */
public class BeanProcessUtil {

    public static Map<String, String> transBean2Map(Object obj, Map<String, String> map) throws Exception {
        //实体类不能为空
        if (obj == null) {
            return map;
        }
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (!key.equals("class")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(obj);
                    map.put(key, value == null ? "" : value.toString());
                }

            }
        } catch (Exception e) {
            throw new Exception("将实体类转换成Map过程异常");
        }
        return map;

    }

    public static void copy(Object source, Object dest) throws BusinessException {

        try {
            // 获取属性
            BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(), Object.class);
            PropertyDescriptor[] sourceProperty = sourceBean.getPropertyDescriptors();

            BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(), Object.class);
            PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();

            for (int i = 0; i < sourceProperty.length; i++) {

                for (int j = 0; j < destProperty.length; j++) {

                    if (sourceProperty[i].getName().equals(destProperty[j].getName())
                            && sourceProperty[i].getPropertyType().equals(destProperty[j].getPropertyType())) {
                        // 调用source的getter方法和dest的setter方法
                        destProperty[j].getWriteMethod().invoke(dest, sourceProperty[i].getReadMethod().invoke(source));
                        break;
                    }
                }
            }
        } catch (Exception e) {
            throw new BusinessException(0, "属性复制失败:" + e.getMessage());
        }
    }
}
