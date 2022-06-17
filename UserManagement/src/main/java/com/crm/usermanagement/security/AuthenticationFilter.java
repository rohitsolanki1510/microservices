package com.crm.usermanagement.security;

public class AuthenticationFilter /*extends UsernamePasswordAuthenticationFilter*/ {
	/*@Autowired
	UserLoginService UserLoginService;
	
	@Autowired
	Environment env;
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		
		try {
			LoginRequest loginReq=new ObjectMapper().readValue(request.getInputStream(),LoginRequest.class);
			return getAuthenticationManager().authenticate(new UsernamePasswordAuthenticationToken(
					loginReq.getUserName(),	loginReq.getPassword(),new ArrayList<>()
					));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
		
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {

		String username=((User)authResult.getPrincipal()).getUsername();
		
		//USer
		
		String token =Jwts.builder().
				setSubject(username).
				setExpiration(new Date(System.currentTimeMillis()+10000000)).
				signWith(SignatureAlgorithm.HS512, "kombdikombdi").
				compact();
		
		response.addHeader("Token", token);
		response.addHeader("UserID", username);
		
	}

	
	
	
	
	
	*/
}
