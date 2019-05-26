package hackathon.vivo.ProgrammingTheater.Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {

    public static String encrypt(String plainText){
        String cipherText = "";

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(plainText.getBytes());
            byte[] bytebuffer = messageDigest.digest();
            StringBuffer strHexString = new StringBuffer();
            for (int i = 0; i < bytebuffer.length; i ++){
                String hex = Integer.toHexString(0xff & bytebuffer[i]);
                if (hex.length() == 1){
                    strHexString.append('0');
                }
                strHexString.append(hex);
            }
            // 得到返回結果
            cipherText = strHexString.toString();
        } catch (NoSuchAlgorithmException e){
            return "";
        } finally {
            return cipherText;
        }
    }
}
