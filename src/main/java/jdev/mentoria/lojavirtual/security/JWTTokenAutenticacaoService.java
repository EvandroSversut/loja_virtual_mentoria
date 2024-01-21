package jdev.mentoria.lojavirtual.security;

import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/*pode ser @component tbem*/
/*funcao desta classe = criar e retornar autenticacao JTW*/
@Service
@Component
public class JWTTokenAutenticacaoService {

	/*token de validade de 11 dias*/
	private static final long EXPIRATION_TIME = 959990000;
	
	/*pode ser qq coisa - esta é a chave de seguranca da empresa*/
	private static final String SECRET = "ssfdgs_gklsl@llls125@@**";
	
	private static final String TOKEN_PREFIX = "Bearer";
	
	private static final String HEADER_STRING = "Authorization";
	
	public void addAuthentication(HttpServletResponse response, String username) throws Exception {
		
		/*gera o token*/
		String JWT = Jwts.builder()
				.setSubject(username)
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SECRET).compact();
		
		String token = TOKEN_PREFIX + " " + JWT;
		
		response.addHeader(HEADER_STRING, token);
		
		response.getWriter().write("{\"Authorization\": \"" + token + "\"}");
		
		
	}
}
 