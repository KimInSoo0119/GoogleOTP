# GoogleOTP

## Description
### OTP란?
------
+ One-Time-Password의 약자
+ 로그인 할 때마다 1회성 비밀번호를 생성하는 보안 시스템

### Google OTP란?
------
+ 구글에서 제공하는 OTP로, 안드로이드 기준 플레이스토어에 google OTP 검색이후 다운로드 사용 가능

### TOTP란?
------
+ Time-based One Time Password 약자
+ 서버쪽에서 해당 알고리즘으로 생성한 KEY나 바코드를 OTP 기기 입력
+ KEY나 바코드를 기준으로 하여 30초~60초 마다 계쏙하여 새로운 일회용 비밀번호 생성
+ 생성된 일회용 비밀번호를 입력하여 서버로 전송하면 비밀번호가 맞는지 확인하는 방식

## 라이브러리
+ com.google.zxing
+ dev.samstevens.totp

## 개발 시기
+ 24.09.01 ~ 24.09.12
