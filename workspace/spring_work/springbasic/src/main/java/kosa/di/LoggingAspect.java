package kosa.di;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//공통관심사항
public class LoggingAspect {
	//핵심비즈니스 메서드 호출(insertService) -> 공통관심사항 호출(메서드 호출 시간을 측정)
	//타이머 작동 -> 메서드 호출(핵심 비즈니스) -> 타이머 종료 -> 시간 출력
	private Log log = LogFactory.getLog(getClass());
	
	//공통 관심 메서드 정의
	//내용 : 핵심 관심사항 메서드 호출시 시간을 측정하고 출력
	//advice : 핵심 메소드 호출 전, 핵심 메소드 호출 후(이전(공통)->핵심메소드->이후(공통)) -> around
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
		log.info("로그 시작");
		StopWatch stopWatch = new StopWatch();
		try {
			stopWatch.start();
			//핵심관심 메서드 호출 : WriteService insertService호출
			Object obj=joinPoint.proceed();//핵심 메소드 호출
			return obj;
			
		} catch (Exception e) {
			// TODO: handle exception
			//e.printStackTrace();
			throw e;
		}finally {
			stopWatch.stop();
			log.info("종료");
			log.info(joinPoint.getSignature().getName() +"메서드 실행시 : "+ stopWatch.getTotalTimeMillis());
		}
	}
}
