# :star: GoogleOTP :star:

## :rainbow: Description
### :key: OTP(One-Time Password, 일회용 비밀번호)란?
------
+ One-Time-Password의 약자
+ 로그인 할 때마다 1회성 비밀번호를 생성하는 보안 시스템

### :key: Google OTP란?
------
+ 구글에서 제공하는 OTP로, 안드로이드 기준 플레이스토어에 google OTP 검색이후 다운로드 사용 가능

### :key: TOTP(Time-based OTP, 시간 기반 OTP)란?
------
+ Time-based One Time Password 약자
+ 서버쪽에서 해당 알고리즘으로 생성한 KEY나 바코드를 OTP 기기 입력
+ KEY나 바코드를 기준으로 하여 30초~60초 마다 계쏙하여 새로운 일회용 비밀번호 생성
+ 생성된 일회용 비밀번호를 입력하여 서버로 전송하면 비밀번호가 맞는지 확인하는 방식

## :rainbow: 라이브러리
+ com.google.zxing :point_right: Qr이미지를 만들기 위한 라이브러리
+ commons-codec :point_right: 인코딩/디코딩 작업을 하기위한 라이브러리
+ com.warrenstrange/googleauth :point_right: 구글 OTP키 검증을 하기위한 라이브러리
+ dev.samstevens.totp :point_right: 보안을 위해 시간기반으로 비밀번호를 생성하도록 하기위한 라이브러리

## :rainbow: 개발 시기
+ 24.09.01 ~ 24.09.12
