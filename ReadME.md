
# 메시지 국제화

## 목표
스프링부트 환경 프로젝트 메시지, 국제화처리 시 고려해야할 사항에 대해 검증(POC)

<br/><br/>

## POC 목록
 - 템플릿 엔진(Thymeleaf)에서의 메시지, 국제화 처리
 - Hibernate validation 사용 시 Errors 객체 메시지, 국제화 처리
 - ExceptionHandler(@ControllerAdvice)에서의 메시지, 국제화 처리
 - Javascript Ajax 통신(공통) 메시지, 국제화 처리
 - yml 기반 메시지, 국제화 기능 ON/OFF 설정
 - 쿠키 기반 Locale 설정

<br/><br/>

## 학습내용
### Locale miss match 
- 파라미터, 헤더로 전달받은 Locale의 메시지 코드가 없는경우, 현재 Locale의 메시지 코드로 탐색, 이마저도 없는 경우 기본 메시지로 반환 


<br/> <br/><br/><br/>

# Reference 
- [쿠키 기반 국제화 처리](https://velog.io/@haerong22/Springboot-%EC%BF%A0%ED%82%A4%EB%A5%BC-%EC%9D%B4%EC%9A%A9%ED%95%9C-%EB%8B%A4%EA%B5%AD%EC%96%B4-%EC%B2%98%EB%A6%AC-i18n)