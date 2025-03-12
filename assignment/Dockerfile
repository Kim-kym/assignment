# 1. Java 17 기반 이미지 사용
FROM openjdk:17

# 2. 컨테이너 내부에서 실행할 디렉토리 설정
WORKDIR /app

# 3. 현재 디렉토리의 JAR 파일을 컨테이너 내부로 복사
COPY target/*.jar app.jar

# 4. Spring Boot 애플리케이션 실행
CMD ["java", "-jar", "app.jar"]
