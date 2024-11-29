package googleOtpUtilBackend;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base32;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorConfig;
import com.warrenstrange.googleauth.IGoogleAuthenticator;

import dev.samstevens.totp.code.HashingAlgorithm;
import dev.samstevens.totp.exceptions.QrGenerationException;
import dev.samstevens.totp.qr.QrData;
import dev.samstevens.totp.qr.QrGenerator;
import dev.samstevens.totp.qr.ZxingPngQrGenerator;

public class otpUtil {
	
	/*키 값 생성하기 위한 메소드*/
	public String getKeyGenerate() {
		String name = "otp";
		int randomNum = (int)(Math.random() * 90000) + 10000;
		String randomStr = Integer.toString(randomNum);
		
		String combinedKey = name + randomStr;
		byte[] filterKey = combinedKey.getBytes(StandardCharsets.UTF_8);
		
		Base32 codec = new Base32();
		byte[] encodedKey = codec.encode(filterKey);
		
		String secretKey = new String(encodedKey, StandardCharsets.UTF_8);
		return secretKey;
	}
	
	
	/*Qr이미지를 위한 바이트값 생성하기 위한 메소드*/
	public void getQrImg() throws QrGenerationException {
		QrData data = new QrData.Builder()
				.label("레이블 이름")
				.secret("scretKey 값")
				.algorithm(HashingAlgorithm.SHA1)
				.digits(6)
				.period(30)
				.build();
		
		QrGenerator qr = new ZxingPngQrGenerator();
		byte[] qrImg = qr.generate(data);
	}
	
	
	/*생성한 Key값과 TOTP값이 일치한지 확인하는 메소드*/
	public void getOtpAuth() {
		GoogleAuthenticatorConfig.GoogleAuthenticatorConfigBuilder builder = 
				new GoogleAuthenticatorConfig.GoogleAuthenticatorConfigBuilder();
		
		IGoogleAuthenticator auth = new GoogleAuthenticator(builder.build());
		/*생성한 키값, 사용자가 Qr이미지로 받은 TOTP값 */
		boolean result = auth.authorize("secretKey", 111111);
	}
}
