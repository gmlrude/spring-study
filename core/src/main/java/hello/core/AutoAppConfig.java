package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
/**
 * 컴포넌트 스캔을 사용하면 @Configuration이 붙은 설정 정보도 자동으로 등록되기 때문에 앞서 만들었던 설정 정보도 함께 등록된다. 이를 해결 하기 위해
 * excludeFilters를 이용하여 설정 정보는 컴포넌트 스캔 대상에서 제외. -> 실무에선 컴포넌트 스캔 대상에서 제외하지 않음
 */
public class AutoAppConfig {

}