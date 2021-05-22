package com.hardik.plutocracy.utils;

import java.time.LocalDateTime;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hardik.plutocracy.constant.BalanceModeType;
import com.hardik.plutocracy.constant.TicketType;

@Component
public class ResponseUtils {

	public ResponseEntity<?> pingResponse() {
		final var response = new JSONObject();
		response.put("message", "ping");
		response.put("timestamp", LocalDateTime.now().toString());
		return ResponseEntity.ok(response.toString());
	}

	public ResponseEntity<?> ticketTypeListResponse() {
		return ResponseEntity.ok(TicketType.values());
	}

	public ResponseEntity<?> balanceModeTypeListResponse() {
		return ResponseEntity.ok(BalanceModeType.values());
	}

	public ResponseEntity<?> userCreationSuccessResponse() {
		final var response = new JSONObject();
		response.put("status", "success");
		response.put("message", "Account Created Successfully, Now you can login with your credentials");
		response.put("timestamp", LocalDateTime.now().toString());
		return ResponseEntity.ok(response.toString());
	}

	public ResponseEntity<?> duplicateEmailIdResponse() {
		final var response = new JSONObject();
		response.put("status", "Failure");
		response.put("message", "Account Already Exists with the provided email-id");
		response.put("timestamp", LocalDateTime.now().toString());
		return ResponseEntity.ok(response.toString());
	}

	public ResponseEntity<?> invalidEmailIdResponse() {
		final var response = new JSONObject();
		response.put("message", "Invalid Email-id Provided, No Account Exists with the provided email-id");
		response.put("timestamp", LocalDateTime.now().toString());
		return ResponseEntity.ok(response.toString());
	}

	public ResponseEntity<?> loginSuccessResponse(final String jwtToken) {
		final var response = new JSONObject();
		response.put("message",
				"Login Successfull, Please use this provided JWT for authentication by using Authentication Bearer mechanism");
		response.put("JWT", jwtToken);
		response.put("timestamp", LocalDateTime.now().toString());
		return ResponseEntity.ok(response.toString());
	}

	public ResponseEntity<?> invalidPasswordResponse() {
		final var response = new JSONObject();
		response.put("message", "Incorrect Password Provided");
		response.put("timestamp", LocalDateTime.now().toString());
		return ResponseEntity.ok(response.toString());
	}

	public ResponseEntity<?> passwordUpdationSuccessResponse() {
		final var response = new JSONObject();
		response.put("message", "Password Changed Successfully");
		response.put("timestamp", LocalDateTime.now().toString());
		return ResponseEntity.ok(response.toString());
	}

}