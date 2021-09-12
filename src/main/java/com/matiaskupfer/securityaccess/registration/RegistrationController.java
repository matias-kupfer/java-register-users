package com.matiaskupfer.securityaccess.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        // we send the request which is the body of the request
        // to the service to register a new user
        // as seen above the url for this request is 'api/v1/registration
        // and send email with token
        return registrationService.register(request);
    }

    // Confirm the token
    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
