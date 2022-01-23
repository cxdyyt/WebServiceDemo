package com.interview.bank.jwt;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;

public class JwtGenerateAndValidate {

    /**
     * Expired time
     */
    private static final long EXPIRE_TIME = 100 * 60 * 1000;

    /**
     * Jwt secret
     */
    private static final String SECRET = "jwt_secret";

    /**
     * Generate token, will be expired in ten minutes
     * 
     * @param userId
     * @return
     */
    public static String generate(String userId) {
        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            return JWT.create().withAudience(userId).withExpiresAt(date).sign(algorithm);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * validate token
     * 
     * @param token
     * @return
     */
    public static boolean checkSign(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (JWTVerificationException exception) {
            throw new InvalidTokenException("Invalid token");
        }
    }

    public static void main(String args[]) {
        System.out.println(generate("sa"));

    }
}