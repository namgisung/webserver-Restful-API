package io.project.rest;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.ExpiredJwtException;

import javax.crypto.SecretKey;
import java.util.Date;

public class TokenUtil {
    // 비밀 키를 충분히 긴 문자열로 설정 (예: 32바이트 길이)
    private static final String SECRET_KEY = "12345678901234567890123456789012";

    // SecretKey 객체 생성
    private static final SecretKey SECRET_KEY_OBJ = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    // JWT 토큰 만료 시간 설정 (10분)
    private static final long EXPIRATION_TIME = 3 * 60 * 1000;

    // JWT 생성
    public static String generateToken(String userId) {
        Date expirationDate = new Date(System.currentTimeMillis() + EXPIRATION_TIME);
        return Jwts.builder()
                .setSubject(userId)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SECRET_KEY_OBJ, SignatureAlgorithm.HS256) // SecretKey 객체 사용
                .compact();
    }

    // JWT 파싱
    public static String parseToken(String token) {
        try {
            Claims claims = Jwts.parserBuilder() // 최신 방식으로 파서 빌더 사용
                    .setSigningKey(SECRET_KEY_OBJ) // SecretKey 객체 사용
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            return claims.getSubject();
        } catch (ExpiredJwtException e) {
            // 토큰이 만료된 경우 처리
            System.out.println("토큰이 만료되었습니다.");
            return null;
        }
    }
}
