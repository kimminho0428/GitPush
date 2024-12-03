package aws.carddemo.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
public class SessionInterceptor implements HandlerInterceptor {

  private static final String SESSION_KEY = "sessionId";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
      Object handler) {
    MDC.put(SESSION_KEY, request.getSession().getId());
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
      ModelAndView arg3) {
  }

  @Override
  public void afterCompletion(HttpServletRequest arg0,
      HttpServletResponse arg1, Object arg2, Exception arg3) {
    MDC.remove(SESSION_KEY);
  }
}
