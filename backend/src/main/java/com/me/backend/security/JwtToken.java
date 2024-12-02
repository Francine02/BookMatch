package com.me.backend.security;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

@Service
public class JwtToken {
    @Value("${api.token.secret}")
    private String secretKey;

    public String generateToken(UserDetails userDetails) {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        return JWT.create()
                .withSubject(userDetails.getUsername())
                .withIssuedAt(new Date())
                .withExpiresAt(Date.from(LocalDateTime.now().plusHours(10)
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .sign(algorithm);
    }

    public String generateOAuth2Token(Authentication authentication) {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();

        String email = oAuth2User.getAttribute("email");

        return JWT.create()
                .withSubject(email)
                .withIssuedAt(new Date())
                .withExpiresAt(Date.from(LocalDateTime.now().plusHours(10)
                        .atZone(ZoneId.systemDefault()).toInstant()))
                .sign(algorithm);
    }

    public DecodedJWT verifyToken(String token) {
        Algorithm algorithm = Algorithm.HMAC256(secretKey);

        return JWT.require(algorithm)
                .build()
                .verify(token);
    }

    public Boolean validateToken(DecodedJWT decodedJWT, UserDetails userDetails) {
        final String username = decodedJWT.getSubject();
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(decodedJWT));
    }

    private boolean isTokenExpired(DecodedJWT decodedJWT) {
        Date expiration = decodedJWT.getExpiresAt();
        return expiration.before(new Date());
    }
}