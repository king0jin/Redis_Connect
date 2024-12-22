# Spring Boot 프로젝트에서 Redis사용하기


## Spring Boot 프로젝트 생성
- 의존성 추가
  + SpringBoot DevTools
  + Redis
  + Web
  + Lombok

## Spring Boot 프로젝트 설정 : application.properties
+ redis.host=localhost
+ redis.port=6379

## Redis 설정 : RedisConfig Class
1. RedisConfig : redis 설정 정보를 넣고 스프링 컨테이너에 넣기위한 설정
2. redisTemplate : Service에서 redis에 데이터를 넣기위한 객체가 필요하는데, 이때 사용하기 위해 설정 및 등록
3.   + setKeySerializer, setValueSerializer 설정
       + 콘솔에서 key를 조회할 때 \xac\xed\x00\x05t\x00\x03sol 이렇게 조회 방지
      
## Service 생성 : RedisService Class
도메인 없이 간단하게 key:value 형식의 이름:나이 데이터를 받아 넣고 조회만 수행하기 위한 클래스

## Controller 생성 : MainController Class
단순히 Service 로직을 수행 : POST와 GET을 생성
---

# API 테스트 : PostMan
## Post TEST
![image](https://github.com/user-attachments/assets/12e4712b-11ba-4e45-a1c5-968374fcbcf1)


![image](https://github.com/user-attachments/assets/fff28310-d31d-4be8-b9d3-2804a88327ac)


## Get TEST
![image](https://github.com/user-attachments/assets/289924a0-8be7-46a4-b7df-88cae0718d0b)


![image](https://github.com/user-attachments/assets/d5e6e9c4-c493-4d28-bc33-95964d05b5f4)

