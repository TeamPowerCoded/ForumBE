package com.forum.capstone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartUpRunner implements CommandLineRunner {

	// @Autowired
	// private UserMapper;

	// @Autowired
	// private EmailService;

	@Override
	public void run(String... strings) throws Exception {
		// System.out.println("StartUpRunner!");
		// User user = this.userMapper.findById(1L);
		// System.out.println(user.getRolesSet());
		// for(String str : user.getRolesSet()) {
		// System.out.println(str);
		// }

		// String subject = "Congrats!！";
		// String message = "This email is to validate your registration。";
		//
		// SimpleMailMessage email = new SimpleMailMessage();
		// email.setFrom("teampowercoded@forum.com");
		// email.setTo("weicee@yehey.com");
		// email.setSubject(subject);
		// email.setText(message );
		// javaMailSender.send(email);
		// System.out.println("finished sending email");

		// VerificationToken token = new VerificationToken(null, null);
		// token.calculateExpiryDate(System.currentTimeMillis());
	}
}